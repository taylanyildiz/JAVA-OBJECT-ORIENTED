package Loop.forLoop;

/*
Print all n-digit numbers whose sum of digits equals to given sum
*/

public class Example {
    public static void main(String args[]) {

        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int z = 0; z < 9; z++) {
                    if ((i + j + z) == 3) {
                        System.out.println((i * 100 + j * 10 + z));
                    }
                }
            }
        }
    }
}
