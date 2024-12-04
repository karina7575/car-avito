package com.javaacademy.car_avito.announcement;

import com.javaacademy.car_avito.components.Brand;
import com.javaacademy.car_avito.components.Color;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class Announcement {
    private Integer id;
    private Brand brand;
    private Color color;
    private BigDecimal price;
}
