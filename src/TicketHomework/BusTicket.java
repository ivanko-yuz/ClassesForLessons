package TicketHomework;

import java.util.Date;

/**
 * Created by vanuy on 30.10.2016.
 */
public class BusTicket extends Ticket {

    private String destination;

    public  BusTicket(Date beginTime, int id, int position, String destination) {
        super(beginTime, id, position);
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


}
