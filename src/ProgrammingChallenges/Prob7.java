/*
    f(x) = 4^x + x^3 + x^2 + x - 2^x
           3^x

           Get the first 3 digits.
 */
package ProgrammingChallenges;

/**
 * @author Kianna Reed
 */
public class Prob7 {
    
    public static void main(String[] args){
        int value = 50;
        double a = Math.pow(4, value);
        double b = Math.pow(value, 3);
        double c = Math.pow(value, 2);
        double d = Math.pow(2, value);
        double e = Math.pow(3, value);
        double solution;
        
        solution = (a + b + c + value - d)/ e;
        
        String sol = Double.toString(solution);
        
        for(int i = 0; i < 3; i++){
            System.out.print(sol.charAt(i));  
        }
        System.out.print("\n");        
    }
}
