
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A7q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //set array to contain 10 ints
        int[] marks = new int[10];
        //ask user for numbers
        for(int i = 0; i < marks.length; i++){
            System.out.println("Please enter in number " + (i + 1));
            marks[i] = input.nextInt();            
        }
     int count = 0;
     //repeat 10 times
     while(count <= 10){
         //see if int is greater than int after it then switch values if true
        for(int i = 0; i < marks.length; i++){
            if(i > 0 && marks[i - 1] > marks[i]){
                int a = marks[i - 1];
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
    }
}

