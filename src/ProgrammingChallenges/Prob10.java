/*
    What is the sum of all prime numbers below 5000?
 */
package ProgrammingChallenges;

import java.util.ArrayList;

/**
 *
 * @author Kianna Reed
 */
public class Prob10 {

    public static void main(String[] args) {
        ArrayList primes = new ArrayList();
        boolean noRem = false;
        int sum = 0;
        
        for(int i=2; i<5000; i++){
            int value = i;
            
            for(int j=2; j<5000; j++){
                //System.out.println("value: " + value);
                if(value == j){
                    //System.out.println("equal values");
                    break;
                }else if(value > j){
                    int divided = value % j;
                    //System.out.println("divided: " + divided);
                    if(divided == 0){
                        noRem = true;
                    }
                }else{
                    noRem = false;
                    //System.out.println(value + " is a prime");
                    break;
                } 
            }
            if(!noRem){
                    primes.add(value);
                    //System.out.println(value);
                    noRem = false;
                }else{
                    noRem = false;
                }
        }
        
        for(int i=0; i < primes.size(); i++){
            sum = sum + (int)primes.get(i);
            //System.out.println((int)primes.get(i) + ": " + sum);
        }
        
        System.out.println(sum);
    }
    
    
}
