import java.util.Random;

public class Character {
    private String name;
    private String type;
    
    private int strength;
    private int toughness;
    private int intelligence;
    private int magic;
    private int influence;

    public Character(String name, String type, int mainAbility){
        int total = 0;

        while(total < 8 || total > 28){
            Random random = new Random();

            this.name = name;
            this.type = type;

            this.strength = random.nextInt(7);               //Knight
            this.toughness = random.nextInt(7);              //Peasant
            this.intelligence = random.nextInt(7);           //Cleric
            this.magic = random.nextInt(7);                  //Mage
            this.influence = random.nextInt(7);              //Courtier


            if(type.equals("knight")){
                this.strength = mainAbility;
            }else if(type.equals("peasant")){
                this.toughness = mainAbility;
            }else if(type.equals("cleric")){
                this.intelligence = mainAbility;
            }else if(type.equals("mage")){
                this.magic = mainAbility;
            }else if(type.equals("courtier")){
                this.influence = mainAbility;
            }
            total = strength + toughness + intelligence + magic + influence;
        }      
    }


    public String print(){
        String str = name + ", " + type + ", " + strength + ", " + toughness + ", " + intelligence + ", "+ magic + ", " + influence;
        return str;
    }
}
