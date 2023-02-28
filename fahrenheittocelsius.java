import java.util.Scanner;

public class fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temprature in fahrenheit : ");
        float f=sc.nextFloat();
        
            float c=f-32;
            c=c*(5/9);
                
                System.out.print("Temprature in celsius is : "+c);
        
    }
    
}
