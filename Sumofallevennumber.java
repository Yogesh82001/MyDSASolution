// program 2
import java.util.Scanner;

public class Sumofallevennumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=2;i<=n;i++){
        if(i%2==0){
            sum+=i;
        }

    }
    System.out.println("sum is : "+sum);
    
}    
}
