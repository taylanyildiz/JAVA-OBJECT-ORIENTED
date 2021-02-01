package ControlStatements.ELSE_IF;

public class App {

    public static void main(String args[]) {

        int i = 12;

        if (i == 12) {
            System.out.println("i == 12");
        } else if (i > 10) { // if first if => true , this does not work
            System.out.println("i > 10");
        }

        int j = 14;
        boolean isCheck = false;

        // && , ||

        // && => and they both must be true!
        // || => or least one of them must be true!

        if ((j == 14) || (isCheck == true)) {// || => or one of them is true
            System.out.println("True");
        }
        if ((j == 13) || (isCheck == false)) {
            // true
        }
        if ((j == 13) || (isCheck == true)) {
            // false
        }
        if ((j == 14) && (isCheck == true)) {
            // false
        }
        if ((j == 13) && (isCheck == true)) {
            // false
        }
        if ((j == 13) && (isCheck == false)) {
            // false
        }

    }
}
