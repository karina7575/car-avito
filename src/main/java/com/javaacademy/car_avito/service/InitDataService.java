package com.javaacademy.car_avito.service;
import com.javaacademy.car_avito.announcement.Announcement;
import com.javaacademy.car_avito.components.Brand;
import com.javaacademy.car_avito.components.Color;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
@Profile("test")
@RequiredArgsConstructor
public class InitDataService {
    private final AnnouncementStorage announcementStorage;

    @PostConstruct
    public void init() {
        createAd(Brand.LADA, Color.WHITE, BigDecimal.valueOf(400_000));
        createAd(Brand.TOYOTA, Color.BLACK, BigDecimal.valueOf(2_000_000));
        createAd(Brand.DAEWOO, Color.YELLOW, BigDecimal.valueOf(1_500_000));
    }

    private Announcement createAd(Brand brand, Color color, BigDecimal price) {
        return Announcement.builder()
                .brand(brand)
                .color(color)
                .price(price)
                .build();
    }
}
