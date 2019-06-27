/**
 * Ontario rain fall.
 *
 * @author (Francis)
 * @version (27/6/2019)
 */
public class maxTemperatures
{
     public static void main(String args []){
        int[] temp = {34, 32, 40, 50, 55, 70, 73, 75, 70, 65, 55, 40};

            // dates from: 1/4/17 - 10/2/17
            String dates = "01,02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12";
            String [] datesArr = dates.split(",");
            
            
            
        int monthsh = 1;
        int high = temp[0];
       
            
        for(int i = 0; i<temp.length; i++){
                
            if (temp [i] > high){
                high = temp [i];
            }
            
            if (temp [i] == high){
                monthsh++; 
                }
        }//end of for loop
        
        System.out.println("Month Number: " + monthsh);
        System.out.println("Heighest temperature: " + high);
        
    
}
}
