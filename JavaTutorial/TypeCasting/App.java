package JavaTutorial.TypeCasting;

public class App {
    public static void main(String args[]) {
        String s1 = "12";
        int s2 = Integer.parseInt(s1); // String to Integer
        int s3 = 15;
        System.out.println("Result : " + (s2 + s3));

        float f1 = 2.4f;
        int f2 = (int) f1; // Float to Integer

        float f3 = 12.5f;
        int i1 = 45;

        String s4 = Integer.toString(i1); // Integer to String
        String s5 = Float.toString(f3); // Float to String

        String s6 = "" + f3; // Float to String
        String s7 = "" + i1; // Integer to String

    }
}
