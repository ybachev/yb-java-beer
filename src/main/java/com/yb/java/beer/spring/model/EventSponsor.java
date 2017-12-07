package com.yb.java.beer.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author yavor bachev
 * @since 0.1
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Embeddable
@Entity
public class EventSponsor implements Serializable {

    @Id
    private Long id;

    private String name;

    private String extraInfo;

    private String logo;

}
