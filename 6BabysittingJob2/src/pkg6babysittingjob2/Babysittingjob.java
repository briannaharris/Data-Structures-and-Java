
package pkg6babysittingjob2;


public class Babysittingjob 
{
     private String jobNumber; 
     private int numChildren; 
     private int numHours;
     private int jobFee; 
     private String name; 
     
     private final static int CINDY_CODE = 1;
     private final static int GREG_CODE = 2; 
     private final static int MARCIA_CODE = 3; 
     private final static int CIDNY_PER_CHILD_FEE =7;
     private final static int GREG_MARCIA_PER_CHILD_FEE = 9;
     private final static int GREG_MARCIA_ADDITIONAL_CHILD_FEE = 4;
     
     
     
     
//Create a constructor for the BabysittingJob class that accepts arguments for
     //the job number, babysitter code, number of children, and hours.
     
     //NOTE: INT YEAR is created in the constructor and not in the other class
    public Babysittingjob(int jobNumber, int numChildren, int numHours, int year,  int employeeCode) 
    {
        this.numChildren = numChildren;
        this.numHours = numHours;
     
               
        year = year % 2000;
        if(jobNumber< 10)
        {
            this.jobNumber = year + "000" + jobNumber;
        }
        else if(jobNumber<100)
        {
            this.jobNumber = year + "00" + jobNumber;
        }
        else if(jobNumber<1000)
        { 
            this.jobNumber = year + "0" + jobNumber;
        }
        else
        {
             this.jobNumber = "" + year + jobNumber;
        }
        
        if(employeeCode == CINDY_CODE)
        {
            jobFee = CIDNY_PER_CHILD_FEE * numChildren * numHours; 
            name = "Cindy";
        }
        else if (employeeCode == GREG_CODE || employeeCode == MARCIA_CODE)
           {
               //FIRST CONSTANT IS 9 DOLLARS FOR THE FIRST CHILD
               //NUMCHILDREN - 1 is for every child after the first
               ///numchildren - 1 takes away the first child at 9 dollars an hour from the calculation 
                 jobFee = (GREG_MARCIA_PER_CHILD_FEE + ((numChildren - 1) * GREG_MARCIA_ADDITIONAL_CHILD_FEE)) * numHours;
                 //if the IF is false, it goes to the else statment 
               if(employeeCode == GREG_CODE) 
               {
                   name= "Greg";
               }
               else{
                   name = "marcia";
               }
           }
  
    }
    public void displayValue()
    {
        System.out.println("job number " + jobNumber + " number of children " +
                numChildren + " job fee " + jobFee + " name " + name  );
    }
   
       
    
}
