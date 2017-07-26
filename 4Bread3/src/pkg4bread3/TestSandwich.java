
package pkg4bread3;


public class TestSandwich 
{
    public static void main(String[] args) 
    {
        //(String breadType, String sandwichFilling, int caloriesPerSlice, int caloriesPerServing
        Sandwich rubin = new Sandwich ("Rye","meat",200, 100);
        Sandwich english = new Sandwich ("white","cheese",100,90);
        Sandwich health = new Sandwich ("wheat","veggie",100,50);
        
    
     displayValue(rubin);
     displayValue(english);
     displayValue(health);
     
    }
    
    public static void displayValue(Sandwich bread)
    {
        System.out.println("Bread Type: " + bread.getBread().getBreadType());
        //bread is an instance of the sandwich class 
        //getFilling is returning an instance of the filling class
        //getSandwichFillling method is returning a string with the name of the value of the filling. 
        System.out.println("Sandwich Filling: " + bread.getFilling().getSandwichFilling());
    }
     
     
    
}
