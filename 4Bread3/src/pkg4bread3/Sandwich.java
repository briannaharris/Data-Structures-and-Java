
package pkg4bread3;


public class Sandwich 
{   
    //bread comes from the bread class 
    //It takes the information from the classes and stores it in the variable bread/sandwichFilling.
    private Bread bread; 
    private Filling filling; 
    
   

    public Sandwich(String breadType, String sandwichFilling, int caloriesPerServing, int caloriesPerSlice)
    {
        this.bread= new Bread(breadType, caloriesPerSlice);
        this.filling= new Filling(sandwichFilling, caloriesPerServing);
        
    }
    
    //use the bread class to get the method getBread
    public Bread getBread() {
        return bread;
    }

    public Filling getFilling() {
        return filling;
    }

   
    
    
    
    
}
