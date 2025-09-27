class Mobile{
    String brand;
    int price;
    // static variables
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    // static function
    public static void show1(Mobile mobile){
        System.out.println(mobile.brand + " : " + mobile.price + " : " + name);
    }
    //static block khởi tạo các biến static phức tạp hoặc thực hiện các thiết lập cần thiết khi lớp được nạp (load) vào JVM, và nó chỉ chạy một lần duy nhất.
    // static block được thực thi trước phương thức main() và trước bất kỳ hàm tạo (constructor) nào.
    static {
        name = "datdepzai";
        System.out.println("======In Static Block======"); // thực thi trước phương thức main() và trước bất kỳ hàm tạo (constructor) nào.
    }
}
/*
💡 Bản chất của static: "Thuộc về Lớp, không phải Đối tượng"
 */
public class Static {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
//        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "SamSung";
        obj2.price = 750;
//        Mobile.name = "SmartPhone";

//        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
