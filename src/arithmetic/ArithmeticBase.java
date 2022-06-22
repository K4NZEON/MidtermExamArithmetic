/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    public double x,y;
    private arithmetic math;
    
    public enum arithmetic{
        PLUS, MINUS, TIMES, DIVIDE
    };
    
    public arithmetic getArithmetic() {
        return math;
    }
    
    public void setArithmetic(String math) {
        this.math = arithmetic.valueOf(math);
    }
    
    double calculate(double x, double y) {
        switch (math) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }


}
