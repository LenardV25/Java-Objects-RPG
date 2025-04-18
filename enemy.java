public class enemy {
    public String name;
    private int healthPoints;
    private int attackPower;
    private int level;

    public enemy(String name, int healthPoints, int attackPower, int level){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.level = level;

    }

    public String getName(){
        return this.name;

    }
    public void setName(String name){
        this.name = name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;

    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public String displayInfo(){
        String status =("Enemy: "+ this.name + "\nHealth: " +this.healthPoints + "\nDamage: " +this.attackPower+ "\nLevel: " +this.level);
        return status;
    }

    public int attack(){
        System.out.println(this.name+ " attack the you for "+ attackPower+ " damage!");
        return this.attackPower;
    }

    public int takeDamage(int amount){
        this.healthPoints-=amount;
        System.out.println(this.name + " took "+amount+" damage");
        return this.healthPoints;
    }

    public boolean isDefeated(){
        if (healthPoints <= 0 ){
            System.out.println("The "+ this.name + " has been slained!");
            return true;
        }
        else return false;
      }
}
