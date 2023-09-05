package com.project.demo.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.Model.Booking;
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByHotelId(Long hotelId);
}
