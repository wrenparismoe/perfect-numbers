package javaAlgorithms;

import java.math.BigInteger;

public class basicAlgorithm {
    /*
    Find all the proper divisors of n, Sum them. If sum = n, then n is a perfect number
    */

    public static void main(String[] args){
        //perfectNumbers();
        perfectNumbersBI();
    }

    // Basic Algorithm using the BigInteger Class
    public static void perfectNumbersBI() {
        long start = System.nanoTime();
        for(int n = 2; n < 10000000; n++){
            BigInteger sum = BigInteger.ZERO;

            for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(n).divide(BigInteger.TWO).add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)){
                if(BigInteger.valueOf(n).mod(i).equals(BigInteger.ZERO)){
                    sum = sum.add(i);
                }
            }
            if(sum.equals(BigInteger.valueOf(n))){
                long end = System.nanoTime();
                //System.out.println(n);
                //System.out.println((end - start));
                System.out.println(n + ": " + (end - start));
            }

        }
    }

    // Basic Algorithm without the BigInteger Class
    public static void perfectNumbers() {
        long start = System.nanoTime();
        for(int n = 2; n < 8129; n++){
            int sum = 0;

            for(int i=1; i < (n/2)+1; i++){
                if(n%i == 0){
                    sum+=i;
                }
            }
            if(sum == n){
                long end = System.nanoTime();
                //System.out.println((end - start));
                System.out.println(n);
            }

        }
    }
}
