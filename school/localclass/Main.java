package localclass;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static Button btn = new Button("Testing");

  public static void main(String[] args) {
    // class ClickListener implements Button.Onclicklistener {
      // public ClickListener() {
      // System.out.println("Attached.");
      // }

      // @Override
      // public void onClick(String title) {
        // System.out.println(title + " was clicked");
      // }
    // }
    // btn.setonclicklistener(new ClickListener());
    // listen();
  // }
    btn.setonclicklistener(new Button.Onclicklistener() {
      @Override
      public void onClick(String title) {
        System.out.println(title + " was clicked");
      }
    });
    listen();
  }

  private static void listen() {
    boolean quit = false;
    while(!quit) {
      int choice = scanner.nextInt();
      switch(choice) {
        case 0:
          quit = true;
          break;
        case 1:
          btn.onClick();
          break;
        default:
          System.out.println("Invalid Option. Must be 0 or 1.");
      }
    }
  }
}
