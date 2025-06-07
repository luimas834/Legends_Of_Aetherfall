public class Villain extends Character {
    int specialCost;
    int specialDmg;
    String villainType;
    public Villain(int health,int power,int standardAtkDmg,int standardAtkPow,int specialCost,int specialDmg,String villainType){
        super(health,power,standardAtkDmg,standardAtkPow);
        this.specialCost=specialCost;
        this.specialDmg=specialDmg;
        this.villainType=villainType;
    }

    public void normalAtk(Character target){
        if(this.power>=this.standardAtkPow){
            this.power-=standardAtkPow;
            target.takeDamage(standardAtkDmg);
            System.out.println(this.name+" used Attack on "+target.getName());
            System.out.println(this.name+" caused "+standardAtkDmg+" damage.");
        }
    }
    //dakr overlord speical
    public void summonDarkness(Character target){
        if(this.power>=this.specialCost){
            this.power-=specialCost;
            target.takeSpecialDamage(specialDmg);
            System.out.println(this.name+" used speical on "+target.getName());
            System.out.println(this.name+" caused "+specialDmg+" damage.");

            if(target instanceof Hero){
                ((Hero)target).setWeakenedAtk(1);
            }
        }
    }
    //regional warlord speical
    public void toxicAura(Character target){
        if(this.power>=this.specialCost){
            this.power-=specialCost;
            target.takeSpecialDamage(specialDmg);
            System.out.println(this.name+" used speical on "+target.getName());
            System.out.println(this.name+" caused "+specialDmg+" damage.");
        }
          /* implementing the *20 second disable* seemed to be very complicated
          so did not implement it (>_<) */
    }
    //corrupted mortal speical
    public void curse(Character target){
       if(this.power>=this.specialCost){
            this.power-=specialCost;
            target.takeSpecialDamage(specialDmg);
            System.out.println(this.name+" used speical on "+target.getName());
            System.out.println(this.name+" caused "+specialDmg+" damage.");
        }
    }

    public String getVillainType(){
        return villainType;
    }


}
