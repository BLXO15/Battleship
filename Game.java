public class Game
{
    public static void singlePlayer(String uname)
    {
        Grid grid1 = new Grid();
        chooseBoatLocation(grid1, uname);
        //AI Funtion to makes grid
        //firing function is called
        //GAME OVER Function 
    }//QUARITINE ZONE
    
    public static void multiPlayer(String uNameP1, String uNameP2)
    {
        int gameWinner = 0;
        System.out.println("\n");
        System.out.print("\033[H\033[2J");
        System.out.println(uNameP2 + ", turn around and don't look at the screen.");
        Grid grid1 = new Grid();
        chooseBoatLocation(grid1, uNameP1);
        
        System.out.println("\n");
        System.out.print("\033[H\033[2J");
        System.out.println(uNameP1 + ", turn around and don't look at the screen.");
        Grid grid2 = new Grid();
        chooseBoatLocation(grid2, uNameP2);
        
        gameWinner = Game.multiFiring(grid1, grid2, uNameP1, uNameP2);
        String winner = "";
        if(gameWinner == 1)
        {
            winner = uNameP1;
            
        }
        if(gameWinner == 2)
        {
            winner = uNameP2;
            
        }
        if(gameWinner == 3)
        {
            winner = "Nobody";
            
        }
        int jsjbf = 0;
        while(jsjbf == 0)
        {
            jsjbf = Keyboard.getInt("Press any number other that 0 to continue");
            
        }
        UI.gameOver(winner);
        
    }
    
    public static int multiFiring(Grid grid1, Grid grid2, String uNameP1, String uNameP2)
    {
        int finalTally = 0;
        boolean playerOneVictory = false; 
        boolean playerTwoVictory = false;
        int turnCounter = 1;
        
        while(playerOneVictory != true && playerTwoVictory != true)
        {
            int nextTurn = 0;
            if(turnCounter % 2 == 1)
            {
                System.out.print("\033[H\033[2J");
                System.out.println(uNameP1 + " Shoot");
                grid2.printGrid2();
                grid2.fire();
                grid2.printGrid2();
                nextTurn = 0;
                while(nextTurn == 0)
                {
                    nextTurn = Keyboard.getInt("Press any number except 0 to continue");
                    
                }
                turnCounter++;
                
                if(grid2.sunkChecker() == 5)
                {
                   playerOneVictory = true;
                   
                }
                
            }
            int nextTurner = 0;
            if(turnCounter % 2 == 0)
            {
                System.out.print("\033[H\033[2J");
                System.out.println(uNameP2 + " Shoot");
                grid1.printGrid2();
                grid1.fire();
                grid1.printGrid2();
                nextTurner = 0;
                while(nextTurner == 0)
                {
                    nextTurner = Keyboard.getInt("Press any number except 0 to continue");
                }
                turnCounter++;
                if(grid1.sunkChecker() == 5)
                {
                   playerTwoVictory = true;
                   
                }
                
            }
            
        }
        
        if(playerOneVictory == true)
        {
            finalTally = 1;
            
        }
        
        if(playerTwoVictory == true)
        {
            finalTally = 2;
            
        }
        
        if(playerOneVictory == true && playerTwoVictory == true)
        {
            finalTally = 3;
            
        }
        return finalTally;
        
    }
    
    public static void chooseBoatLocation(Grid grid, String uname)
    {
        System.out.print("\033[H\033[2J");
        grid.printGrid();
        patrolBoatLocation(grid, uname);
        
        System.out.print("\033[H\033[2J");
        grid.printGrid();
        submarineLocation(grid, uname);
        
        System.out.print("\033[H\033[2J");
        grid.printGrid();
        destroyerLocation(grid, uname);
        
        System.out.print("\033[H\033[2J");
        grid.printGrid();
        battleshipLocation(grid, uname);
        
        System.out.print("\033[H\033[2J");
        grid.printGrid();
        carrierLocation(grid, uname);
        
        System.out.print("\033[H\033[2J");
        grid.printGrid();
        
        System.out.println("\n\n");
        boolean done = Keyboard.getBoolean("Are you happy with this layout? (Y or N)");
        if(done == false)
        {
            grid.gridClear();
            chooseBoatLocation(grid, uname);
            
        }
    
    }
    
    public static void patrolBoatLocation(Grid grid, String uname)
    {
        String xp = ("What is the X position of the boat" + "\n" + "[1 - 10]" + "\n");
        String yp = ("\n" + "\n" + "What is the Y position of the boat" + "\n" + "[1 - 10]" + "\n");
        String dc = ("\n" + "\n" + "Which way is the boat pointed" + "\n" + "[1] - North" + "\n" + "[2] - East" + "\n" + "[3] - South" + "\n" + "[4] - West" + "\n");
        String minMax = ("\n" + "\n" + "Must be between 1 - 10" + "\n");
        
        System.out.println("\n\n");
        System.out.println("    " + uname + " Select Patrol-Boat Location    ");
        
        System.out.print(xp);
        int x = Keyboard.getInt("\n");
        while(x < 1 || x > 10)
        {
            System.out.print(minMax);
            x = Keyboard.getInt("\n");
            
        }
        
        System.out.print(yp);
        int y = Keyboard.getInt("\n");
        while(y < 1 || y > 10)
        {
            System.out.print(minMax);
            y = Keyboard.getInt("\n");
            
        }
        
        System.out.print(dc);
        int d = Keyboard.getInt("\n");
        while((x == 1 && d == 4) || (x == 10 && d == 2)  || (y == 1 && d == 1) || (y == 10 && d == 3) || (d < 1) || (d > 4))
        {
            System.out.println("");
            System.out.println("Boat cannot be pointed in that direction");
            System.out.print(dc);
            d = Keyboard.getInt("\n");
            System.out.println("");
            
        }
        boolean pbO = grid.checkForOverLapPatrol(x - 1, y - 1, d);
        if(pbO == true)
        {
            System.out.println("\n");
            System.out.println("Try a different location");
            System.out.println("");
            patrolBoatLocation(grid, uname);
            
        }
        else
        {
            grid.patrolBoat(x - 1, y - 1, d);
            
        }
        
    }
    
    public static void submarineLocation(Grid grid, String uname)
    {
        String xp = ("What is the X position of the submarine" + "\n" + "[1 - 10]" + "\n");
        String yp = ("\n" + "\n" + "What is the Y position of the submarine" + "\n" + "[1 - 10]" + "\n");
        String dc = ("\n" + "\n" + "Which way is the submarine pointed" + "\n" + "[1] - North" + "\n" + "[2] - East" + "\n" + "[3] - South" + "\n" + "[4] - West" + "\n");
        String minMax = ("\n" + "\n" + "Must be between 1 - 10" + "\n");
        
        System.out.println("\n\n");
        System.out.println("    " + uname + " Select Submarine Location    ");
        
        System.out.print(xp);
        int x = Keyboard.getInt("\n");
        while(x < 1 || x > 10)
        {
            System.out.print(minMax);
            x = Keyboard.getInt("\n");
            
        }
        
        System.out.print(yp);
        int y = Keyboard.getInt("\n");
        while(y < 1 || y > 10)
        {
            System.out.print(minMax);
            y = Keyboard.getInt("\n");
            
        }
        
        System.out.print(dc);
        int d = Keyboard.getInt("\n");
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3) || (d < 1) || (d > 4))
        {
            System.out.println("");
            System.out.println("Submarine cannot be pointed in that direction");
            System.out.print(dc);
            d = Keyboard.getInt("\n");
            System.out.println("");
            
        }
        boolean pbO = grid.checkForOverLapSubmarine(x - 1, y - 1, d);
        if(pbO == true)
        {
            System.out.println("\n");
            System.out.println("Try a different location");
            System.out.println("");
            submarineLocation(grid, uname);
            
        }
        else
        {
            grid.submarine(x - 1, y - 1, d);
            
        }
        
    }
    
    public static void destroyerLocation(Grid grid, String uname)
    {
        String xp = ("What is the X position of the destroyer" + "\n" + "[1 - 10]" + "\n");
        String yp = ("\n" + "\n" + "What is the Y position of the destroyer" + "\n" + "[1 - 10]" + "\n");
        String dc = ("\n" + "\n" + "Which way is the destroyer pointed" + "\n" + "[1] - North" + "\n" + "[2] - East" + "\n" + "[3] - South" + "\n" + "[4] - West" + "\n");
        String minMax = ("\n" + "\n" + "Must be between 1 - 10" + "\n");
        
        System.out.println("\n\n");
        System.out.println("    " + uname + " Select Destroyer Location    ");
        
        System.out.print(xp);
        int x = Keyboard.getInt("\n");
        while(x < 1 || x > 10)
        {
            System.out.print(minMax);
            x = Keyboard.getInt("\n");
            
        }
        
        System.out.print(yp);
        int y = Keyboard.getInt("\n");
        while(y < 1 || y > 10)
        {
            System.out.print(minMax);
            y = Keyboard.getInt("\n");
            
        }
        
        System.out.print(dc);
        int d = Keyboard.getInt("\n");
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3) || (d < 1) || (d > 4))
        {
            System.out.println("");
            System.out.println("Destroyer cannot be pointed in that direction");
            System.out.print(dc);
            d = Keyboard.getInt("\n");
            System.out.println("");
            
        }
        boolean pbO = grid.checkForOverLapDestroyer(x - 1, y - 1, d);
        if(pbO == true)
        {
            System.out.println("\n");
            System.out.println("Try a different location");
            System.out.println("");
            destroyerLocation(grid, uname);
            
        }
        else
        {
            grid.destroyer(x - 1, y - 1, d);
            
        }
        
    }
    
    public static void battleshipLocation(Grid grid, String uname)
    {
        String xp = ("What is the X position of the battleship" + "\n" + "[1 - 10]" + "\n");
        String yp = ("\n" + "\n" + "What is the Y position of the battleship" + "\n" + "[1 - 10]" + "\n");
        String dc = ("\n" + "\n" + "Which way is the battleship pointed" + "\n" + "[1] - North" + "\n" + "[2] - East" + "\n" + "[3] - South" + "\n" + "[4] - West" + "\n");
        String minMax = ("\n" + "\n" + "Must be between 1 - 10" + "\n");
        
        System.out.println("\n\n");
        System.out.println("    " + uname + " Select Battleship Location    ");
        
        System.out.print(xp);
        int x = Keyboard.getInt("\n");
        while(x < 1 || x > 10)
        {
            System.out.print(minMax);
            x = Keyboard.getInt("\n");
            
        }
        
        System.out.print(yp);
        int y = Keyboard.getInt("\n");
        while(y < 1 || y > 10)
        {
            System.out.print(minMax);
            y = Keyboard.getInt("\n");
            
        }
        
        System.out.print(dc);
        int d = Keyboard.getInt("\n");
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 3 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (x == 8 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 3 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3) || (y == 8 && d == 3) || (d < 1) || (d > 4))
        {
            System.out.println("");
            System.out.println("Battleship cannot be pointed in that direction");
            System.out.print(dc);
            d = Keyboard.getInt("\n");
            System.out.println("");
            
        }
        boolean pbO = grid.checkForOverLapBattleShip(x - 1, y - 1, d);
        if(pbO == true)
        {
            System.out.println("\n");
            System.out.println("Try a different location");
            System.out.println("");
            battleshipLocation(grid, uname);
            
        }
        else
        {
            grid.battleship(x - 1, y - 1, d);
            
        }
        
    }
    
    public static void carrierLocation(Grid grid, String uname)
    {
        String xp = ("What is the X position of the carrier" + "\n" + "[1 - 10]" + "\n");
        String yp = ("\n" + "\n" + "What is the Y position of the carrier" + "\n" + "[1 - 10]" + "\n");
        String dc = ("\n" + "\n" + "Which way is the carrier pointed" + "\n" + "[1] - North" + "\n" + "[2] - East" + "\n" + "[3] - South" + "\n" + "[4] - West" + "\n");
        String minMax = ("\n" + "\n" + "Must be between 1 - 10" + "\n");
        
        System.out.println("\n\n");
        System.out.println("    " + uname + " Select Carrier Location    ");
        
        System.out.print(xp);
        int x = Keyboard.getInt("\n");
        while(x < 1 || x > 10)
        {
            System.out.print(minMax);
            x = Keyboard.getInt("\n");
            
        }
        
        System.out.print(yp);
        int y = Keyboard.getInt("\n");
        while(y < 1 || y > 10)
        {
            System.out.print(minMax);
            y = Keyboard.getInt("\n");
            
        }
        
        System.out.print(dc);
        int d = Keyboard.getInt("\n");
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 3 && d == 4) || (x == 4 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (x == 8 && d == 2)  || (x == 7 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 3 && d == 1) || (y == 4 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3) || (y == 8 && d == 3) | (y == 7 && d == 3) || (d < 1) || (d > 4))
        {
            System.out.println("");
            System.out.println("Carrier cannot be pointed in that direction");
            System.out.print(dc);
            d = Keyboard.getInt("\n");
            System.out.println("");
            
        }
        boolean pbO = grid.checkForOverLapCarrier(x - 1, y - 1, d);
        if(pbO == true)
        {
            System.out.println("\n");
            System.out.println("Try a different location");
            System.out.println("");
            carrierLocation(grid, uname);
            
        }
        else
        {
            grid.carrier(x - 1, y - 1, d);
            
        }
        
    }
    
    
}