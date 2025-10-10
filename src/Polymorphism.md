Polymorphism (Đa hình) trong Java là một khái niệm cơ bản của lập trình hướng đối tượng (OOP) cho phép bạn định nghĩa một **giao diện chung** để làm việc với các **đối tượng khác nhau** từ các lớp khác nhau, miễn là chúng có một mối quan hệ kế thừa hoặc triển khai (interface).

Nói cách khác, nó cho phép **một tên** được sử dụng cho **nhiều chức năng khác nhau**.

-----

## 💡 Các Loại Polymorphism

Trong Java, polymorphism được chia làm hai loại chính:

### 1\. Compile-time Polymorphism (Đa hình lúc biên dịch)

Còn gọi là **Static Polymorphism** hoặc **Method Overloading** (Nạp chồng phương thức).

* **Định nghĩa:** Xảy ra khi một lớp có nhiều phương thức cùng tên nhưng khác nhau về **số lượng** hoặc **kiểu dữ liệu** của các tham số đầu vào. Trình biên dịch sẽ quyết định phương thức nào được gọi dựa trên chữ ký (signature) của phương thức trong quá trình biên dịch.

* **Ví dụ:**

  ```java
  class Calculator {
      // Phương thức 1: Cộng hai số nguyên
      int add(int a, int b) {
          return a + b;
      }

      // Phương thức 2: Cộng ba số nguyên (Overloading)
      int add(int a, int b, int c) {
          return a + b + c;
      }

      // Phương thức 3: Cộng hai số thực (Overloading)
      double add(double a, double b) {
          return a + b;
      }
  }
  ```

-----

### 2\. Runtime Polymorphism (Đa hình lúc chạy)

Còn gọi là **Dynamic Polymorphism** hoặc **Method Overriding** (Ghi đè phương thức).

* **Định nghĩa:** Xảy ra khi một lớp con (subclass) cung cấp một triển khai cụ thể cho một phương thức đã được định nghĩa sẵn trong lớp cha (superclass) của nó. Việc gọi phương thức nào sẽ được xác định trong thời gian chạy (runtime) thông qua **Tham chiếu của lớp cha** trỏ đến **Đối tượng của lớp con**.

* **Nguyên tắc:** Dựa trên cơ chế **Upcasting** (ép kiểu lên) từ lớp con sang lớp cha.

* **Ví dụ:**

  ```java
  class Animal { // Lớp cha
      void sound() {
          System.out.println("Animal makes a sound");
      }
  }

  class Cat extends Animal { // Lớp con 1
      @Override
      void sound() {
          System.out.println("Meow"); // Ghi đè phương thức
      }
  }

  class Dog extends Animal { // Lớp con 2
      @Override
      void sound() {
          System.out.println("Woof"); // Ghi đè phương thức
      }
  }

  // Main
  // Khai báo kiểu tham chiếu là Animal nhưng đối tượng là Cat và Dog
  Animal myCat = new Cat(); // Upcasting
  Animal myDog = new Dog(); // Upcasting

  myCat.sound(); // Output: Meow (Phương thức của Cat được gọi)
  myDog.sound(); // Output: Woof (Phương thức của Dog được gọi)
  ```

-----

## 🎯 Lợi ích của Polymorphism

* **Khả năng mở rộng (Extensibility):** Dễ dàng thêm các lớp con mới mà không cần thay đổi code hiện có (đặc biệt với Runtime Polymorphism).
* **Tính linh hoạt (Flexibility):** Cho phép xử lý nhiều loại đối tượng khác nhau một cách thống nhất qua một giao diện chung (tham chiếu lớp cha/interface).
* **Dễ bảo trì (Maintainability):** Code trở nên rõ ràng, sạch sẽ và dễ đọc hơn.
* **Tái sử dụng code (Code Reusability):** Tránh việc viết lại các logic tương tự nhau.