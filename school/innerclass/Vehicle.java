package innerclass;

import java.util.List;
import java.util.ArrayList;

public class Vehicle {
  private List<Gear> gears;
  private String name;
  private int transmission;
  private Gear currentGear;
  private int rpms;

  public Vehicle(String name, int transmission){
    this.name = name;
    this.transmission = transmission;
    this.rpms = 1000;
    Gear neutral = new Gear(0, 0.0);
    Gear first = new Gear(1, 1.2);
    Gear second = new Gear(2, 2.2);
    Gear third = new Gear(3, 3.52);
    Gear fourth = new Gear(4, 4.78);
    Gear fith = new Gear(5, 5.1);
    Gear sixth = new Gear(6, 6.4);
    this.currentGear = neutral;
    this.gears = new ArrayList<Gear>();
    this.gears.add(neutral);
    this.gears.add(first);
    this.gears.add(second);
    this.gears.add(third);
    this.gears.add(fourth);
    this.gears.add(fith);
    this.gears.add(sixth);
  }


  public class Gear {
    private int gearNumber;
    private double ratio;

    public Gear(int gearNumber, double ratio) {
      this.gearNumber = gearNumber;
      this.ratio = ratio;
    }

    public int getGearNumber() {
      return this.gearNumber;
    }

    public double driveSpeed() {
      return rpms / this.ratio;
    }
  }

  public void setRpms(int rpms) {
    this.rpms = rpms;
  }

  public void switchGears(String upDown) {
    Gear[] availableGears = new Gear[this.transmission + 1];
    for (Gear g : gears) {
      availableGears[g.getGearNumber()] = g;
    }
    if (upDown.equals("up") && this.currentGear.getGearNumber() < this.transmission) {
      this.currentGear = availableGears[this.currentGear.getGearNumber() + 1];
    } else{
      System.out.println("Already in top Gear.");
    }
    if (upDown.equals("down") && this.currentGear.getGearNumber() > 0) {
      this.currentGear = availableGears[this.currentGear.getGearNumber() - 1];
    } else {
      System.out.println("Already in lowest Gear.");
    }
  }

  public void getCurrentGear() {
    System.out.println(this.currentGear.getGearNumber());
  }
}
