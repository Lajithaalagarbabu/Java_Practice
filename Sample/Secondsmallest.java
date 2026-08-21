import java.util.*;
public class Secondsmallest{
    public static void main(String[]args){
        int []num={1,2,13,4,5};
        int min = num[0];
        int sec = Integer.MAX_VALUE;
        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                sec=min;
                min=num[i];
            }
            else if(num[i]<sec){
                sec=num[i];
            }
        }
       System.out.println("Second Smallest element is: " + sec);
    }
}