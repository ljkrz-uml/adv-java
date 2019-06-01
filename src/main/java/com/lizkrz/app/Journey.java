package com.lizkrz.app;

import java.util.Date;

/**
 * A simple class that contains information about a train journey
 *
 * @author Liz Krznarich
 */
public class Journey {
    //Allowed values for journey fields
    public enum Station {PARIS, LYON, MARSEILLES, CANNES};
    public enum Route {PL, PM, PC};
    
    /**
     * Create a new journey instance
     *
     * @param journeyDate - the date of the train journey
     * @param startStation - the station that the train departs from 
     * @param endStation - the station that the train arrives at
     * @param route - the ID of the route that the train will follow
     *
     */
    private Date journeyDate;
    private Station startStation;
    private Station endStation;
    private Route route;
    
    public Journey (Date journeyDate, Station startStation, Station endStation, Route rout) {
        this.journeyDate = journeyDate;
        this.startStation = startStation;
        this.endStation = endStation;
        this.route = route;
    }
    
    /**
     * @return the date of the journey
     */
    public Date getJourneyDate() {
        return journeyDate;
    }
    
    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }
    
    /**
     * @return the station that the train departs from 
     */
    public Station getStartStation() {
        return startStation;
    }

    public void setStartStation(Station startStation) {
        this.startStation = startStation;
    }

    /**
     * @return the station that the train arrives at
     */
    public Station getEndStation() {
        return endStation;
    }

    public void setEndStation(Station endStation) {
        this.endStation = endStation;
    }
    
    /**
     * @return the ID of the route that the train will follow
     */
    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

}
