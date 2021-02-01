package ControlStatements.SwitchCase;

public class App {

    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            switch (i % 2) { // remaining from division 2
                case 0: // if (i%2 == 0)
                    System.out.println("Even Number i : " + i);
                    break;
                case 1: // if (i%2 == 1)
                    System.out.println("Odd Number i : " + i);
                    break;
            }
        }
    }
}
