/*
Error
    1. Compile-time error
    2. Runtime error
    3. logical error
 */

public class Exceptions {
    public static void main(String[] args) {
        int i  = 1;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException  e){
            System.out.println("Some thing went wrong " + e);
        }

        System.out.println(j);

        System.out.println("bye");
    }
}
