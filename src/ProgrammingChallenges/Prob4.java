package ProgrammingChallenges;

import java.util.ArrayList;

/**Given the following information about a US telephone touchtone keypad:
*   1: (NONE)   2: A,B,C    3: D,E,F
*   4: G,H,I    5: J,K,L    6: M,N,O
*   7: P,R,S    8: T,U,V    9: W,X,Y
*   calculate the product of each characters value.

*   As an example, say the user enters: "Practice", the product would be:

*   7 * 7 * 2 * 2 * 8 * 4 * 2 * 3 = 37,632
*   What is the value of this string: "Programming Challenges are fun"?
 *
 * @author Kianna Reed
 */
public class Prob4 {
   
    public static void main(String[] args){
         final String PHRASE = "Programming Challenges are fun";
         ArrayList pList =  new ArrayList();
         Long value;
        
        //convert phrase to digits
        pList = toDigits(PHRASE);
        
        //calculate product of String
        value = calcPhrase(pList);
                 
        //print answer
        System.out.println("The value of this string is: " + value);
    }
     
    public static ArrayList toDigits(String p){
        ArrayList pDigits = new ArrayList();
        //iterate through phrase
        for(int i = 0; i < p.length(); i++){
            //change letter to corresponding number
            switch(Character.toLowerCase(p.charAt(i))){
                case 'a':
                case 'b':
                case 'c':
                    pDigits.add(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    pDigits.add(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    pDigits.add(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    pDigits.add(5);
                    break;                    
                case 'm':
                case 'n':
                case 'o':
                    pDigits.add(6);
                    break;
                case 'p':
                case 'r':
                case 's':
                    pDigits.add(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    pDigits.add(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                    pDigits.add(9);
                    break;
                default:
                    break;
            }                   
         }
        return pDigits;
    }
    
    public static Long calcPhrase(ArrayList a){
         //find the product of the phrase
        Long product = 1L;
        
        for(int i = 0; i < a.size(); i++){
            product = product * (int) a.get(i);
            //System.out.println(a.get(i) +" " + product);
        }
        return product;
    }

    
}
