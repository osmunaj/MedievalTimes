import java.util.Scanner;
import java.io.*; 


public class MedievalTimes {
    public static void main(String[] args) {
       
        String imput = "";
        Scanner scanner = new Scanner(System.in);
        PrintWriter gameSaves = new PrintWriter("MedievalTimesData.mds");

        while (!((imput.equals("Quit") || (imput.equals("4"))))){
            
            System.out.println("---Welcome to Medieval Times!---");
            System.out.println("1. Create Game");
            System.out.println("2. Validate a save file");
            System.out.println("3. Reroll/randomize an existing character");
            System.out.println("4. Quit");
            imput = scanner.next();

            if(imput.equals("Create Game") || imput.equals("1")){
                Game game = new Game();
                System.out.println("What is the name of your game?");
                game.setName(scanner.next());
                String[] characters = new String[4];
                
                for (int i = 0; i < 4; i++){
                    System.out.println("Imput Character " + (i + 1)+ " name, type, and main ability score");
                    characters[i] = new Character(scanner.next(), scanner.next(), scanner.nextInt()).print();
                    
                    
                }
                game.setCharacters(characters);
                //gameSaves.println(game.printGame());
                
               
            }
        }
        scanner.close();
        gameSaves.close();
    }
}
