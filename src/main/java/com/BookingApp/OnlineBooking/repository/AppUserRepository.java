package com.BookingApp.OnlineBooking.repository;


import com.BookingApp.OnlineBooking.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    Optional<AppUser> findByEmail(String email);

}
