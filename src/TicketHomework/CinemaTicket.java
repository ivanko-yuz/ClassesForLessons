package TicketHomework;

import java.util.Date;

/**
 * Created by vanuy on 30.10.2016.
 */
public class CinemaTicket extends Ticket {

    private String NameOfFilm;

    protected CinemaTicket(Date beginTime, int id, int position, String nameOfFilm) {
        super(beginTime, id, position);
        NameOfFilm = nameOfFilm;
    }

    public String getNameOfFilm() {
        return NameOfFilm;
    }

    public void setNameOfFilm(String nameOfFilm) {
        NameOfFilm = nameOfFilm;
    }
}
