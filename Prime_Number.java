import java.util.ArrayList; 
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
  
    int givenNumber = 19;
    boolean isPrime = true; 
    ArrayList<Integer> devisors = new ArrayList<Integer>(); 
    
    for (int i = 2; i < givenNumber; i++){
       //System.out.println("i is " + i); 
        int remainder = givenNumber % i;
        //System.out.println(remainder); 
        
       if (remainder == 0) {           
           isPrime = false;
            
            for (int k = i; k < givenNumber; k++){
               if (givenNumber%k == 0) {                
               devisors.add(k);
                   k++; 
               }     
            }
            break;
        }
    }
    
    Collections.sort(devisors);
    
    if(isPrime == true) {    
       System.out.println(givenNumber + " is a prime number: ");    
    } else {
       System.out.println(givenNumber + " is not a prime number.");
        for (int j: devisors){
        System.out.print(j + " ");
        }
    }
  }
}