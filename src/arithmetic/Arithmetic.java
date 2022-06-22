/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number:"); 
        int n= in.nextInt();
        
        System.out.println("Enter second number:"); 
        int m= in.nextInt();
        
        System.out.println("Enter arithmetic operation to Perform: ");
        String s = in.next().toUpperCase();
        
        r.setArithmetic(s);
        double result = r.calculate(m,n);
        System.out.println("result :" +result); 
    
    }
}

