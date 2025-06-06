public class Hero extends Character {
    int specialCost;
    int specialDmg;
    public Hero(int health,int power,int standardAtkDmg,int standardAtkPow,int specialCost,int specialDmg){
        super(health,power,standardAtkDmg,standardAtkPow);
        this.specialCost=specialCost;
        this.specialDmg=specialDmg;
    }
    
    public void normalAtk(Character target){
        this.power-=standardAtkPow;
        target.takeDamage(standardAtkDmg);
    }

    public void castSpell(Character target){
        this.power-=specialCost;
        target.takeSpecialDamage(specialDmg);
    }

    public void quickShot(Character target){
        this.power-=specialCost;
        target.takeSpecialDamage(specialDmg);
    }

    public void mightyStrike(Character target){
        this.power-=specialCost;
        target.takeSpecialDamage(specialDmg);
    }
    
}
