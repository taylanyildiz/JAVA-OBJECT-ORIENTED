package Loop.forLoop;

public class App {
    public static void main(String args[]) {
        int i;
        // if i less than five, i will be i = i + 1 every loop
        for (i = 0; i < 5; i++) {
            System.out.println(i);
            /*
             * i = 0, i = 1, i = 2, i = 3, i = 4
             */
        }
        System.out.println("***************************");
        for (int x = 1; x <= 12; x++) {
            x++; // x = x + 1
            System.out.println(x); // 2 4 6 8 10 12
        }
        System.out.println("***************************");

        // nested loop

        for (int x = 0; x < 5; x++) {
            for (int x1 = 0; x1 < 5; x1++) {
                System.out.println("x : " + x + " x1 : " + x1);
            }
            System.out.println("x = " + x);
        }

        for (;;) {
            // Do something forever
        }
    }
}