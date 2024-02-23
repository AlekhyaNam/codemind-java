import java.util.*;
public class Solution{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int s = sc.nextInt();
         int c=0;
         for(int i=2;i<s;i++){
             if(s%i==0){
                 c=c+1;
             }
         }
         if(c==0){
             System.out.print("Prime");
         }
         else{
            System.out.print("Not Prime");
         }
        }
    }