
package pkg4bread3;


public class Bread 
{   
    private String breadType;
    private int caloriesPerSlice;
    public final String MOTTO = "the staff of life";
    

    public Bread(String breadType, int caloriesPerSlice) 
    {
        this.breadType=breadType;
        this.caloriesPerSlice=caloriesPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

   

    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }


   
 }
    

