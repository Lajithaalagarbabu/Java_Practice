import java.util.*;
public class CountDuplicate{
    public static void main(String[] args){
        int[] num = {10, 20, 10, 30, 20, 10};
        for(int i=0;i<num.length;i++){
            int count=0;
            boolean counted=false;
            for(int k=0;k<i;k++){
            if(num[k]==num[i]){
                counted=true;
                break;
            }
        }
           if(counted){
            continue;
           }  
            for(int j=i;j<num.length;j++){
            if(num[i]==num[j]){
               
                count++;
            }
        }
       System.out.println(num[i] + " -> " + count + " times");
        }
        
    }
}