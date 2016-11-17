package TicketHomework;

import java.util.Date;

/**
 * Created by vanuy on 30.10.2016.
 */
public abstract class Ticket {
    public static int TicketCount = 0;

    private Date beginTime;
    private int id;
    private int position;
    private boolean checked;

    protected Ticket(Date beginTime, int id, int position) {
        this.beginTime = beginTime;
        this.id = id;
        this.position = position;
        checked = false;
        TicketCount++;
    }

    protected Ticket(Date beginTime, int position) {
        this.beginTime = beginTime;
        this.id = TicketCount;
        this.position = position;
        checked = false;
        TicketCount++;
    }

    public int getTicketCount() {
        return TicketCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "id = " + id + " ,pos = " + position + " ,date = " + beginTime + " ,checked = " + checked;
    }
}
