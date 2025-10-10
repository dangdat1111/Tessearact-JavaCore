Dynamic Method Dispatch (Gửi phương thức động) trong Java là một cơ chế mà việc quyết định **phương thức nào** sẽ được thực thi được đưa ra tại **thời điểm chạy (runtime)** thay vì tại thời điểm biên dịch (compile time).

Cơ chế này là nền tảng cho **Runtime Polymorphism (Đa hình lúc chạy)** và **Method Overriding (Ghi đè phương thức)**.

-----

## ⚙️ Cơ Chế Hoạt Động

Dynamic Method Dispatch hoạt động dựa trên các nguyên tắc sau:

1.  **Upcasting (Ép kiểu lên):** Nó yêu cầu một **biến tham chiếu** của **lớp cha (superclass)** được trỏ đến một **đối tượng** của **lớp con (subclass)**.
    $$\text{Lớp\_Cha } \text{thamChieu} = \text{new } \text{Lớp\_Con();}$$

2.  **Overriding (Ghi đè):** Cả lớp cha và lớp con phải có một phương thức cùng tên và cùng chữ ký (signature).

3.  **Quyết định lúc Runtime:** Khi phương thức được gọi thông qua biến tham chiếu của lớp cha, Java Virtual Machine (JVM) sẽ không quyết định gọi phương thức của lớp cha hay lớp con tại thời điểm biên dịch. Thay vào đó, **JVM sẽ đợi đến lúc chạy** để xem **đối tượng thực tế** (object) mà biến tham chiếu đang trỏ tới thuộc lớp nào, và sau đó gọi phương thức được ghi đè của lớp đó.

-----

## 📝 Ví dụ Minh Họa

Hãy xem xét ví dụ về lớp $Shape$ (Hình dạng) và các lớp con $Circle$ (Hình tròn) và $Rectangle$ (Hình chữ nhật):

```java
class Shape { // Lớp cha
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape { // Lớp con 1
    @Override
    void draw() {
        System.out.println("Drawing a Circle"); // Ghi đè
    }
}

class Rectangle extends Shape { // Lớp con 2
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle"); // Ghi đè
    }
}

public class DispatchDemo {
    public static void main(String[] args) {
        // 1. Tạo biến tham chiếu lớp cha
        Shape s; // Biến tham chiếu có kiểu là Shape

        // 2. Tham chiếu đến đối tượng lớp con Circle
        s = new Circle();
        // Phương thức nào được gọi? Phụ thuộc vào đối tượng thực tế (Circle)
        s.draw(); // Output: Drawing a Circle

        // 3. Tham chiếu đến đối tượng lớp con Rectangle
        s = new Rectangle();
        // Phương thức nào được gọi? Phụ thuộc vào đối tượng thực tế (Rectangle)
        s.draw(); // Output: Drawing a Rectangle

        // 4. Tham chiếu đến đối tượng lớp cha
        s = new Shape();
        s.draw(); // Output: Drawing a generic shape
    }
}
```

### Giải thích:

* Tại dòng `s.draw();`, trình biên dịch chỉ biết rằng biến `s` là một kiểu **$Shape$** và phương thức **$draw()$** tồn tại trong lớp $Shape$.
* Tuy nhiên, tại **runtime**, JVM kiểm tra đối tượng mà `s` đang thực sự trỏ đến (lúc là $Circle$, lúc là $Rectangle$) và gọi phương thức $draw()$ của đối tượng đó.
* Chính quá trình trì hoãn quyết định gọi phương thức này cho đến runtime được gọi là **Dynamic Method Dispatch**.

-----

## ✨ Tầm Quan Trọng

Dynamic Method Dispatch là cơ chế cốt lõi giúp Java đạt được:

* **Tính linh hoạt:** Cho phép bạn viết mã xử lý các đối tượng của các lớp con khác nhau một cách thống nhất thông qua tham chiếu của lớp cha (hoặc interface).
* **Tính mở rộng (Extensibility):** Bạn có thể dễ dàng thêm một lớp con mới (ví dụ: $Triangle$) mà không cần thay đổi bất kỳ mã nào trong phần xử lý chung (ví dụ: một mảng các $Shape$).

Đây là một trong những đặc tính mạnh mẽ nhất của lập trình hướng đối tượng trong Java.