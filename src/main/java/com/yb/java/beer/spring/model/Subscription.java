package com.yb.java.beer.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author yavor bachev
 * @since 0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Embeddable
@Entity
public class Subscription implements Serializable {

    @Id
    private Long id;

    private String required;

    private Date dueDate;

    private String link;

    private String text;
}
