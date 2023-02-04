public class Player {
    private String name;
    private int healthPercentage;
    private String weapon;

    public Player(String name){
        this(name, 100, "Sword");
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + healthPercentage +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public Player(String name, int healthPercentage, String weapon){
        this.name =name;

        if(healthPercentage >100){
            this.healthPercentage =100;
        } else if(healthPercentage <=0){
            this.healthPercentage =1;
        } else {
            this.healthPercentage = healthPercentage;
        }

        this.weapon=weapon;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;

        if(healthPercentage <=0){
            System.out.println("Player knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth){
        healthPercentage +=extraHealth;
        if(healthPercentage >=100){
            System.out.println("Player restored to 100%");
            healthPercentage =100;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

}
