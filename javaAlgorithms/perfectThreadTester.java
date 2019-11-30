package javaAlgorithms;

public class perfectThreadTester {
    public static void main(String[] args){
// Comment or uncomment certain thread ranges to implement them

// Thread Range 3:
        perfectThread thread1 = new perfectThread(2, 1000);
        perfectThread thread2 = new perfectThread(1000, 4000);
        perfectThread thread3 = new perfectThread(4000, 10000);
        perfectThread thread4 = new perfectThread(10000, 25000);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

// Thread Range 2:
//        javaAlgorithms.perfectThread thread1 = new javaAlgorithms.perfectThread(2, 1000);
//        javaAlgorithms.perfectThread thread2 = new javaAlgorithms.perfectThread(1000, 3500);
//        javaAlgorithms.perfectThread thread3 = new javaAlgorithms.perfectThread(3500, 5000);
//        javaAlgorithms.perfectThread thread4 = new javaAlgorithms.perfectThread(5000, 10000);
//        javaAlgorithms.perfectThread thread5 = new javaAlgorithms.perfectThread(10000, 11300);
//        javaAlgorithms.perfectThread thread6 = new javaAlgorithms.perfectThread(11300, 20000);
//        javaAlgorithms.perfectThread thread7 = new javaAlgorithms.perfectThread(20000, 22000);
//        javaAlgorithms.perfectThread thread8 = new javaAlgorithms.perfectThread(22000, 24000);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();

// Thread Range 1:
//        javaAlgorithms.perfectThread thread1 = new javaAlgorithms.perfectThread(2, 70000);
//        thread1.start();

    }
}
