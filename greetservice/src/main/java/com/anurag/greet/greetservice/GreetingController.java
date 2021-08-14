package com.anurag.greet.greetservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

@RestController
@Slf4j
public class GreetingController{

    @Value("${service.greetings.name}")
    private String name;

    @Value("${service.greetings.date-format}")
    private String dateFormat;

    @GetMapping("/greetings")
    public ResponseEntity<Mono<String>> sayHello(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        String formattedDate = simpleDateFormat.format(new Date());
        return ResponseEntity.ok(Mono.just(formattedDate + " Hello "+name));
    }
}
