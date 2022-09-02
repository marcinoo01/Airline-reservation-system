package com.mmistela.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@RequiredArgsConstructor
@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private City fromLocation;
    private City toLocation;
    private LocalDate departureTime;
    private LocalDate arrivalTime;
    private Integer duration;
    private Integer totalSeats;
}
