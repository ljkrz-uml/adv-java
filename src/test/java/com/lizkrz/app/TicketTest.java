package com.lizkrz.app;

import java.util.Calendar;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
*
* JUNit test for Ticket class
*
* @author Liz Krznarich
*/
public class TicketTest {
    
    private Journey journeyOne;
    private Seat seatOne;
    private Seat seatTwo;
    private Ticketholder ticketholderOne;
    
    @Before
    public void setup() {
        ticketholderOne = new Ticketholder("Nerd", "Nerderson", "123abc");
        seatOne = new Seat(Seat.SeatClass.FIRST, Seat.Car.ONE, Seat.Row.ONE, Seat.Position.A);
        seatTwo = new Seat(Seat.SeatClass.SECOND, Seat.Car.TWO, Seat.Row.TWO, Seat.Position.B);
        journeyOne = new Journey(new Date(), Journey.Station.PARIS, Journey.Station.LYON, Journey.Route.PL);

     }
    
    @Test
    public void testTicketConstruction() {
        Ticket ticketOne = new Ticket(ticketholderOne, seatOne, journeyOne);
        assertEquals("Ticketholder", ticketOne.getTicketholder(), ticketholderOne);
        assertEquals("Seat is correct", ticketOne.getSeat(), seatOne);
        assertEquals("Journey is correct", ticketOne.getJourney(), journeyOne);
    }
    
    @Test
    public void testIsFirstClassTrue() {
        Ticket ticketOne = new Ticket(ticketholderOne, seatOne, journeyOne);
        assertTrue("The ticket has a first class seat", ticketOne.isFirstClass());
    }
    
    @Test
    public void testIsFirstClassFalse() {
        Ticket ticketOne = new Ticket(ticketholderOne, seatTwo, journeyOne);
        assertFalse("The ticket does not have a first class seat", ticketOne.isFirstClass());
    }
    
    @Test
    public void testIsValidTrue() {
        Calendar dateFuture = Calendar.getInstance();
        dateFuture.add(Calendar.YEAR, 1);
        Ticket ticketOne = new Ticket(ticketholderOne, seatOne, journeyOne);
        assertTrue("The ticket should be valid 1 year from now", ticketOne.isValid(dateFuture));
    }
    
    @Test
    public void testIsValidFalse() {
        Calendar datePast = Calendar.getInstance();
        datePast.add(Calendar.YEAR, -1);
        Ticket ticketOne = new Ticket(ticketholderOne, seatOne, journeyOne);
        assertFalse("The ticket should not be valid 1 before now", ticketOne.isValid(datePast));
    }
    

}
