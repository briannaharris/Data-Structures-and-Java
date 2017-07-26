//Next, create an application that prompts the user for data for a babysitting job. 
//Keep prompting the user for each of the following values until they are valid:
//l A four-digit year between 2013 and 2025 inclusive l A job number for the year
//between 1 and 9999 inclusive l A babysitter code of 1, 2, or 3
// A number of children for the job between 1 and 9 inclusive 
//l A number of hours between 1 and 12 inclusive



package pkg6babysittingjob2;

import java.util.Scanner;
public class CreateBabysittingJob 
{
    public static void main(String[] args)
            
            
    {
                
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a four digit year between 2013 and 2025; ");
        int year = input.nextInt();
        
        //only for the year conditions in the while statement
        while(year<2013 || year>2025)
        {
           System.out.println("please enter the correct value");
           System.out.println("Please enter a job number for the year");
           year = input.nextInt();
     
        }
        
        // job number for the year between 1 and 9999 inclusive 
        
        System.out.println(" Please enter a job number between 1 and 9999 ");
        int jobNumber = input.nextInt();
        
        while(jobNumber<1 || jobNumber >9999)
        {
            System.out.println("please enter a correct job number between 1 & 9999 ");
            jobNumber = input.nextInt();
            
        }
        
        //ask for a babysitter code
        System.out.println(" Please enter a babysitter code between 1 & 3 ");
        int code = input.nextInt();
        
        while(code<1 || code > 3){
            System.out.println(" please enter a code between 1 & 3 ");
            code = input.nextInt();
        }
        
        // A number of children for the job between 1 and 9 inclusive 
           System.out.println(" Please enter the number of children between 1 & 9  ");
            int children= input.nextInt();
        
            while(children<1 || children > 9)
            {
            System.out.println(" please enter the nubmer of children between 1 & 9 ");
            children= input.nextInt();
        }
            
            //l A number of hours between 1 and 12 inclusive
           System.out.println(" Please enter the number of hours between 1 & 12  ");
            int hours= input.nextInt();
        
            while(hours<1 || hours > 12)
            {
            System.out.println(" please enter the nubmer of children between 1 & 12 ");
            hours = input.nextInt();
        }   
            
            Babysittingjob a1 = new Babysittingjob(jobNumber, children, hours, year, code);
            a1.displayValue();
       
    }
}
