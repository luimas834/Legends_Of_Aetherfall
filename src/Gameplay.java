import java.util.*;

public class Gameplay {
    Scanner scanner =new Scanner(System.in);
    Hero player;
    Villain enemy;
    boolean isPlaying=true;

    public Gameplay(){

    }

    public void startGame(){
        chooseHero();

        chooseVillain();

        System.out.println(player.getName()+" the "+player.getHeroType()+" enters the world of Atherfall");
        System.out.println(enemy.getName()+" rises to spread chaos!");
        System.out.println("Battle start");

        while(isPlaying){
            heroTurn();
            if(isPlaying==false){
                break;
            }
            enemyTurn();
            if(isPlaying==false){
                break;
            }
        }

    }
    public void chooseHero(){
            System.out.println("Choose a character: 1.Mage 2.Archer 3.Warrior");
            System.out.print("= ");
            int char_Num=scanner.nextInt();
            scanner.nextLine();

            switch(char_Num){
                case 1: System.out.println("you've chosen Mage");
                        System.out.println("Enter your mage name");
                        System.out.print("= ");
                        String mageName=scanner.nextLine();
                        player=new Hero(80,100,20,10,30,40,"Mage");
                        player.setName(mageName);
                        break;
                case 2: System.out.println("you've chosen Archer");
                        System.out.println("Enter your Archer name");
                        System.out.print("= ");
                        String archerName=scanner.nextLine();
                        player=new Hero(100,100,15,8,25,30,"Archer");
                        player.setName(archerName);
                        break;
                case 3: System.out.println("you've chosen Warrior");
                        System.out.println("Enter your warrior name");
                        System.out.print("= ");
                        String warriorName=scanner.nextLine();
                        player=new Hero(120,100,12,5,35,35,"Warrior");
                        player.setName(warriorName);
                        break;
            }
        }
    
    public void chooseVillain(){
        System.out.println("Choose a villain to fight against:");
        System.out.println("1.Dark Overlord");
        System.out.println("2.Regional Warlord");
        System.out.println("3.Corrupter Mortal");
        System.out.print("= ");
        int vil_Num=scanner.nextInt();
        scanner.nextLine();

        switch(vil_Num){
            case 1: enemy =new Villain(200,150,25,17,40,50,"Dark Overlord");
                    enemy.setName("DarkOverlord");
                    break;
            case 2: enemy =new Villain(130,110,20,10,35,30,"Regional Warlord");
                    enemy.setName("RegionalWarlord");
                    break;
            case 3: enemy =new Villain(90,90,18,9,20,25,"Corrupted Mortal");
                    enemy.setName("CorruptedWarlord");
                    break;
        }
    }
    
    public void heroTurn(){
        System.out.print("= ");
        String action =scanner.nextLine().toLowerCase().trim();

        if(action.equals("attack")){
            if(player.getPower()>=player.getStandardAtkPow()){
                player.normalAtk(enemy);
            }
            else{
                System.out.println("Not enough power to attack!");
                return;
            }
        }
        else if(action.equals("speical")){
            if(player.getPower()>=player.specialCost){
                heroSpeicalAttack();
            }
            else{
                System.out.println("Not enough power for special attack! >_<");
                return;
            }
        }
        else{
            System.out.println("Invalid command! -_- Use 'attack' or 'speical'");
            return;
        }

        displayGameStats();

        if(enemy.getHealth()<=0){
            System.out.println("-------- Resutls --------");
            System.out.println(player.getName()+" wins the battle! ^_^");
            System.out.println(enemy.getName()+" the "+enemy.getVillainType().toLowerCase()+" has been defeated");
            isPlaying=false;
        }
    }

    public void enemyTurn(){
        Random random =new Random();
        boolean randomValue= random.nextBoolean();
        //found this way of getting randomly a boolean value with 50% chance interesting :3

        if(randomValue&&enemy.getPower()>=enemy.specialCost){
            enemySpeicalAttack();
        }
        else if(enemy.getPower()>=enemy.getStandardAtkPow()){
            enemy.normalAtk(player);
        }
        else{
            System.out.println(enemy.getName()+" doesn't have enough power to attack! ");
            return;
        }
        displayGameStats();
        if(player.getHealth()<=0){
            System.out.println("-------- Results ---------");
            System.out.println(enemy.getName()+" wins the battle!");
            System.out.println(player.getName()+" the "+player.getHeroType().toLowerCase()+" has been defeated!");
            isPlaying=false;
        }

    }

    public void heroSpeicalAttack(){
        String heroType=player.getHeroType();

        if(heroType.equals("Mage")){
            player.castSpell(enemy);
        }
        else if(heroType.equals("Archer")){
            player.quickShot(enemy);
        }
        else if(heroType.equals("Warrior")){
            player.mightyStrike(enemy);
        }
    }
    public void enemySpeicalAttack(){
        String villainType=enemy.getVillainType();

        if(villainType.equals("Dark Overlord")){
            enemy.summonDarkness(player);
        }
        else if(villainType.equals("Regional Warlord")){
            enemy.toxicAura(player);
        }
        else if(villainType.equals("Corrupted Mortal")){
            enemy.curse(player);
        }
    }
    public void displayGameStats(){
        System.out.println("-------- Game Stats --------");
        System.out.println(player.getName()+" - Health: "+player.getHealth()+", Power: "+player.getPower());
        System.out.println(enemy.getName()+" - Health: "+enemy.getHealth()+", Power: "+enemy.getPower());
    }

}
