import java.util.Scanner;

public class lap01
{
    public static void main(String[] args) {
        
     Scanner input= new Scanner (System.in);
     
    System.out.print("Enter temperature in Fahrenheit: ");
    int Fahrenheit= input.nextInt ();
    
    float Celsius = (float) 5 * (Fahrenheit-32)/9;
    
    System.out.print("The degree in Celsius is: " + Celsius + " degree's");
        
        
        
        
        
        
        
        
        
        
        
    }
}

