package com.mmistela.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "ticket_flight")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class TicketFlight {
    @EmbeddedId
    private TicketFlightKey id;

    @ManyToOne
    @MapsId("ticket_id")
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @ManyToOne
    @MapsId("flight_id")
    @JoinColumn(name = "flight_id")
    private Flight flight;

    private Boolean status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TicketFlight that = (TicketFlight) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
