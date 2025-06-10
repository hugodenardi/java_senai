package com.example.hotel.HotelManagement.repository;

import com.example.hotel.HotelManagement.model.Quartos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartosRepository extends JpaRepository<Quartos, Long> {
}
