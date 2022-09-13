package com.mmistela.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@RequiredArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private City fromLocation;
    @Enumerated(EnumType.STRING)
    private City toLocation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Integer duration;
    private Integer totalSeats;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Flight flight = (Flight) o;
        return id != null && Objects.equals(id, flight.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
