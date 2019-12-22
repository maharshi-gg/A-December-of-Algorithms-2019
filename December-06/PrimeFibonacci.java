import java.util.*;
import java.io.*;

public class PrimeFibonacci{

    public static boolean isPrime(int num){
        for(int i=2;i<num/2;i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static List primeFib(int count){
        List<Integer> list = new ArrayList<Integer>();
        int a=1;
        int b=1;
        int temp;
        while (count > 0) {
            temp = a;
            a=b;
            b=temp+a;
            if(isPrime(b)) {
                list.add(b);
                count--;
            }
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println("Fibonacci was a genius.");
        System.out.println(isPrime(53));
        System.out.println(primeFib(10));
    }
}