package com.example.DataInsert.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.DataInsert.Bean.Booking;

public interface BookingRepository extends CrudRepository<Booking, String> {

}
