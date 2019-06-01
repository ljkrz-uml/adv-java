package com.lizkrz.app;

/**
 * A simple class that contains information about a seat location on a train
 *
 * @author Liz Krznarich
 */

public class Seat {
    //Allowed values for seat fields
    public enum Car {
        ONE (1),
        TWO (2),
        THREE (3),
        FOUR (4),
        FIVE (5),
        SIX (6),
        SEVEN (7),
        EIGHT (8)
        ;
        
        private final int carNum;
        private Car (int carNum) {
            this.carNum = carNum;
        }
        public int getCarNum() {
            return this.carNum;
        }
    }
    public enum SeatClass {FIRST, SECOND};
    public enum Row {
        ONE (1),
        TWO (2),
        THREE (3),
        FOUR (4),
        FIVE (5),
        SIX (6),
        SEVEN (7),
        EIGHT (8),
        NINE (9),
        TEN (10),
        ELEVEN (11),
        TWELVE (2),
        THIRTEEN (3),
        FOURTEEN (4),
        FIFTEEN (5),
        SIXTEEN (6)
        ;
        
        private final int rowNum;
        private Row (int rowNum) {
            this.rowNum = rowNum;
        }
        public int getRowNum() {
            return this.rowNum;
        }
    }
    public enum Position {A, B, C, D};
    
    

    /**
     * Create a new seat instance
     *
     * @param SeatClass - seat class
     * @param car - the train car that the seat is located in
     * @param row - the row within a car that the seat is located in
     * @param position - the position within a row that the seat is located in
     *
     */
    private SeatClass SeatClass;
    private Car car;
    private Row row;
    private Position position;
    
    public Seat (SeatClass SeatClass, Car car, Row row, Position position) {
        this.SeatClass = SeatClass;
        this.car = car;
        this.row = row;
        this.position = position;
    }

    /**
     * @return the seat class
     */
    public SeatClass getSeatClass() {
        return SeatClass;
    }

    public void setSeatClass(SeatClass SeatClass) {
        this.SeatClass = SeatClass;
    }
    
    /**
     * @return the train car that the seat is located in
     */
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    /**
     * @return the row within a car that the seat is located in
     */
    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }
    
    /**
     * @return the position within a row that the seat is located in
     */
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
