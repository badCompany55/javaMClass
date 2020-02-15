package genChall;

import java.util.List;
import java.util.ArrayList;

public class Team<Type extends Player> implements Comparable<Team<Type>> {
  private int won;
  private int lost;
  private int tie;
  private String name;
  private List<Type> roster;

  public Team(String name) {
    this.name = name;
    this.roster = new ArrayList<>();
  }

  public String getName(){
    return this.name;
  } 
  

  public boolean addPlayer(Type player) {
    if(roster.contains(player)) {
      System.out.println(player.getName() + " is already on " + this.name + ".");
      return false;
    }
    roster.add(player);
    System.out.println(player.getName() + " added to " + this.name + ".");
    return true;
  }

  public void win() {
    this.won++;
  }

  public void lose() {
    this.lost++;
  }

  public void tied() {
    this.tie++;
  }

  public boolean playGame(Team<Type> opposition, int ourScore, int theirScore) {
    if(ourScore > theirScore) {
      this.win();
      opposition.lose();
      return true;
    } else if(ourScore < theirScore) {
      this.lose();
      opposition.win();
      return true;
    }
    this.tied();
    opposition.tied();
    return true;
  }

  private int ranking() {
    return (won * 2) - (lost * 3) + tie;
  }

  @Override
  public int compareTo(Team<Type> opposition) {
    if(this.ranking() > opposition.ranking()) {
      return -1;
    } else if (this.ranking() < opposition.ranking()) {
      return 1;
    }
    return 0;
  }

}
