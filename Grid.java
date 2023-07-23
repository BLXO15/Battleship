public class Grid 
{
    private String[][] grid;
    private String[][] grid2;
    
    public Grid()
    {
        grid = new String[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                grid[i][j] = "o";
                
            }
            
        }
        grid2 = new String[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                grid2[i][j] = "o";
                
            }
            
        }
        
    }//Makes a grid object
    
    public void gridClear()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                grid2[i][j] = "o";
                grid[i][j] = "o";
            }
        }
    }
    public int gridChecker(String value){
        int returner = 0;
         for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(grid[i][j].equals(value))
                {
                    returner = returner + 1;
                    
                }
                
            }
            
        }
        return returner;
    }
    
    //P=A, S=U, D=E, B=T, C=R
    public int sunkChecker()
    {
        int returner = 0;
        if(gridChecker("A") == 2)
        {
            returner++;
            
        }
        if(gridChecker("U") == 3)
        {
            returner++;
            
        }
        if(gridChecker("E") == 3)
        {
            returner++;
            
        }
        if(gridChecker("T") == 4)
        {
            returner++;
            
        }
        if(gridChecker("R") == 5)
        {
            returner++;
            
        }
        return returner;
        
    }
    
    
    public void printGrid()
    {
        System.out.println("   1 2 3 4 5 6 7 8 9 10");
        for(int i = 0; i < 10; i++)
        {
            int b = i + 1;
            if(i < 9)
            {
                System.out.print(" " + b + "| ");
                
            }
            else
            {
                System.out.print(b + "| ");
                
            }
            for(int j = 0; j < 10; j++)
            {
                System.out.print(grid[i][j] + " ");
                
            }
            System.out.println();
            
        }
        
    }//"Real" Grid shows where everything is and if stuff is dead
    
    public void printGrid2()
    {
        System.out.println("    1 2 3 4 5 6 7 8 9 10");
        for(int i = 0; i < 10; i++)
        {
            int b = i + 1;
            if(i < 9)
            {
                System.out.print(" " + b + "| ");
                
            }
            else
            {
                System.out.print(b + "| ");
                
            }
            for(int j = 0; j < 10; j++)
            {
                System.out.print(grid2[i][j] + " ");
                
            }
            System.out.println();
            
        }
        
    }//Player grid, only shows what has been hit 
    
    public void patrolBoat(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            grid[yCord][xCord] = "P";
            grid[yCord - 1][xCord] = "P";
            
        }//north
        
        if(angle == 2)
        {
            grid[yCord][xCord] = "P";
            grid[yCord][xCord + 1] = "P";
            
        }//east
        
        if(angle == 3)
        {
            grid[yCord][xCord] = "P";
            grid[yCord + 1][xCord] = "P";
            
        }//south
        
        if(angle == 4)
        {
            grid[yCord][xCord] = "P";
            grid[yCord][xCord - 1] = "P";
            
        }//west
        
    }//Makes a partol boat 
    
    public void submarine(int xCord, int yCord, int angle)
    {
        
        if(angle == 1)
        {
            grid[yCord][xCord] = "S";
            grid[yCord - 1][xCord] = "S";
            grid[yCord - 2][xCord] = "S";
            
        }//North
        
        if(angle == 2)
        {
            grid[yCord][xCord] = "S";
            grid[yCord][xCord + 1] = "S";
            grid[yCord][xCord + 2] = "S";
            
        }//East
        
        if(angle == 3)
        {
            grid[yCord][xCord] = "S";
            grid[yCord + 1][xCord] = "S";
            grid[yCord + 2][xCord] = "S";
            
        }//Sowuth
        
        if(angle == 4)
        {
            grid[yCord][xCord] = "S";
            grid[yCord][xCord - 1] = "S";
            grid[yCord][xCord - 2] = "S";
            
        }//West
        
    }//Makes a Submarine 

    public void destroyer(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            grid[yCord][xCord] = "D";
            grid[yCord - 1][xCord] = "D";
            grid[yCord - 2][xCord] = "D";
            
        }//North
        
        if(angle == 2)
        {
            grid[yCord][xCord] = "D";
            grid[yCord][xCord + 1] = "D";
            grid[yCord][xCord + 2] = "D";
            
        }//East
        
        if(angle == 3)
        {
            grid[yCord][xCord] = "D";
            grid[yCord + 1][xCord] = "D";
            grid[yCord + 2][xCord] = "D";
            
        }//South
        
        if(angle == 4)
        {
            grid[yCord][xCord] = "D";
            grid[yCord][xCord - 1] = "D";
            grid[yCord][xCord - 2] = "D";
            
        }//West
        
    }//Makes a Destroyer

    public void battleship(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            grid[yCord][xCord] = "B";
            grid[yCord - 1][xCord] = "B";
            grid[yCord - 2][xCord] = "B";
            grid[yCord - 3][xCord] = "B";
            
        }//North
        
        if(angle == 2)
        {
            grid[yCord][xCord] = "B";
            grid[yCord][xCord + 1] = "B";
            grid[yCord][xCord + 2] = "B";
            grid[yCord][xCord + 3] = "B";
            
        }//East
        
        if(angle == 3)
        {
            grid[yCord][xCord] = "B";
            grid[yCord + 1][xCord] = "B";
            grid[yCord + 2][xCord] = "B";
            grid[yCord + 3][xCord] = "B";
            
        }//South
        
        if(angle == 4)
        {
            grid[yCord][xCord] = "B";
            grid[yCord][xCord - 1] = "B";
            grid[yCord][xCord - 2] = "B";
            grid[yCord][xCord - 3] = "B";
            
        }//West
        
    }//Makes a Battleship

    public void carrier(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            grid[yCord][xCord] = "C";
            grid[yCord - 1][xCord] = "C";
            grid[yCord - 2][xCord] = "C";
            grid[yCord - 3][xCord] = "C";
            grid[yCord - 4][xCord] = "C";
            
        }//North
        
        if(angle == 2)
        {
            grid[yCord][xCord] = "C";
            grid[yCord][xCord + 1] = "C";
            grid[yCord][xCord + 2] = "C";
            grid[yCord][xCord + 3] = "C";
            grid[yCord][xCord + 4] = "C";
            
        }//East
        
        if(angle == 3)
        {
            grid[yCord][xCord] = "C";
            grid[yCord + 1][xCord] = "C";
            grid[yCord + 2][xCord] = "C";
            grid[yCord + 3][xCord] = "C";
            grid[yCord + 4][xCord] = "C";
            
        }//South
        
        if(angle == 4)
        {
            grid[yCord][xCord] = "C";
            grid[yCord][xCord - 1] = "C";
            grid[yCord][xCord - 2] = "C";
            grid[yCord][xCord - 3] = "C";
            grid[yCord][xCord - 4] = "C";
            
        }//West
        
    }//Makes a Carrier
