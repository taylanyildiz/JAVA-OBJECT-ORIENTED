package JavaTutorial.Veriable;

/*
Primitive veriables
*
*
BYTE -> 8 Bit
SHORT -> 16 Bit
INTEGER -> 32 Bit
LONG -> 64 Bit 
FLOAT -> 32 Bit
DOUBLE -> 64 Bit flating point 2.3 , 0.12
BOOLEAN -> this data type has only 2 possible values "true" or "false"
CHAR -> 16-bit Unicode character
*/
public class App {
    public static void main(String args[]) {
        int a; // type Integer default values = 0;
        // Variable is defined and stored temporarily in memory
        // Adress information is assigned to the variable

        /*
         * Memory name: a ; adres:0x665DFF value: null
         * 
         */

        /*
         * If you create a veriable, doesn't matter type of it you can not use same
         * veriable's name example int a=12; int a=13; //error int b = 13; b=23; it
         * works
         */

        /*
         * System.out.println("a = "+a); // this code return error because accept values
         * is null
         */

        a = 24;
        System.out.println("a = " + a); // use + point ( "----"+(veriable name) )

        int b = 12;
        System.out.println(b);
        System.out.println(a);

        int z = 0;
        z = a + b;
        System.out.println(z);
        z = a - b;
        System.out.println(z);
        z = a * b;
        System.out.println(z);
        z = a / b;
        System.out.println(z);

        System.out.println("a+b = " + z);
        System.out.println("a+b = " + (a + b)); // they both is same thing

        float x;
        x = 12;
        System.out.println(x); // 12.0
        float y = 13.1f; // end the values put "f"
        System.out.println(x + y); // 15.1

        float s1 = 12.0f;
        float s2 = 2.0f;
        int s3 = (int) (s1 + s2); // veriable type is changed float => int
        System.out.println(s3);

        boolean isCheck = false;
        System.out.println(isCheck); // false
        System.out.println(!isCheck); // true === !(ischeck = false) => (ischeck = false) => true

    }
}