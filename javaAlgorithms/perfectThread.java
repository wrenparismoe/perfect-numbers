package javaAlgorithms;

import java.math.BigInteger;

public class perfectThread extends Thread{

    public int low, high;

    public perfectThread(int l, int h) {
        this.low = l;
        this.high = h;
    }

    @Override
    public void run(){
        long start = System.nanoTime();
        long end = 0;
        long elapsed = 0;
        if (this.low == 2){
            int perfect6 = perfectNum6();
            end = System.nanoTime();
            elapsed = end - start;
            //System.out.println(perfect6);
            //System.out.println(elapsed);
            System.out.println(perfect6 + ": " + elapsed);
        }
        for (int n = this.low; n < this.high; n++) {
            boolean nprime = isPrime(n);
            boolean MpPrime = false;
            BigInteger Mp = BigInteger.ONE;
            if (nprime) {
                Mp = BigInteger.TWO.pow(n).subtract(BigInteger.ONE);
                MpPrime = LucasLehmer(n, Mp);
            }
            if (nprime && MpPrime) {
                BigInteger mult = BigInteger.TWO.pow(n - 1);
                BigInteger perfect = Mp.multiply(mult);
                end = System.nanoTime();
                elapsed = end - start;
                //System.out.println(perfect);
                //System.out.println(elapsed);
                System.out.println(perfect + ": " + elapsed);
            }
        }
    }

    public static int perfectNum6() {
        int p = 2;
        boolean pPrime = isPrime(p);
        boolean MpPrime = false;
        int Mp = 0;
        int perfect = 0;
        if(pPrime) {
            Mp = (2*2)-1;
            MpPrime = isPrime(Mp);
        }
        if (pPrime && MpPrime) {
            int mult = 2;
            perfect = Mp * mult;
        }
        return perfect;
    }


    public static boolean isPrime(int n){
        for(int i = 2; i < ((int)Math.sqrt(n))+1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static boolean LucasLehmer(int p, BigInteger Mp) {
        BigInteger s = BigInteger.valueOf(4);
        for (int i = 0; i < p - 2; i++) {
            s = s.pow(2).subtract(BigInteger.TWO).mod(Mp);
        }
        return s.compareTo(BigInteger.ZERO) == 0;
    }
}

