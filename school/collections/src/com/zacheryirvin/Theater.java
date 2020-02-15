package com.zacheryirvin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {
  private final String name;
  private List<Seat> seats = new ArrayList<>();

  public Theater(String name, int numRows, int seatsPerRow) {
    this.name = name;
    int lastRow = 'A' + (numRows - 1);
    System.out.println("last row: " +lastRow);
    for(char row = 'A'; row <= lastRow; row++) {
      for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
        Seat seat = new Seat(row + String.format("%02d", seatNum));
        seats.add(seat);
      }
    }
  }

  public String getName() {
    return this.name;
  }

  public boolean reserveSeat(String seatNumber) {
    Seat requested = new Seat(seatNumber);
    int foundSeat = Collections.binarySearch(seats, requested, null);
    if(foundSeat >= 0) {
      return seats.get(foundSeat).reserved();
    // for(Seat s : seats) {
      // if(s.getSeatNumber().equals(seatNumber)) {
        // requested = s;
        // break;
      // }
    } else {
      System.out.println("The requested seat does not exitst. Requested: " + seatNumber );
      return false;
    }

    // if(requested == null) {
      // System.out.println("The requested seat does not exitst. Requested: " + seatNumber );
      // return false;
    // }

    // return requested.reserved();
  }

  public void getSeats() {
    for(Seat s : seats) {
      System.out.println(s.getSeatNumber());
    }
  }

  private class Seat implements Comparable<Seat> {
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
      this.seatNumber = seatNumber;
    }

    @Override
    public int compareTo(Seat seat) {
      return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    public boolean reserved() {
      if(!this.reserved) {
        this.reserved = true;
        System.out.println("Seat " + seatNumber + " reserved");
        return true;
      }
      return false;
    }

    public String getSeatNumber() {
      return this.seatNumber;
    }

    public boolean cancel() {
      if(this.reserved) {
        this.reserved = false;
        System.out.println("Reservation of seat: " + seatNumber + " cancelled");
        return true;
      }
      return false;
    }
  }
}
