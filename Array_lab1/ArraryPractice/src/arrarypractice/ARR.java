/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrarypractice;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Lalisa
 */
//PrintWriter outputFile = new PrintWriter("Values.txt");
public class ARR {
    public static int quotient(int num,int denom)
    throws ArithmeticException
    {
    return num/denom;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean contn_loop=true;
        do{
            try{
       System.out.print("pleace enter the numerator:");
        int numerator=input.nextInt();
        System.out.print("\nplease enter the denomenator:");
        int denomenator=input.nextInt();
        int result=quotient(numerator,denomenator);
        System.out.printf("%nResult:%d/%d=%d%n", numerator, denomenator, result);
        contn_loop=false;
            }
        catch(InputMismatchException  lal){
            System.err.printf("%nException:%s%n",lal);
                //System.err.printf("%nException:%s%n",lal );
                input.nextLine();
            System.out.printf( 
 "\nYou must enter integers. Please try again.%n%n");
        }
 catch (ArithmeticException arithmeticException) {
 { 
 System.err.printf("%nException %s%n", arithmeticException);
 System.out.printf( 
 "Zero is an invalid denominator. Please try again.%n%n"); 
 } }
 
} while (contn_loop); 

   }    
        }    
         /*Scanner input=new Scanner(System.in);
        int[] Array=new int [3];
        System.out.println("enter elements of an array:");
        for(int i=0;i<Array.length;i++){
        Array[i]=input.nextInt();
        }
        int []lal;
    SalesData obj1=new SalesData(Array);
    System.out.print("Returned Array: ");
   lal= obj1.arry();
    for(int i=0;i<Array.length;i++){
    System.out.print(lal[i]);
    }
    
       System.out.print(Array[i]+" ");
    }
    char letter;
    String[]name={"lalisa ","abdi","bontu"};
    letter=name[2].charAt(0);
    System.out.print(letter);
       
    /*System.out.print("\naverage"+obj1.average());
    System.out.print("\nmaximum valeu="+obj1.maximum());*/


