package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
        Consecutive_prime_sum(1000);
    }

    public static int count(int n){
        if(n==1){
            return 0;
        }
        if(n%3==1){
            return 1+count(n-1);
        }
        if(n%3==0){
            return 1+count(n/3);
        }
        if(n%2==1){
            return 1+count(n-1);
        }
        if(n%2==0){
            return 1+count(n/2);
        }
        return 1+count(n-1);
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void Consecutive_prime_sum(int n){
        int sum = 2;
        int max = 2;
        int i = 3;
        while(sum<n){
            if(isPrime(i)){
                sum += i;
                if(isPrime(sum)){
                    max = sum;
                }
            }
            i += 2;
        }
        System.out.println(max);
//        int i=2;
//        while(i<n){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//            i++;
//        }
    }
}
