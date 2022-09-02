package pl.mmistela.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.MapsId;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "ticket_flight")
@Data
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
}
