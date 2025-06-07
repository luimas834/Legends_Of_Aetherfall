public class Hero extends Character {
    int specialCost;
    int specialDmg;
    String heroType;
    int weakenedAtk=0;
    public Hero(int health,int power,int standardAtkDmg,int standardAtkPow,int specialCost,int specialDmg,String heroType){
        super(health,power,standardAtkDmg,standardAtkPow);
        this.specialCost=specialCost;
        this.specialDmg=specialDmg;
        this.heroType=heroType;
    }
    
    public void normalAtk(Character target){
        if(this.power>=this.standardAtkPow){
            this.power-=standardAtkPow;
            int damage=this.standardAtkDmg;

            if(weakenedAtk!=0){
                damage/=2;
                weakenedAtk--;
            }
            
            target.takeDamage(damage);
            System.out.println(this.name+" used Attack on "+target.getName());
            System.out.println(this.name+" caused "+damage+" damage.");
        }
    }

    //Mages ability
    public void castSpell(Character target){
        if(this.power>=this.specialCost){
            this.power-=specialCost;
            target.takeSpecialDamage(specialDmg);
            System.out.println(this.name+" used speical on "+target.getName());
            System.out.println(this.name+" caused "+specialDmg+"damage.");
        }
    }

    //Archer ability
    public void quickShot(Character target){
        if(this.power>=this.specialCost){
            this.power-=specialCost;
            target.takeSpecialDamage(specialDmg);
            System.out.println(this.name+" used speical on "+target.getName());
            System.out.println(this.name+" caused "+specialDmg+"damage.");
        }
    }

    //Warrior ability
    public void mightyStrike(Character target){
       if(this.power>=this.specialCost){
            this.power-=specialCost;
            target.takeSpecialDamage(specialDmg);
            System.out.println(this.name+" used speical on "+target.getName());
            System.out.println(this.name+" caused "+specialDmg+"damage.");
        }
    }
    
    public void setWeakenedAtk(int count){
        this.weakenedAtk=count;
    }

    public String getHeroType(){
        return heroType;
    }
    
}
