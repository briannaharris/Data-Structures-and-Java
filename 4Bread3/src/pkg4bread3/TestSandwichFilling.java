
package pkg4bread3;


public class TestSandwichFilling
{
      public static void main(String[] args) 
    {
        Filling cheese = new Filling("swiss", 90);
        Filling meat = new Filling("chicken",200);
        Filling vegan = new Filling("veggie",50);
        
        
        displayFilling(cheese);
        displayFilling(meat);
        displayFilling(vegan);
    }
      public static void displayFilling(Filling bread){
          System.out.println("Sandwich filling cheese is: " + bread.getSandwichFilling()+ "Calories In Serving: " + bread.getCaloriesInServing());
      }
}
