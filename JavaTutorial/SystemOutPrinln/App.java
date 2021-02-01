package JavaTutorial.SystemOutPrinln;

public class App {
    public static void main(String args[]) {

        System.out.println("Hello"); // print+"ln" bottom line
        System.out.println("World");

        System.out.print("Hello");
        System.out.print("World!!"); // used same line

        // bottom line
        System.out.println("My Name : Taylan\nSure Name : YILDIZ"); // pass to bottom line by \n

        // same line pass to column
        System.out.println("Hey\tLearn\tJAVA"); // space => \t Hey Learn JAVA

        // special character
        // ' " '; => double quotes
        // example in output terminal we want to write => He said "How are you!"
        // before used special character, must put \ reverse slash
        System.out.println("He said \"How are you!\" "); // => (\)"--------(\)"

        System.out.print("\n"); // create a spacer...
        System.out.print("Next Project ==> Veriables");

    }
}
