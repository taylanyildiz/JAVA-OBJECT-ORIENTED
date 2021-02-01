package Methods;

/*
    access modifier _return type _methods Name()
    
    return type :

    * void => if it doesn't return a value
    * int => if it return a int type value
    * boolean => if it return a boolean type value
    * String =>         "               "
    * char =>

*/
public class VoidMethods {
    public static void main(String args[]) {

        Add(12, 44);

        float result1 = Divede(12, 5);
        System.out.println(result1);
        Write(Float.toString(result1));

        int i = AddTwo(4);
        Write(Integer.toString(i));
    }

    // All methods must be static and pubic because main method is static and public
    // while this app work , first main method run so it must be static and public

    public static void Add(int s1, int s2) { // it doesn't return a value
        System.out.println("Result : " + (s1 + s2));
    }

    public static float Divede(int s1, int s2) { // it returns a float type value
        return (s1 / s2);
    }

    public static void Write(String message) { // it doesn't return a value
        System.out.println(message);
    }

    public static int AddTwo(int x) {
        return (x + 2);
    }
}
