package com.lizkrz.app;

import java.util.Calendar;
import java.util.Date;

/**
 * A simple class that models a train ticket, because I am currently on a train
 * @author Liz Krznarich
 */

public class Ticket {
    private Ticketholder ticketholder;
    private Seat seat;
    private Journey journey;

    /**
     * Create new ticket instance
     *
     * @param ticketholder - ticketholder first name, last name and system-assigned id
     * @param seat - seat assigned to ticketholder
     * @param journey - the route and time that the ticket is valid for
     *
     */ 
    public Ticket(Ticketholder ticketholder, Seat seat, Journey journey) {
        this.ticketholder = ticketholder;
        this.seat = seat;
        this.journey = journey;
    }

    /**
     * @return the ticketholder
     */
    public Ticketholder getTicketholder() {
        return ticketholder;
    }
    
    public void setTicketholder(Ticketholder ticketholder) {
        this.ticketholder = ticketholder;
    }

    /**
     * @return the seat assigned to the ticketholder
     */
    public Seat getSeat() {
        return seat;
    }
    
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    
    /**
     * @return the journey that the ticket is valid for
     */
    public Journey getJourney() {
        return journey;
    }
    
    public void setJourney(Journey journey) {
        this.journey = journey;
    }
    
    /**
     * Check whether user the ticket is for a first class seat
     * @return true if the ticket is for a first class seat
     */ 
    public boolean isFirstClass() {
        return (seat.getSeatClass() == Seat.SeatClass.FIRST);
    }

    /**
     * @param calendar is the ticket valid at this time?
     * @return true if the ticket is valid at the time provided
     */
    public boolean isValid(Calendar calendar) {
        Date journeyDate = journey.getJourneyDate();
        Date time = calendar.getTime();
        return time.after(journeyDate);
    }
}
