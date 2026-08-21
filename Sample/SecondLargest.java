import java.util.*;
public class SecondLargest{
    public static void main(String[]args){
        int []num={1,2,3,4,15};
        int max=num[0];
        int second=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
               second=max;
                max=num[i];
            }
        
           else if(num[i]>second){
            second=num[i];
           }
           }
        System.out.println("Second Maximum element is :" +second);
    }
}