package JavaTutorial.String;

/*
 *String is not primitive veriable
 *like arrays,  char array 
 *But it's dynamic sturcture
*/
public class App {
    public static void main(String args[]) {

        char name[] = { 'T', 'A', 'Y', 'L', 'A', 'N' };
        System.out.print(name[0]);
        System.out.print(name[1]);
        System.out.print(name[2]);
        System.out.print(name[3]);
        System.out.print(name[4]);
        System.out.print(name[5]);

        System.out.println();

        String myName = "TAYLAN";
        System.out.println(myName);

        System.out.println(myName.charAt(0)); // index 0 character.
        System.out.println(myName.charAt(1)); // index 1 character.
        System.out.println(myName.charAt(2)); // index 2 character.
        System.out.println(myName.charAt(3)); // index 3 character.
        System.out.println(myName.charAt(4)); // index 4 character.
        System.out.println(myName.charAt(5)); // index 5 character.

        // split() method

        String fullName = "Taylan YILDIZ";

        // split(" ") => space [Taylan,YILDIZ]
        // 0. index = Taylan
        // 1.index = YILDIZ

        String firstName = fullName.split(" ")[0]; // Taylan
        System.out.println(firstName);
        String secondName = fullName.split(" ")[1]; // YILDIZ
        System.out.println(secondName);

        String name_first = "CAN";
        String name_second = "OZAN";
        String name_full = name_first + name_second; // combine => CANOZAN
        System.out.println(name_full);

        String array[] = name_full.split("A");
        System.out.println(array[0]); // C "A"
        System.out.println(array[1]); // NOZ
        System.out.println(array[2]); // "A" N

        String array1[] = name_full.split("A", 3); // legth 3
        System.out.println(array1.length);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        String array2[] = name_full.split("A", 2); // length 2
        System.out.println(array2.length); // return lenth of array or String type
        System.out.println(array2[0]);
        System.out.println(array2[1]);

        // substring()

        String s1 = "javatpoint";
        System.out.println(s1.substring(2, 4));// returns va index : [2,3]
        System.out.println(s1.substring(2));// returns vatpoint index [2 , end]

        // trim()

        String s2 = "  hello string   "; // .trim() => goig to be like "hello string"
        System.out.println(s2 + "javatpoint");// without trim()
        System.out.println(s2.trim() + " javatpoint");// with trim()

        // equals()
        // equals look value of veriable, like that
        String s3 = "";
        System.out.println(s3.equals("")); // return boolean true => System.out.println(s3 == "");
        System.out.println(s3.equals("Taylan")); // return boolean false

    }
}
