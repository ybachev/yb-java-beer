package com.yb.java.beer.spring.service;

import com.yb.java.beer.spring.model.Event;
import com.yb.java.beer.spring.model.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yavor bachev
 * @since 0.1
 */

@Service
public class DisplayEventServiceTmp {

    private EventRepository eventRepository;

    public DisplayEventServiceTmp(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void save(List<Event> events) {
        eventRepository.save(events);
    }

    public Iterable<Event> list() {
        return eventRepository.findAll();
    }

    public Event findById(String id) {
       return eventRepository.findOne(id);
    }
}
