package com.zacheryirvin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void print(ArrayList<Integer> l) {
    for (int x : l) {
      System.out.println(x);
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int input = scanner.nextInt();
    Scope x = new Scope(input);
    print(x.timesTable());
  }
}
