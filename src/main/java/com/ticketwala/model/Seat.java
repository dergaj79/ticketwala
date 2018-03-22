package com.ticketwala.model;

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

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public int getRow() {
		return row;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Seat [row=" + row + ", seatNumber=" + seatNumber + ", sold=" + sold + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + row;
		result = prime * result + seatNumber;
		result = prime * result + (sold ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Seat otherSeat = (Seat) obj;
		if (this.row == otherSeat.row && this.seatNumber == otherSeat.seatNumber) {
			return true;
		}
		return false;
	 }
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Seat other = (Seat) obj;
//		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//			return false;
//		if (row != other.row)
//			return false;
//		if (seatNumber != other.seatNumber)
//			return false;
//		if (sold != other.sold)
//			return false;
//		return true;
//	}

}
