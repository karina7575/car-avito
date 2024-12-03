package com.javaacademy.car_avito;

import com.javaacademy.car_avito.announcement.Announcement;
import com.javaacademy.car_avito.service.AnnouncementStorage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List <Announcement> getAllAnnouncement() {
        return announcementStorage.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteAnnouncementById(@PathVariable Integer id) {
        announcementStorage.deleteById(id);
    }

    @GetMapping("/brand-search")
    public List <Announcement> getAllAnnouncementByBrand(@RequestParam String brand) {
        return announcementStorage.getAllByBrand(brand);
    }

}
