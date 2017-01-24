
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A7q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        //create a scanner
        Scanner input = new Scanner(System.in);
        //find how many marks are to be collected
        System.out.println("How many marks are being used?");
        int userNum = input.nextInt();
        //set array to contain the users desired amount of marks
        double[] marks = new double[userNum];
        //collect users marks
        for(int i = 0; i < marks.length; i++){
            System.out.println("Please enter in number " + (i + 1));
            marks[i] = input.nextInt();            
        }
     int count = 0;
     //repeat until the data is completely sorted
     while(count <= userNum){
         //see if int is greater than int after it then switch values if true
        for(int i = 0; i < marks.length; i++){
            if(i > 0 && marks[i - 1] > marks[i]){
                double a = marks[i - 1];
                marks[i - 1] = marks[i];
                marks[i] = a;
            }        
        }     
        count++;
      }
     //print the marks
     for(int i = 0; i < marks.length; i++){
            System.out.println(" " + marks[i]);
        }
     double median = 0;
     //if even amount of marks
     if(userNum%2 == 0){
         median = ( marks[userNum/2 - 1] + marks[userNum/2] ) / 2;
     }else{
         //if odd amount of marks
         median = marks[userNum/2];
         Math.ceil(median);
     }
        //print median
        System.out.println("The median of the marks is " + median);
    }
}
