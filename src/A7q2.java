
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A7q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //set number of heights to 5
        double[] heights = new double[5];
        //ask user for heights
        for(int i = 0; i < heights.length; i++){
            System.out.println("Please enter heights in centimeters.");
            heights[i] = input.nextInt();
        }
        double total = 0;
        //find total height
        for(int i = 0; i < heights.length; i++){
             total = total + heights[i]; 
        }
        //find average height
        double avgHeight = total / heights.length;
        System.out.println("Average height is: " + avgHeight);
        
        //check to see which heights are above average
        for(int i = 0; i < heights.length; i++){
            if(heights[i] >= avgHeight){
                System.out.println(heights[i]);
            }
        }
    }
}
