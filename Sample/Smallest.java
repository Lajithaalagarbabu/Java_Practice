import java.util.*;
public class Smallest{
    public static void main(String[]args){
        int []num={1,2,13,4,5};
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Minumum element is :" +min);
    }
}