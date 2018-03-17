package com.ticketwala.model;

/**
 * this class will present the cinema seats status...
 *
 * @author dasst
 * @serial
 */
public class Seat {
    private int row;
    private int seatNumber;
    private boolean sold;
    private double price;

    public Seat(int row, int seatNumber, double price) {
        this.row = row;
        this.seatNumber = seatNumber;
        this.sold = false;
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Seat{" + "row=" + row + ", seatNumber=" + seatNumber + ", sold=" + sold + ", price=" + price + '}';
    }
}
