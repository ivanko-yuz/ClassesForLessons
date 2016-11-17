package TicketHomework;

/**
 * Created by vanuy on 01.11.2016.
 */
public class Controller implements IController {


    @Override
    public boolean check(Ticket ticket) {
        if(ticket.isChecked()){
            System.out.println("This ticket is already checked!");
            return false;
        }
        ticket.setChecked(true);
        return true;
    }
}
