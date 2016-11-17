package TicketHomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vanuy on 30.10.2016.
 */
public class MoviePayDesk implements IPayDesk{

    private List<CinemaTicket> tickets;
    private List<CinemaTicket> soldTickets;

    public MoviePayDesk(List<CinemaTicket> tickets) {
        this.tickets = tickets;
        soldTickets = new ArrayList<>();
    }

    public MoviePayDesk(){
        tickets = new ArrayList<CinemaTicket>();
        tickets.add(new CinemaTicket(new Date(),1,1,"Hulk"));
        tickets.add(new CinemaTicket(new Date(),2,2,"Hulk"));
        tickets.add(new CinemaTicket(new Date(),3,3,"Hulk"));
        tickets.add(new CinemaTicket(new Date(),4,4,"Hulk"));

        tickets.add(new CinemaTicket(new Date(),5,1,"Avangers"));
        tickets.add(new CinemaTicket(new Date(),6,2,"Avangers"));
        tickets.add(new CinemaTicket(new Date(),7,3,"Avangers"));
        tickets.add(new CinemaTicket(new Date(),8,4,"Avangers"));

        soldTickets = new ArrayList<>();
    }

    public List<CinemaTicket> getTickets() {
        return tickets;
    }

    public void setTickets(List<CinemaTicket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public Ticket SellTiket() {
        if(!tickets.isEmpty()){
            if(!soldTickets.contains(tickets.get(soldTickets.size()))){
                soldTickets.add(tickets.get(soldTickets.size()));
                System.out.println("You buy ticket");
                return tickets.get(soldTickets.size() - 1);
            }
        }
        System.out.println("There are no tickets available");
        return null;
    }

    @Override
    public boolean ReturnTicket(Ticket ticket) {
        CinemaTicket temp = (CinemaTicket)ticket;
        if(!ticket.isChecked()) {
            if (soldTickets.contains(ticket)) {
                soldTickets.remove(ticket);
                return true;
            }
            System.out.println("We didn't sell u that ticket");
        }
        System.out.println("U can't return checked ticket");
        return false;
    }

    @Override
    public Ticket SellTiket(int pos) {
        if(!tickets.isEmpty()){

            for (Ticket item:tickets
                 ) {
                if(!soldTickets.contains(item)){
                    if(item.getPosition() == pos){
                        soldTickets.add((CinemaTicket) item);
                        System.out.println("You buy ticket");
                        return item;
                    }
                }
            }
        }
        System.out.println("There are no that tickets available");
        return null;
    }
}
