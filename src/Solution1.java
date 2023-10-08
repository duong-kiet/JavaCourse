// Import your library
import java.util.Scanner;
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    public static long fibonacci(long n){
        if(n < 0) return -1;
        else if(n == 0) return 0;
        else if(n == 1) return 1;
        else{
            int index = 0;
            long []fibo = new long[101];
            fibo[0] = 0;
            fibo[1] = 1;
            for(int i=2;i<=100;i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
                if(i == n){
                    index = i;
                    break;
                }
            }
            return fibo[index];
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fibonacci(n));
    }
}