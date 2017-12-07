package com.yb.java.beer.spring.service;

import com.yb.java.beer.spring.model.DisplayEvent;
import com.yb.java.beer.spring.model.repository.DisplayEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yavor bachev
 * @since 0.1
 */

@Service
public class DisplayEventService {

    private DisplayEventRepository displayEventRepository;

    public DisplayEventService(DisplayEventRepository displayEventRepository) {
        this.displayEventRepository = displayEventRepository;
    }

    public void save(List<DisplayEvent> events) {
        displayEventRepository.save(events);

    }

    public Iterable<DisplayEvent> list() {
        return displayEventRepository.findAll();
    }

    public DisplayEvent findById(String id) {
        return displayEventRepository.findOne(id);
    }
}
