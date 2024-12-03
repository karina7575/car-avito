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
//		AnnouncementStorage storage = new AnnouncementStorage();
//		Announcement ann1 = new Announcement();
//		ann1.setBrand("toyota");
//		ann1.setColor("white");
//		ann1.setPrice(BigDecimal.valueOf(300000));
//		storage.save(ann1);
//
//		Announcement ann2 = new Announcement();
//		ann2.setBrand("toyota");
//		ann2.setColor("yellow");
//		ann2.setPrice(BigDecimal.valueOf(300000));
//		storage.save(ann2);
//
//		Announcement ann3 = new Announcement();
//		ann3.setBrand("mazda");
//		ann3.setColor("black");
//		ann3.setPrice(BigDecimal.valueOf(3009000));
//		storage.save(ann3);
//
//		System.out.println(storage.getAllByBrand("toyota").toString());
	}


}
