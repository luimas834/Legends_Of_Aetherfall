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

    }

    public void enemyTurn(){

    }
    public void displayGameStat(){
        System.out.println("-------- Game Stats --------");
        System.out.println(player.getName()+" - Health: "+player.getHealth()+", Power: "+player.getPower());
        System.out.println(enemy.getName()+" - Health: "+enemy.getHealth()+", Power: "+enemy.getPower());
    }

}
