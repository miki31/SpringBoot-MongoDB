package com.example.demo.controller;

import com.example.demo.model.Hotel;
import com.example.demo.repository.HotelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll() {
        List<Hotel> hotels = this.hotelRepository.findAll();

        return hotels;
    }

    //create new object in DB
    @PutMapping
    public void insert(@RequestBody Hotel hotel) {
        this.hotelRepository.insert(hotel);
    }

    //update object by ID
    @PostMapping
    public void update(@RequestBody Hotel hotel) {
        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.hotelRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Hotel getById(@PathVariable("id") String id) {
        Optional<Hotel> hotel = this.hotelRepository.findById(id);
        return hotel.get();
    }

    @GetMapping("/maxPrice/{maxPrice}")
    public List<Hotel> getByPricePernight(@PathVariable("maxPrice") int maxPrice) {
        List<Hotel> hotels = this.hotelRepository.findByPricePerNightLessThan(maxPrice);
        return hotels;
    }

    @GetMapping("/address/{city}")
    public List<Hotel> getByCity(@PathVariable("city") String city) {
        List<Hotel> hotels = this.hotelRepository.findByCity(city);
        return hotels;
    }
}
