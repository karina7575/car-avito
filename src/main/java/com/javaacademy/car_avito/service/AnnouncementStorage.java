package com.javaacademy.car_avito.service;

import com.javaacademy.car_avito.announcement.Announcement;
import com.javaacademy.car_avito.components.Brand;
import com.javaacademy.car_avito.components.Color;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class AnnouncementStorage {
    private final Map<Integer, Announcement> data = new HashMap<>();
    private Integer count = 0;

    public void save(Announcement announcement) {
        count++;
        announcement.setId(count);
        data.put(count, announcement);
    }

    public Optional<Announcement> getById(Integer id) {
        return Optional.ofNullable(data.get(id));
    }

    /*
    Получение всех объявлений
    */
    public List<Announcement> getAll() {
        return data.values().stream().toList();
    }

    /*
    Удаление объявлений по id
    */
    public boolean deleteById(Integer id) {
        return data.remove(id) != null;
    }

    /*
    Получение всех объявлений по бренду
     */
    public List<Announcement> getAllByBrand(Brand brand) {
        return data.values().stream().filter((e) -> e.getBrand().equals(brand)).toList();
    }

    /*
    Поиск объявлений по параметрам
    */
    public List<Announcement> getfilter(Optional<Brand> brand,
                                        Optional<Color> color,
                                        Optional<BigDecimal> price) {
        return data.values().stream()
                .filter((e) -> e.getBrand().equals(brand.orElse(e.getBrand())))
                .filter((e) -> e.getColor().equals(color.orElse(e.getColor())))
                .filter((e) -> e.getPrice().equals(price.orElse(e.getPrice())))
                .toList();
    }
}
