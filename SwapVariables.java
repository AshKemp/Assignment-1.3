import java.util.*;
public class SwapVariables {
  public static void main(String args[]){
     int a,b;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter a and b");
     a = s.nextInt(); 
     b = s.nextInt(); 
     a = a+b;   
     b = a-b;    
     a = a-b;    
     System.out.println("After swapping values of a and b respectively are: "+a +"\t"+b);
   }
}
	