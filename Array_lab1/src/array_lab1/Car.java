
package array_lab1;

import java.util.Scanner;
public class Car {
   public static void main(String[] args) {
        String[]cars;
       cars= new String[4];
       Scanner input=new Scanner(System.in);
//       cars[0]="Isuzu";
//       cars[1]="Bus";
//       cars[2]="Toyota";
//       cars[3]="Bughati";
       System.out.println("Enter your Strings:");
       for(int i=0; i<cars.length;i++){
           cars[i]=input.nextLine();
       }
       System.out.println("      here is your String:");
       for(int i=0; i<cars.length;i++){
           System.out.println(cars[i]);
       }
    }
    
}
