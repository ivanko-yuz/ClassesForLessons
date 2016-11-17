package TicketHomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vanuy on 01.11.2016.
 */
public class BusPayDesk implements IPayDesk {
    private List<BusTicket> tickets;
    private List<BusTicket> soldTickets;

    public BusPayDesk(List<BusTicket> tickets) {
        this.tickets = tickets;
        soldTickets = new ArrayList<>();
    }

    public BusPayDesk(){
        tickets = new ArrayList<BusTicket>();
        tickets.add(new BusTicket(new Date(),1,1,"Lviv"));
        tickets.add(new BusTicket(new Date(),2,2,"Lviv"));
        tickets.add(new BusTicket(new Date(),3,3,"Lviv"));
        tickets.add(new BusTicket(new Date(),4,4,"Lviv"));

        tickets.add(new BusTicket(new Date(),5,1,"Ternopil"));
        tickets.add(new BusTicket(new Date(),6,2,"Ternopil"));
        tickets.add(new BusTicket(new Date(),7,3,"Ternopil"));
        tickets.add(new BusTicket(new Date(),8,4,"Ternopil"));

        soldTickets = new ArrayList<>();
    }

    public List<BusTicket> getTickets() {
        return tickets;
    }

    public void setTickets(List<BusTicket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public Ticket SellTiket() {
        if(!tickets.isEmpty()){
            if(!soldTickets.contains(tickets.get(soldTickets.size()))){
                soldTickets.add(tickets.get(soldTickets.size()));
                return tickets.get(soldTickets.size() - 1);
            }
        }
        return null;
    }

    @Override
    public boolean ReturnTicket(Ticket ticket) {
        BusTicket temp = (BusTicket)ticket;
        if(!ticket.isChecked())
            if(soldTickets.contains(ticket)){
                soldTickets.remove(ticket);
                return true;
            }
        return false;
    }

    @Override
    public Ticket SellTiket(int pos) {
        if(!tickets.isEmpty()){
            for (Ticket item:tickets
                    ) {
                if(item.getPosition() == pos){
                    soldTickets.add((BusTicket) item);
                    return item;
                }
            }
        }
        System.out.println("There are no that tickets available");
        return null;
    }
}
