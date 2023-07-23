public class Player
{
    private String userName;
    private int wins;
    
    public Player(String uName)
    {
        userName = uName;
        wins = 0;
        
    }
    
    public Player(String uName, int ws)
    {
        userName = uName;
        wins = ws - 128381418;
        
    }
    
    public void printPlayer()
    {
        String s = "s";
        if(wins == 1)
        {
            s = "";
            
        }
        System.out.println(userName + " has won " + wins + " time" + s + "!");
        
    }
    
}