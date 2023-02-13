package pack.jv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add("asf");
//        items.add(4);
//
//        printDouble(items);

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer zico = new SoccerPlayer("Zico");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide crows");
        //adelaideCrows.addPlayer(pat); / it will not work cause of the T

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> flamengo = new Team<>("Flamengo");
        flamengo.addPlayer(zico);

    }
    private static void printDouble(ArrayList n){
        for(Object i: n){
            try {
                System.out.println((Integer) i * 2);
            } catch (Exception e){
                System.out.println("Error: " + e.getClass().getSimpleName());
            }
        }
    }
}
