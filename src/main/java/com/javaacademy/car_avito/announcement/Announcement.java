package com.javaacademy.car_avito.announcement;

import com.javaacademy.car_avito.components.Brand;
import com.javaacademy.car_avito.components.Color;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class Announcement {
    private UUID id;
    private Brand brand;
    private Color color;
    private BigDecimal price;
}
