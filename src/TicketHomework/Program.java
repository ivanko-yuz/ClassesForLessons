package TicketHomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by vanuy on 30.10.2016.
 */
public class Program {

    public static void main(String[] args){

        MoviePayDesk mdesk = new MoviePayDesk();
        BusPayDesk bdesk = new BusPayDesk();

        List<CinemaTicket> buiedTickets = new ArrayList<>();

        Controller controller = new Controller();

        System.out.println(mdesk.getTickets());
        buiedTickets.add((CinemaTicket) mdesk.SellTiket());
        buiedTickets.add((CinemaTicket) mdesk.SellTiket(0));
        buiedTickets.add((CinemaTicket) mdesk.SellTiket(1));
        buiedTickets.add((CinemaTicket) mdesk.SellTiket(4));

        //JsonWriter.Write("tickets.json", buiedTickets);
        System.out.println(buiedTickets);
        controller.check(buiedTickets.get(0));
        controller.check(buiedTickets.get(0));

        mdesk.ReturnTicket(buiedTickets.get(0));
        mdesk.ReturnTicket(buiedTickets.get(5));

    }
}
