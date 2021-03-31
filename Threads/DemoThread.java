public class DemoThread{
    public static void main(String[] args){
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r1 = new Runnable2();
        Thread t1 = new Thread(r1);
        Runnable r3 = new Runnable3();
        Thread t3 = new Thread(r3);
        Runnable r4 = new Runnable4();
        Thread t4 = new Thread(r4);
        t.start();
        t1.start();
        t3.start();
        t4.start();

        }
    }
    class Runnable1 implements Runnable{
        public void run(){
            int[] randomNumbers = new int[25];
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (int) (Math.random() * 99);
                int a = randomNumbers[i];

                if (a % 2 == 0) {
                    System.out.println("Even Numbers:" + i);
                }
            }
        }

    }
    class Runnable2 implements Runnable{
        public void run() {
            int[] randomNumbers = new int[25];
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (int) (Math.random() * 99);
                int a = randomNumbers[i];

                if (a % 2 != 0) {
                    System.out.println("Odd Numbers: " + i);
                }
            }

        }
    }
    class Runnable3 implements Runnable{
        public void run() {
            int[] randomNumbers = new int[25];
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (int) (Math.random() * 99);
                int a = randomNumbers[i];

                if (a < 0) {
                    System.out.println("Negative Number: " + i);
                }
            }
        }
    }
    class Runnable4 implements Runnable{
        public void run() {
            int[] randomNumbers = new int[25];
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (int) (Math.random() * 99);
                int a = randomNumbers[i];
                if (a > 0) {
                    System.out.println("Positive Number: " + i);
                }
            }
        }
    }