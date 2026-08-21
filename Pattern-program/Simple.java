import java.util.*;
public class Simple{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=i){
            System.out.print(i);
            }
            else{
                System.out.print(i+1);
            }
        }
        System.out.println();
       }
    }
}