import java.util.Random;

public class NPC
{
    public static void chooseBoatLocation()
    {
        Grid npcGrid = new Grid();
        
        patrolBoatLocation(npcGrid);
        submarineLocation(npcGrid);
        destroyerLocation(npcGrid);
        battleshipLocation(npcGrid);
        carrierLocation(npcGrid);
        
    }
    
    public static void patrolBoatLocation(Grid npcGrid)
    {
        Random rand = new Random();
        
        int x = rand.nextInt(10) + 1;
        
        int y = rand.nextInt(10) + 1;
        
        int d = rand.nextInt(4) + 1;
        while((x == 1 && d == 4) || (x == 10 && d == 2)  || (y == 1 && d == 1) || (y == 10 && d == 3))
        {
            d = rand.nextInt(4) + 1;
            
        }
        npcGrid.patrolBoat(x - 1, y - 1, d);
        
    }
    
    public static void submarineLocation(Grid npcGrid)
    {
        Random rand = new Random();
        
        int x = rand.nextInt(10) + 1;
        
        int y = rand.nextInt(10) + 1;
        
        int d = rand.nextInt(4) + 1;
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3))
        {
            d = rand.nextInt(4) + 1;
            
        }
        npcGrid.submarine(x - 1, y - 1, d);
        
    }
    
    public static void destroyerLocation(Grid npcGrid)
    {
        Random rand = new Random();
        
        int x = rand.nextInt(10) + 1;
        
        int y = rand.nextInt(10) + 1;
        
        int d = rand.nextInt(4) + 1;
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3))
        {
            d = rand.nextInt(4) + 1;
            
        }
        npcGrid.destroyer(x - 1, y - 1, d);
        
    }
    
    public static void battleshipLocation(Grid npcGrid)
    {
        Random rand = new Random();
        
        int x = rand.nextInt(10) + 1;
        
        int y = rand.nextInt(10) + 1;
        
        int d = rand.nextInt(4) + 1;
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 3 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (x == 8 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 3 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3) || (y == 8 && d == 3))
        {
            d = rand.nextInt(4) + 1;
            
        }
        npcGrid.battleship(x - 1, y - 1, d);
        
    }
    
    public static void carrierLocation(Grid npcGrid)
    {
        Random rand = new Random();
        
        int x = rand.nextInt(10) + 1;
        
        int y = rand.nextInt(10) + 1;
        
        int d = rand.nextInt(4) + 1;
        while((x == 1 && d == 4) || (x == 2 && d == 4) || (x == 3 && d == 4) || (x == 4 && d == 4) || (x == 10 && d == 2)  || (x == 9 && d == 2)  || (x == 8 && d == 2)  || (x == 7 && d == 2)  || (y == 1 && d == 1) || (y == 2 && d == 1) || (y == 3 && d == 1) || (y == 4 && d == 1) || (y == 10 && d == 3) || (y == 9 && d == 3) || (y == 8 && d == 3) | (y == 7 && d == 3))
        {
            d = rand.nextInt(4) + 1;
            
        }
        npcGrid.carrier(x - 1, y - 1, d);
        
    }
    
    
}