package pl.mmistela.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class TicketFlightKey implements Serializable {
    @Column(name = "ticket_id")
    private Long ticketId;
    @Column(name = "flight_id")
    private Long flightId;
}
