package com.zacheryirvin;

import java.util.ArrayList;

public class Scope {
  private int x;

  public Scope(int x) {
    this.x = x;
  }

  public ArrayList<Integer> timesTable() {
    ArrayList<Integer> returnArr = new ArrayList<Integer>();
    for(int x = 1; x <= 12; x++) {
      returnArr.add(this.x * x);
    }
    return returnArr;
  }

}
