class OuterClass1{ //Nested Inner Class (Lớp bên trong thông thường), Nó không được khai báo với từ khóa static
    private int outerVar = 10;
    class Inner {
        public void display(){
            System.out.println("Giá trị outerVar là: " + outerVar); // Truy cập thành viên private
        }
    }
    public void createInner(){
        Inner inner = new Inner();
        inner.display();
    }
}

class OuterClass2{  //Method-Local Inner Class (Lớp bên trong cục bộ trong phương thức)
//Là lớp được định nghĩa bên trong một phương thức hoặc một khối lệnh (scope)
    //Phạm vi của nó chỉ giới hạn trong phương thức hoặc khối lệnh đó.
    //Nó chỉ có thể truy cập các biến cục bộ (local variables) của phương thức đó nếu chúng được khai báo là final (hoặc là effectively final kể từ Java 8).

    public void displayMethod(){
        int localVar = 50; // effectively final

        class LocalInnerClass{
            public void printLocal(){
                System.out.println("Giá trị localVar là: " + localVar);
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.printLocal();
    }
}

interface Greeting{
    void greet();
}
class OuterClass3{ // Anonymous Inner Class (Lớp bên trong vô danh)
    //Là một inner class không có tên.
    //Nó được tạo ra khi bạn cần thực thi một giao diện (interface) hoặc mở rộng một lớp (class) chỉ một lần duy nhất.
    //Thường được dùng trong các trường hợp xử lý sự kiện (event handling) hoặc tạo luồng (threads).

    public void welcome(){
        // Tạo một đối tượng Anonymous Inner Class implement interface Greeting
        Greeting englishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        };
        englishGreeting.greet();
    }
}

class OuterClass4{ //Static Nested Class (Lớp lồng nhau tĩnh)
    // Đây là một loại inner class đặc biệt được khai báo với từ khóa static.
    // Về mặt kỹ thuật, nó không phải là một "inner class" đúng nghĩa, mà là một nested class (lớp lồng nhau), vì nó không yêu cầu một đối tượng của outer class để khởi tạo.
    // Nó chỉ có thể truy cập các thành viên static của outer class
    static int staticVar = 20;
    static class StaticNestedClass {
        public void displayStatic(){
            System.out.println("Giá trị staticVar là: " + staticVar); // Truy cập thành viên static
        }
    }

}


public class InnerClass {
    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        outerClass1.createInner();

        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.displayMethod();

        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.welcome();

        OuterClass4.StaticNestedClass outerClass4 = new OuterClass4.StaticNestedClass();
        outerClass4.displayStatic();
    }
}
