package genChall;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void sortedTeams(ArrayList<Team<BasketballP>> teams) {
    Collections.sort(teams);
    for(Team t : teams) {
      System.out.println(t.getName());
    }
  }

  public static void main(String[] args){

    ArrayList<Team<BasketballP>> teams = new ArrayList<>();

    BasketballP pone = new BasketballP("Zach");
    BasketballP ptwo = new BasketballP("Aaron");
    BasketballP pthree = new BasketballP("Sam");
    BasketballP pfour = new BasketballP("Chuck");
    BasketballP pfive = new BasketballP("Debbie");

    TrackP tone = new TrackP("Zach");

    Team<BasketballP> mavs = new Team<>("Mavs");
    mavs.addPlayer(pone);
    mavs.addPlayer(ptwo);
    mavs.addPlayer(pthree);
    mavs.addPlayer(pfour);
    mavs.addPlayer(pfive);

    Team<BasketballP> rockets = new Team<>("Rockets");
    Team<BasketballP> bucks = new Team<>("Bucks");

    teams.add(mavs);
    teams.add(rockets);
    teams.add(bucks);

    mavs.playGame(bucks, 100, 95);
    mavs.playGame(bucks, 100, 95);
    mavs.playGame(rockets, 100, 95);

    sortedTeams(teams);

  }
}
