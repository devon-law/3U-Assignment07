
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A7q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        double[] marks = new double[5];
        
        //get the user to fill the array
        for(int i = 0; i < marks.length; i++){
            System.out.println("Please enter in mark " + (i + 1));
            marks[i] = input.nextDouble();
        }                                 
        //add all the numbers using a loop 
        double total = 0;
        for(int i = 0; i < marks.length; i++){
            //add number into total
            total = total + marks[i];
        }
        //calculate the average
        double avg = total/marks.length;
        System.out.println("The class average is: " + avg);
    }
    }

