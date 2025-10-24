/*
Error
    1. Compile-time error
    2. Runtime error
    3. logical error
 */

public class Exceptions {
    public static void main(String[] args) {
        int i  = 0;
        int j = 0;
        try {
            j = 18/i;
        }catch (Exception e){
            System.out.println("Some thing went wrong " + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
