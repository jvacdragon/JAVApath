package pack.jv;

import java.util.ArrayList;

public class Team <T extends Player>{
    private String name;
    int played = 0;
    int won=0;
    int lost=0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    Team(String name){
        this.name = name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else{
            members.add(player);
            System.out.printf("%s added to the team", player.getName());
            return true;
        }
    }

    public int numbTeams(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore>theirScore){
            won++;
        }
        if(ourScore<theirScore){
            lost++;
        }
        else {
            tied++;
        }

        if(opponent!=null){
            matchResult(null, theirScore, ourScore);
        }
    }
}
