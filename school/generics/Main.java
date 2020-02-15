package generics;

public class Main {
  public static void main(String[] args){
    SoccerPlayer soc = new SoccerPlayer("Jack");
    FootballPlayer foo = new FootballPlayer("Troy");
    BaseballPlayer ball = new BaseballPlayer("Arod");
    BaseballPlayer ballTwo = new BaseballPlayer("Jeter");
    BaseballPlayer ballThree = new BaseballPlayer("Malcom");
    BaseballPlayer ballFour = new BaseballPlayer("Brandon");

    // System.out.println("Soccer: " + soc.getName() + "\n" +
        // "Football: " + foo.getName() + "\n" +
        // "Baseball: " + ball.getName());
  // }

    Team<FootballPlayer> fteam = new Team<>("Zach's Team");
    fteam.addPlayer(foo);
    System.out.println(fteam.numPlayers());

    Team<BaseballPlayer> bteam = new Team<>("Aarons' Team");
    bteam.addPlayer(ball);
    bteam.addPlayer(ballTwo);

    Team<SoccerPlayer> steam = new Team<>("Sam's Team");
    steam.addPlayer(soc);

    Team<BaseballPlayer> bbteam = new Team<>("Zach's second Team");
    bbteam.addPlayer(ballThree);
    bbteam.addPlayer(ballFour);

    bteam.matchResult(bbteam, 5, 3);
    bteam.matchResult(bbteam, 4, 3);
    bteam.matchResult(bbteam, 4, 3);
    bteam.matchResult(bbteam, 1, 6);

    System.out.println(bteam.compareTo(bbteam));

  }
}
