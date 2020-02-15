package innerclass;

public class Main {
  public static void main(String[] args) {
    Vehicle ram = new Vehicle("97ram", 6);
    ram.getCurrentGear();
    ram.switchGears("up");
    ram.getCurrentGear();
    ram.switchGears("up");
    ram.getCurrentGear();
  }
}
