package javaAlgorithms;

import java.math.BigInteger;
public class mersenneProperty {
    /*
    If n is prime, then if 2^n − 1 is prime, then (2^n−1)(2^(n−1)) is perfect.
    To determine if 2n−1 is prime, use the basic methods to determine primality.
    */

    public static void main(String[] args){
        perfectNumbers();

    }

    public static void perfectNumbers() {
        int count = 0;
        long start = System.nanoTime();
        for(int n = 2; n < 700000; n++){
            boolean nprime = isPrime(BigInteger.valueOf(n));
            boolean MpPrime = false;
            BigInteger Mp = BigInteger.ONE;
            if(nprime){
                Mp = BigInteger.TWO.pow(n).subtract(BigInteger.ONE);
                MpPrime = isPrime(Mp);
            }
            if(nprime && MpPrime){
                count ++;
                BigInteger mult = BigInteger.TWO.pow(n-1);
                BigInteger perfect = Mp.multiply(mult);
                long end = System.nanoTime();
                long elapsed = end - start;
                //System.out.println(perfect);
                //System.out.println(count + " : " + elapsed);
                //System.out.println(elapsed);
                System.out.println(perfect + ": " + elapsed);
            }
            if(count == 10){
                break;
            }
        }
    }

    public static boolean isPrime(BigInteger n){
        boolean p = true;
        for(BigInteger i = BigInteger.TWO; i.compareTo(n.sqrt().add(BigInteger.ONE)) < 0; i = i.add(BigInteger.ONE)){
            if(n.mod(i).equals(BigInteger.ZERO)){
                p = false;
                break;
            }
        }
        return p;
    }

}
