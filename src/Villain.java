public class Villain extends Character {
    int specialCost;
    int specialDmg;
    public Villain(int health,int power,int standardAtkDmg,int standardAtkPow,int specialCost,int specialDmg){
        super(health,power,standardAtkDmg,standardAtkPow);
        this.specialCost=specialCost;
        this.specialDmg=specialDmg;
    }

    public void normalAtk(Character target){
        this.power-=standardAtkPow;
        target.takeDamage(standardAtkDmg);
    }
    public void darkSummon(Character target){
        this.power-=specialCost;
        target.takeSpecialDamage(specialDmg);
    }
    public void toxicAura(Character target){
        this.power-=specialCost;
        target.takeSpecialDamage(specialDmg);
    }
    public void curse(Character target){
        this.power-=specialCost;
        target.takeSpecialDamage(specialDmg);
    }
    

}
