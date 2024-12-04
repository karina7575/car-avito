package com.javaacademy.car_avito;

import com.javaacademy.car_avito.announcement.Announcement;
import com.javaacademy.car_avito.components.Brand;
import com.javaacademy.car_avito.components.Color;
import com.javaacademy.car_avito.service.AnnouncementStorage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/announcement")
public class Controller {
    private final AnnouncementStorage announcementStorage;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void saveAnnouncement(@RequestBody Announcement announcement) {
        log.info(announcement.toString());
        announcementStorage.save(announcement);
    }

    @GetMapping("/{id}")
    public Announcement getAnnouncementById(@PathVariable Integer id) {
        return announcementStorage.getById(id).orElseThrow();
    }

    @GetMapping
    public List<Announcement> getAllAnnouncement() {
        return announcementStorage.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteAnnouncementById(@PathVariable Integer id) {
        announcementStorage.deleteById(id);
    }

    @GetMapping("/brand-search")
    public List<Announcement> getAllAnnouncementByBrand(@RequestParam Brand brand) {
        return announcementStorage.getAllByBrand(brand);
    }

    @GetMapping("/search")
    public List<Announcement> getParametrizedAnnouncement(@RequestParam(required = false) Optional<Brand> brand,
                                                          @RequestParam(required = false) Optional<Color> color,
                                                          @RequestParam(required = false) Optional<BigDecimal> price) {
        return announcementStorage.getfilter(brand, color, price);
    }
}
