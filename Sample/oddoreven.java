import java.util.*;
public class oddoreven{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Its Even Number:");
        } 
        else{
            System.out.println("Its odd Number:");
        }
    }
}