package com.javaacademy.car_avito.announcement;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Announcement {
    private Integer id;
    private String brand;
    private String color;
    private BigDecimal price;
}
