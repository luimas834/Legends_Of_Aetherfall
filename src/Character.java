public class Character {
    String name;
    int health;
    int power;
    int standardAtkDmg;
    int standardAtkPow;
    
    public Character(int health,int power,int standardAtkDmg,int standardAtkPow){

    }

     public void takeDamage(int damage){
        this.health-=damage;
    }
    public void takeSpecialDamage(int speicalDamage){
        this.health-=speicalDamage;
    }
    public void isAlive(){
        if(this.health>0){
            System.out.println("Character is alive!!");
        }
        else{
            System.out.println("Character is dead!!>_<");
        }
    }


    public void setName(String name){
        this.name=name;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public void setPower(int power){
        this.power=power;
    }
    public void setStandardAtkDmg(int dmg){
        this.standardAtkDmg=dmg;
    }
    public void setStandardAtkPow(int pow){
        this.standardAtkPow=pow;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getPower(){
        return power;
    }
    public int getStandardAtkDmg(){
        return standardAtkDmg;
    }
    public int getStandardAtkPow(){
        return standardAtkPow;
    }

}
