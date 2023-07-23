import java.util.Scanner;

public class Keyboard
{
  public static String getString(String userPrompt)
  {
    System.out.print(userPrompt + "--> ");
    Scanner input = new Scanner(System.in);
    String stringVal = input.nextLine();
    return stringVal;
    
  }

  public static int getInt(String userPrompt)
  {
    System.out.print(userPrompt + "--> ");
    Scanner input = new Scanner(System.in);
    int intVal = input.nextInt();
    return intVal;
    
  }

  public static double getDouble(String userPrompt)
  {
    System.out.print(userPrompt + "--> ");
    Scanner input = new Scanner(System.in);
    double doubleVal = input.nextDouble();
    return doubleVal;
    
  }

  public static boolean getBoolean(String userPrompt)
  {
    System.out.print(userPrompt + "--> ");
    Scanner input = new Scanner(System.in);
    String booleanVal = input.nextLine();
    boolean x = sToB(booleanVal, userPrompt);
    System.out.println();
    return x;
    
  }

  public static boolean sToB(String b1, String userPrompt)
  {
    boolean b2 = true;
    String[] yes = {"y", "Y", "yes", "Yes", "YES", "t", "T", "true", "True", "TRUE"};
    String[] no = {"n", "N", "no", "No", "NO", "f", "F", "false", "False", "FALSE"};
    
    for (String s : yes)
    {
        if (b1.equals(s))
        {
            return true;
            
        }
        else
        {
            b2 = false;
            
        }
        
    }
    
    for (String s : no)
    {
        if (b1.equals(s))
        {
            return false;
            
        }
        else
        {
            b2 = false;
            
        }
        
    }
    
    if(b2 == false)
    {
        System.out.println("This is a yes or no question, please answer with (y / n). \n");
        //Keyboard.getBoolean(userPrompt); //Not Working yet
      
    }
    return false;
    
  }
  
}