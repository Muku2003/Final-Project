package com.project.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.project.demo.Model.Hotel;
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
}