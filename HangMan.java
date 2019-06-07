/*
* PURPOSE: To play the Hang Man Game
* PROGRAMMER: Hector Cedeno
* NAME:   Hang Man Game
* PROYECT: CIS 156 Final Proyect
* DATE BUILT: 5/4/20118
* LAST_DATE_MODIFIED:5/7/2018 
*/

package cedeno;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class HangMan 
                
{   
    // the game should not allow the player to pick a letter alredy used in the game -2
    // the game displays letters found in their rigth spot.
    // However as i am using an array to display letters picked by player
    // instead of null values it should have underscores.
      
    
      
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //creates my scanner object
        Random  rdWord = new Random(); // creates my random object
        String words[] = {"Mac","Windows","DOS","Linux","Solaris"}; // sort of words to be guess
        int randonWord = (rdWord.nextInt(6)); // generates the word selection from the array
        String answer  = words[randonWord];
        String guess = "" ;  // initialize the letter to choose by the player
        String firstStateWord = answer; // stores original word before game started
        boolean  gameOver = false; // flat to end the game ones game is over
        int turns =  6; // initialize the maximum player's lifes
        int letterGuessed; // stored the rigth letters picked by player
        int corrects = answer.length(); // initialized the top quantity of letters to be guess 
        String[] wordSpaces;  // assings memory to the array 
        int spots = firstStateWord.length();     // initialize the quantity of spots  to be used in the array 
        wordSpaces = new String[spots]; // creates the spots in the array memory for the letters from the word
        
        
        while (gameOver == false) {
            
        switch (turns)
        {
            case 0:     // prints hang man when no lifes
            gameOver();
            System.out.println(Arrays.toString(wordSpaces));
            System.out.println("Lifes : "+ turns);
            break;
            case 1:    // prints hang man when life is 1
            rleg();
            System.out.println(Arrays.toString(wordSpaces));
            System.out.println("Lifes : "+ turns); 
       
            break;
            case 2:   // prints hang man when lifes are 2
            lhand();
            System.out.println(Arrays.toString(wordSpaces));
            System.out.println("Lifes : "+ turns);
         
            break;
            case 3:   // prints hang man when lifes  are 3
            rhand();
            System.out.println(Arrays.toString(wordSpaces));
            System.out.println("Lifes : "+ turns);
            break;
            case 4:  // prints hang man when lifes are 4
            chest();
            System.out.println(Arrays.toString(wordSpaces));
            System.out.println("Lifes : "+ turns);  
            break;
            case 5:  // prints hang man when lifes are 5
            head();
            System.out.println(Arrays.toString(wordSpaces));
            System.out.println("Lifes : "+ turns); 
            break;
            case 6: //  prints hang manwhen lifes are  6
            Startgame();
            System.out.println(Arrays.toString(wordSpaces));
           System.out.println("Lifes : "+ turns);

        }
        
            
        if (turns == 0){
         
             gameOver = true; System.out.println("----GAME OVER!----");
             System.out.println("The word was : " + firstStateWord);

        }

        if (corrects < 1){
           
             gameOver = true; System.out.println("  Congratulations !\n You Won the Game !");
             System.out.println("The word was : " + firstStateWord);
             System.exit(0);

        }
         
         guess = sc.next();
        
        if (answer.indexOf(guess)!= -1 ){
            
               System.out.println("Wao ! That's a good letter.");
               letterGuessed = answer.indexOf(guess);
               String firstPart = answer.substring(0, letterGuessed);
               String lastPart = answer.substring(letterGuessed+1);
               answer = firstPart + lastPart;  
               corrects--; // decreses rigth to finalize the game
               wordSpaces[firstStateWord.indexOf(guess)]= guess; // alocates the letter in the rithg Spot
           
         }  else {
               System.out.println("Oh no.. Try another letter");
               turns--;
            }

        }
        

       
    }
    
 
    
    
    
    // 6
    public static void Startgame() {

        System.out.println("Welcome to HANG_MAN_GAME"); 
        System.out.println("________");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("------------------");
    }

    // 5
    public static void head() {

        System.out.println("________");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        O");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("------------------");
        
    
    }

    //4
    public static void chest() {

        System.out.println("________");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        O");
        System.out.println("        |");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("------------------");
    }

    //3
    public static void rhand() {

        System.out.println("________");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        O");
        System.out.println("        |\\");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("------------------");
    
    
    }

    //2
    public static void lhand() {

        System.out.println("________");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        O");
        System.out.println("       /|\\");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("------------------");
    
    }

    //2
    public static void rleg() {

        System.out.println("________");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        O");
        System.out.println("       /|\\");
        System.out.println("         \\");
        System.out.println("           ");
        System.out.println("------------------");

    }
    //1
    public static void gameOver() {
        
        System.out.println("_______   ");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        O");
        System.out.println("       /|\\");
        System.out.println("       / \\");
        System.out.println("           ");
        System.out.println("------------------");
 
    }
    
        
}
