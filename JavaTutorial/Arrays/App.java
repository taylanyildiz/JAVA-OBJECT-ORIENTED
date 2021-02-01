package JavaTutorial.Arrays;

public class App {
    public static void main(String args[]) {

        int array[] = new int[3]; // you must specify the length it's not dynamic structure
        array[0] = 12;
        array[1] = 24;
        array[2] = 31;

        System.out.println(array); // return address I@762efe5d

        // array => 12, 24, 31
        // index 0, 1, 2

        System.out.print("\n" + array[0] + "\t");
        System.out.print(array[1] + "\t");
        System.out.print(array[2]);

        /*
         * dynamic structure so you can not use this way array[3] = 12 => error
         */

        float[] arrayF = new float[4];
        arrayF[0] = 12;
        arrayF[1] = 32.2f;
        arrayF[2] = 1.4f;
        arrayF[3] = 412.45f;

        System.out.print("\n");

        System.out.print(arrayF[0] + "\t");
        System.out.print(arrayF[1] + "\t");
        System.out.print(arrayF[2] + "\t");
        System.out.print(arrayF[3]);

    }
}
