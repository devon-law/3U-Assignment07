
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A7q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //set array to contain 2 ints
        int[] sortNum = new int[2];
        //ask user for numbers
        for(int i = 0; i < sortNum.length; i++){
            System.out.println("Please enter in number " + (i + 1));
            sortNum[i] = input.nextInt();
        }
        //sort the numbers
        if(sortNum[0] > sortNum[1]){
            int num2 = sortNum[0];
            sortNum[0] = sortNum[1];
            sortNum[1] = num2;            
        }
        //print the 2 integers
        System.out.println("The 2 integers in acsending order are: " + sortNum[0] + " " + sortNum[1]);
    }
}
