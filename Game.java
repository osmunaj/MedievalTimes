public class Game {
    private String name;
    private String[] characters;
    
    public Game(){

    }


    public void setName(String name){
        this.name = name;
    }

    public void setCharacters(String[] characters){
        this.characters = characters;
    }

    public String printGame(){
        String game = "---" + this.name + "---\n";

        for(int i = 0; i < 4; i++){
            game += characters[i] + "\n";
        }


        return game;
    }
}
