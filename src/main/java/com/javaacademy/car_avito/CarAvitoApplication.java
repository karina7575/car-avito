package com.javaacademy.car_avito;

import com.javaacademy.car_avito.announcement.Announcement;
import com.javaacademy.car_avito.service.AnnouncementStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CarAvitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarAvitoApplication.class, args);
	}


}
