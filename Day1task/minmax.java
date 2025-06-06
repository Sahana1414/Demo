package addon_dsa;

import java.util.Scanner;

public class minmax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int elements = input.nextInt();

        int[] array = new int[elements];

       
        for (int i = 0; i < elements; i++) {
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }

        
        int max = array[0];
        int min = array[0];

        
        for (int i = 1; i < elements; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);

        input.close(); 
    }
}


	   

