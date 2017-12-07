package com.yb.java.beer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yb.java.beer.spring.model.DisplayEvent;
import com.yb.java.beer.spring.model.Event;
import com.yb.java.beer.spring.service.DisplayEventService;
import com.yb.java.beer.spring.service.DisplayEventServiceTmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
@ComponentScan("com.yb.java.beer.spring")
public class YbJavaBeerApplication {

    @Autowired
    private static DisplayEventService displayEventService;

    @Autowired
    private static DisplayEventServiceTmp eventServiceTmp;

    public static void main(String[] args) {
        SpringApplication.run(YbJavaBeerApplication.class, args);

    }

    @Bean
    CommandLineRunner runner(/*DisplayEventService displayService,*/ DisplayEventServiceTmp eventServiceTmp) {
        return args -> {
            /*// read json events and write to db
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm");
            ObjectMapper mapper = new ObjectMapper();
            mapper.setDateFormat(df);

            TypeReference<List<DisplayEvent>> typeReference = new TypeReference<List<DisplayEvent>>() {
            };


            InputStream inputStream = TypeReference.class.getResourceAsStream("/data/event.json");
            try {
                List<DisplayEvent> displayEvents = mapper.readValue(inputStream, typeReference);
                displayService.save(displayEvents);
                System.out.println("Events Saved in DB!");
            } catch (IOException e) {
                System.out.println("Unable to save events: " + e.getMessage());
            }
*/
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream2 = TypeReference.class.getResourceAsStream("/data/events-tmp.json");
            TypeReference<List<Event>> typeReference2 = new TypeReference<List<Event>>() {
            };

            try {
                List<Event> events2 = mapper.readValue(inputStream2, typeReference2);
                eventServiceTmp.save(events2);
                System.out.println("Events Saved in DB!");
            } catch (IOException e) {
                System.out.println("Unable to save events: " + e.getMessage());
            }

        };

    }
}
