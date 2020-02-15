package generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
  private String name;
  int played = 0;
  int won = 0;
  int lost = 0;
  int tied = 0;

  private ArrayList<T> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public boolean addPlayer(T player) {
    if (members.contains(player)) {
      // Player printPlayer = (Player) player;
      System.out.println(player.getName() + " is already on the team");
      return false;
    } else {
      members.add(player);
      // Player printPlayer = (Player) player;
      System.out.println(player.getName() + " is now on the roster for " + this.getName());
      return true;
    }
  }

  public int numPlayers() {
    return this.members.size();
  }

  public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
    if (ourScore > theirScore) {
      won++;
    } else if (ourScore < theirScore) {
      lost++;
    } else {
      tied++;
    }
    played++;
    if (opponent != null) {
      opponent.matchResult(null, theirScore, ourScore);
    }
  }

  public int ranking() {
    return (won * 2) + tied;
  }

  public int compareTo(Team<T> team) {
    if(this.ranking() > team.ranking()) {
      return -1;
    } else if(this.ranking() < team.ranking()) {
      return 1;
    } else {
      return 0; 
    }
  }
}
