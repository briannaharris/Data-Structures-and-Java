
package pkg4bread3;


public class TestBread 
{
    public static void main(String[] args)
    {
        Bread rye = new Bread ("Rye",100);
        Bread white = new Bread ("white",100);
        Bread wheat = new Bread ("wheat",100);
        
        displayBread(rye);
        displayBread(white);
        displayBread(wheat);
    }
        
    public static void displayBread(Bread bread)
    {
        System.out.println("Bread type " + bread.getBreadType() + "calories per slice " + bread.getCaloriesPerSlice() );
                
    }
    
}
