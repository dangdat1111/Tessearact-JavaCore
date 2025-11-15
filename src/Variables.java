import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
        int num = 3;

        String name = "dat dep zai";

        // Khi khai báo một biến float, bạn phải thêm ký tự f hoặc F vào cuối giá trị. Nếu không có ký tự này, trình biên dịch sẽ mặc định hiểu đó là kiểu double (kiểu số thực mặc định trong Java).
        float marks = 6.5F;

//        System.out.println(num); // 3
//        System.out.println(name); // dat dep zai
//        System.out.println(marks); // 6.5

        // Truyền tham trị ( Pass by Value ) Biến gốc và biến trong phương thức là hai thực thể hoàn toàn độc lập trong bộ nhớ.
        int a = 10 ;
        changeValue(a);
        System.out.println(a); //10

        // Truyền Tham Chiếu (Pass by Reference) Biến gốc và biến trong phương thức đều trỏ đến cùng một đối tượng trong bộ nhớ.
        int[] myArray = {1,2,3,4};
        changeArray(myArray);
        System.out.println(myArray[0]); // 99
        System.out.println(Arrays.toString(myArray)); //[99, 2, 3, 4]
    }

    private static void changeValue(int number) {
        number = 200;
    }
    private static void changeArray(int[] arr) {
        arr[0] = 99;
    }


}
