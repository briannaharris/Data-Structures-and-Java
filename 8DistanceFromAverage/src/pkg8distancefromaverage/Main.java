
package pkg8distancefromaverage;
import java.util.Scanner;
public class Main 
{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double [10];
        double entry; 
        double total = 0;
        double average =0;
        final int QUIT = 9999;
        int x = 0, y;
        System.out.println("Enter a numberic value of" + QUIT + " to quit >> ");
        entry = input.nextDouble();
        while(entry !=QUIT && x < numbers.length)
        {
            numbers[x] = entry;
            total += numbers[x];
            ++x;
            if(x< numbers.length)
            {
                System.out.println("Enter the numberic value or " + QUIT + "TO QUIT>> ");
                entry = input.nextDouble();
                
            }
            
        }
        if(x == 0)
            System.out.println("Average cannot be commputed becsu no numbers were entered");
        else
        {
            average = total / x;
            System.out.println("You entered " + x + "numbers adn their average is " + average);
            for(y = 0; y< x ; ++y)
                System.out.println(numbers[y] + "is" + (numbers[y] - average) + " away from the average ");
                
                   
        }
        
        
        
    }
    
}
