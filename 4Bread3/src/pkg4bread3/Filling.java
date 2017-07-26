
package pkg4bread3;


public class Filling
{
    private String sandwichFilling;
    private int caloriesInServing;

    public Filling(String sandwichFilling, int caloriesInServing)
    {
        this.sandwichFilling=sandwichFilling; 
        this.caloriesInServing=caloriesInServing; 
    }

    public String getSandwichFilling() {
        return sandwichFilling;
    }

    public int getCaloriesInServing() {
        return caloriesInServing;
    }
    
    
  
}