//P=A, S=U, D=E, B=T, C=R
    public void fire()
    {
        int x = 0;
        int y = 0;
        int back = 2;
        int foward = 2;
        while(back == 2 || foward == 2)
        {
            System.out.println("\n\n" + "Please choose a X cordinate to fire at");
            System.out.println("[1 - 10]");
            int xCord = Keyboard.getInt("");
            System.out.println("\n" + "Please choose a Y cordinate to fire at");
            System.out.println("[1 - 10]");
            int yCord = Keyboard.getInt("");
            
            if(xCord < 11 && xCord > 0)
            {
                foward = 3;
                x = xCord - 1;
                
            }
            if(yCord < 11 && yCord > 0)
            {
                back = 3;
                y = yCord - 1;
            }
            
        }
        //P=A, S=U, D=E, B=T, C=R
        if(grid[y][x].equals("☓") || grid[y][x].equals("A") || grid[y][x].equals("U") || grid[y][x].equals("E") || grid[y][x].equals("T") || grid[y][x].equals("R"))
        {
            System.out.println("YOU ALREADY HIT THERE");
            fire();
            
        }
        
        if(grid[y][x].equals("o"))
        {
            System.out.println("MISS");
            grid2[y][x] = "M";
            grid[y][x] = "☓";
            
        }
        if(grid[y][x].equals("S"))
        {
            System.out.println("HIT SUBMARINE");
            grid2[y][x] = "S";
            grid[y][x] = "U";
            
        }
        
        if(grid[y][x].equals("D"))
        {
            System.out.println("HIT DESTROYER");
            grid2[y][x] = "D";
            grid[y][x] = "E";
            
        }
        
        if(grid[y][x].equals("P"))
        {
            System.out.println("HIT PATROLBOAT");
            grid2[y][x] = "P";
            grid[y][x] = "A";
            
        }
        
        if(grid[y][x].equals("B"))
        {
            System.out.println("HIT BATTLESHIP");
            grid2[y][x] = "B";
            grid[y][x] = "T";
            
        }
        
        if(grid[y][x].equals("C"))
        {
            System.out.println("HIT CARRIER");
            grid2[y][x] = "C";
            grid[y][x] = "R";
                
        }
        
    }
    
    public boolean checkForOverLapPatrol(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            if((grid[yCord][xCord] == "o") || (grid[yCord - 1][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//north
        
        if(angle == 2)
        {
            if((grid[yCord][xCord] == "o") || (grid[yCord][xCord + 1] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//east
        
        if(angle == 3)
        {
            if((grid[yCord][xCord] == "o") || (grid[yCord + 1][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//south
        
        if(angle == 4)
        {
            if((grid[yCord][xCord] == "o") || (grid[yCord][xCord - 1] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }
        return false;
        
    }
    
    public boolean checkForOverLapDestroyer(int xCord, int yCord, int angle)
    {
       if(angle == 1)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord - 1][xCord] == "o") && (grid[yCord - 2][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//north
        
        if(angle == 2)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord + 1] == "o") && (grid[yCord][xCord + 2] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//east
        
        if(angle == 3)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord + 1][xCord] == "o") && (grid[yCord + 2][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//south
        
        if(angle == 4)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord - 1] == "o") && (grid[yCord][xCord - 2] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }
        return false; 
        
    }
    
    public boolean checkForOverLapSubmarine(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord - 1][xCord] == "o") && (grid[yCord - 2][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//north
        
        if(angle == 2)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord + 1] == "o") && (grid[yCord][xCord + 2] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//east
        
        if(angle == 3)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord + 1][xCord] == "o") && (grid[yCord + 2][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//south
        
        if(angle == 4)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord - 1] == "o") && (grid[yCord][xCord - 2] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }
        return false; 
        
    }
    
    public boolean checkForOverLapBattleShip(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord - 1][xCord] == "o") && (grid[yCord - 2][xCord] == "o") && (grid[yCord - 3][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//north
        
        if(angle == 2)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord + 1] == "o") && (grid[yCord][xCord + 2] == "o") && (grid[yCord][xCord + 3] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//east
        
        if(angle == 3)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord + 1][xCord] == "o") && (grid[yCord + 2][xCord] == "o") && (grid[yCord + 3][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//south
        
        if(angle == 4)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord - 1] == "o") && (grid[yCord][xCord - 2] == "o") && (grid[yCord][xCord - 3] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }
        return false; 
        
    }
    
    public boolean checkForOverLapCarrier(int xCord, int yCord, int angle)
    {
        if(angle == 1)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord - 1][xCord] == "o") && (grid[yCord - 2][xCord] == "o") && (grid[yCord - 3][xCord] == "o") && (grid[yCord - 4][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//north
        
        if(angle == 2)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord + 1] == "o") && (grid[yCord][xCord + 2]  == "o") && (grid[yCord][xCord + 3] == "o") && (grid[yCord][xCord + 4] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//east
        
        if(angle == 3)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord + 1][xCord] == "o") && (grid[yCord + 2][xCord] == "o") && (grid[yCord + 3][xCord] == "o") && (grid[yCord + 4][xCord] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }//south
        
        if(angle == 4)
        {
            if((grid[yCord][xCord] == "o") && (grid[yCord][xCord - 1] == "o") && (grid[yCord][xCord - 2] == "o") && (grid[yCord][xCord - 3] == "o") && (grid[yCord][xCord - 4] == "o"))
            {
                return false;
                
            }
            else
            {
                return true;
                
            }
            
        }
        return false; 
        
    }
    
}