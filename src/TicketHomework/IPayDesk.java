package TicketHomework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanuy on 01.11.2016.
 */
public interface IPayDesk {
    Ticket SellTiket();
    boolean  ReturnTicket(Ticket ticket);
    Ticket SellTiket(int id);
}
