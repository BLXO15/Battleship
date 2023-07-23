import java.util.Scanner;

public class UI 
{
    public static void mainMenu()
    {   
        System.out.println("   1 2 3 4 5 6 7 8 9 10");
        System.out.println(" 1| o o o o o o o o o o");
        System.out.println(" 2| o o o o o o o o o o");
        System.out.println(" 3| o o o o o o o o o o");
        System.out.println(" 4| o o o o o o o o o o");
        System.out.println(" 5| o o o o o o o o o o");
        System.out.println(" 6| o o o o o o o o o o");
        System.out.println(" 7| o o o o o o o o o o");
        System.out.println(" 8| o o o o o o o o o o");
        System.out.println(" 9| o o o o o o o o o o");
        System.out.println("10| o o o o o o o o o o");
        System.out.println("");
        System.out.println("***Welcome To Battleship***");
        System.out.println("");
        System.out.println("    Select Game Mode    ");
        System.out.println("");
        System.out.println("[1] - Single Player");
        System.out.println("[2] - Multiplayer");
        System.out.println("[3] - Resume Previous Game");
        
        int sOm = Keyboard.getInt("\n");
        System.out.println("\n");
        if(sOm == 1)
        {
            String uName = getUsername(1, "Player 1", 0);
            
            String firstLetter = uName.substring(0, 1);
            String remainingLetters = uName.substring(1, uName.length());
            firstLetter = firstLetter.toUpperCase();
            remainingLetters = remainingLetters.toLowerCase();
            uName = firstLetter + remainingLetters;
            
            Game.singlePlayer(uName);
            
        }
        else if(sOm == 2)
        {
            String uName1 = getUsername(4, "Player ", 0);
            
            String firstLetter1 = uName1.substring(0, 1);
            String remainingLetters1 = uName1.substring(1, uName1.length());
            firstLetter1 = firstLetter1.toUpperCase();
            remainingLetters1 = remainingLetters1.toLowerCase();
            uName1 = firstLetter1 + remainingLetters1;
            
            String uName2 = getUsername(5, "Player ", 0);
            
            String firstLetter2 = uName2.substring(0, 1);
            String remainingLetters2 = uName2.substring(1, uName2.length());
            firstLetter2 = firstLetter2.toUpperCase();
            remainingLetters2 = remainingLetters2.toLowerCase();
            uName2 = firstLetter2 + remainingLetters2;
            
            Game.multiPlayer(uName1, uName2);
            
        }
        else if(sOm == 3)
        {
            int code = Keyboard.getInt("What is your Code ");
            System.out.println("\n");
            String uName = getUsername(3, "Player 1", code);
            
            String firstLetter = uName.substring(0, 1);
            String remainingLetters = uName.substring(1, uName.length());
            firstLetter = firstLetter.toUpperCase();
            remainingLetters = remainingLetters.toLowerCase();
            uName = firstLetter + remainingLetters;
            
            Game.singlePlayer(uName);
            
        }
        else
        {
            System.out.println("\n");
            System.out.println("[1] - Single Player");
            System.out.println("[2] - Multiplayer");
            int sOm2 = Keyboard.getInt("--> ");
            
        }
        
    }
    
    public static String getUsername(int playerNum, String userPrompt,int code)
    {
        String ask = "    Chose Username  \n";
        if(playerNum == 1)
        {
            System.out.println(ask);
            String name = Keyboard.getString(userPrompt);
            Player p1 = new Player(name);
            return name;
            
        }
        else if(playerNum == 4)
        {
            System.out.println(ask);
            String nameP1 = Keyboard.getString(userPrompt + "1");
            Player p1 = new Player(nameP1);
            return nameP1;
            
        }
        else if(playerNum == 5)
        {
            String nameP2 = Keyboard.getString(userPrompt + "2");
            Player p2 = new Player(nameP2);
            return nameP2;
            
        }
        else
        {
            System.out.println(ask);
            String name = Keyboard.getString(userPrompt);
            Player p1 = new Player(name, code);
            System.out.println("");
            p1.printPlayer();
            return name;
            
        }
        
    }
    
    public static void gameOver(String w)
    {
        String won = "    " + w + " Wins!!!";
        for(;;)
        {
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("      H H H H");
            System.out.println("    H");
            System.out.println("    H");
            System.out.println("    H");
            System.out.println("    H");
            System.out.println("    H     H H H");
            System.out.println("    H         H");
            System.out.println("      H H H   H");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(200);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("      H H H H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H H H H H H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("\n" + won);
            
            try
            {
            Thread.sleep(200);
             
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("    H         H");
            System.out.println("    H H     H H");
            System.out.println("    H   H H   H");
            System.out.println("    H    H    H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H ");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(200);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("      H H H H H");
            System.out.println("    H");
            System.out.println("    H");
            System.out.println("    H");
            System.out.println("    H H H H H");
            System.out.println("    H");
            System.out.println("    H");
            System.out.println("      H H H H H");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(200);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.println("\033[H\033[2J" + "\n\n\n\n\n\n\n\n");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(200);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }        
            
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("      H H H H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("    H         H");
            System.out.println("      H H H H");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(200);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("    H        H");
            System.out.println("    H        H");
            System.out.println("    H        H");
            System.out.println("    H        H");
            System.out.println("    H        H");
            System.out.println("    H        H");
            System.out.println("      H    H");
            System.out.println("       H H");
            System.out.println("\n" + won);
            
            try
                {
            Thread.sleep(200);
             
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.print("\033[H\033[2J");
            System.out.println("");
            System.out.println("      H H H H H    ");
            System.out.println("    H              ");
            System.out.println("    H              ");
            System.out.println("    H H H H H      ");
            System.out.println("    H              ");
            System.out.println("    H              ");
            System.out.println("    H              ");
            System.out.println("      H H H H H    ");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(200);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
            System.out.print("\033[H\033[2J");
            System.out.println("                   ");
            System.out.println("      H H H H      ");
            System.out.println("    H         H    ");
            System.out.println("    H         H    ");
            System.out.println("    H       H      ");
            System.out.println("    H H H H        ");
            System.out.println("    H       H      ");
            System.out.println("    H         H    ");
            System.out.println("    H         H    ");
            System.out.println("\n" + won);
            
            try
            {
               Thread.sleep(1000);
               
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
                
            }
            
        }
        
    }
    
}