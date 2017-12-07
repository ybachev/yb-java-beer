package com.yb.java.beer.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author yavor bachev
 * @since 0.1
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    private String id;

    private String name;

    private String number;
}
