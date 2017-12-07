package com.yb.java.beer.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yavor bachev
 * @since 0.1
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DisplayEvent implements Serializable {

    @Id
    private String id;

    private String format;

    private String event;

    private String name;

    private String number;

    private String summary;

    @Lob
    private String description;

    private String organiser;

    //@Embedded
    private EventSponsor sponsor;

    private String language;

    private Date when;

    //@Embedded
    private Subscription subscription;

    private String slogan;

    private String locationMap;

}
