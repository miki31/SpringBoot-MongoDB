package com.example.demo.db;

import com.example.demo.model.Address;
import com.example.demo.model.Hotel;
import com.example.demo.model.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DbSeeder implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("Marichka", 10, true),
                        new Review("John", 8, false),
                        new Review("Miki", 9, true),
                        new Review("Jeck", 3, true),
                        new Review("Gomes", 5, false),
                        new Review("Lili", 1, true)
                )

        );

        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address("Bucharest", "Romania"),
                Arrays.asList(
                        new Review("Teddy", 10, true),
                        new Review("Lex", 8, false),
                        new Review("Vik", 9, true),
                        new Review("Smith", 3, true),
                        new Review("Roof", 5, false),
                        new Review("Root", 1, true)
                )

        );

        Hotel sofitel = new Hotel(
                "Sofitel",
                330,
                new Address("Kyiv", "Ukraine"),
                Arrays.asList(
                        new Review("Marry", 6, true),
                        new Review("Ira", 4, true),
                        new Review("Tanya", 7, false)
                )

        );

        Hotel i_f = new Hotel(
                "I-F",
                490,
                new Address("Ivano_Frankivsk", "Ukraine"),
                new ArrayList<>()

        );
    }
}
