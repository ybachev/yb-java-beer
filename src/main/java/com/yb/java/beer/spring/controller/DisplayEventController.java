package com.yb.java.beer.spring.controller;

import com.yb.java.beer.spring.model.DisplayEvent;
import com.yb.java.beer.spring.model.Event;
import com.yb.java.beer.spring.service.DisplayEventService;
import com.yb.java.beer.spring.service.DisplayEventServiceTmp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yavor bachev
 * @since 0.1
 */
@RestController
public class DisplayEventController {

    private DisplayEventService displayEventService;

    private DisplayEventServiceTmp displayEventServiceTmp;

    public DisplayEventController(DisplayEventService displayEventService, DisplayEventServiceTmp displayEventServiceTmp) {
        this.displayEventService = displayEventService;
        this.displayEventServiceTmp = displayEventServiceTmp;
    }

    @GetMapping("/events")
    Iterable<DisplayEvent> getAllEvents() {
        return displayEventService.list();
    }

    @GetMapping("/events/{id}")
    DisplayEvent getEventById(@PathVariable String id) {
        return displayEventService.findById(id);
    }

    @GetMapping("/events-tmp/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    Event getEventByIdTmp(@PathVariable String id) {
        return displayEventServiceTmp.findById(id);
    }

    @GetMapping("/events-tmp")
    @CrossOrigin(origins = "http://localhost:4200")
    Iterable<Event> getAllEventsTmp() {
        return displayEventServiceTmp.list();

    }

}
