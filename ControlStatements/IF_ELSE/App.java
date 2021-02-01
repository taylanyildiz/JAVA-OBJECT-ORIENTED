package ControlStatements.IF_ELSE;

public class App {

    /*
     * if (boolean){ => true } else{ => reserve if }
     */
    public static void main(String args[]) {

        boolean isCheck = false;

        if (isCheck) { // => if isCheck is true
            System.out.println("Correct");
        } else { // => if isCheck is not true
            System.out.println("Not Correct");
        }

        System.out.println("******************");

        if (!isCheck) { // => if isCheck is false
            System.out.println("Not Correct");
        } else { // => if isCheck is true
            System.out.println(" Correct");
        }

        int i = 3;

        if (i == 3) { // it's
            System.out.println("i = " + i);
        }
        if (i < 4) {
            System.out.println("Correct");
        }
        if (i > 5) {
            System.out.println("False");
        }
        if (i != 3) { // is not
            System.out.println("i != 3");
        } else {
            System.out.println("i == 3");
        }
    }
}