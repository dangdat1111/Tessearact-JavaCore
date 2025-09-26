public class string {
    public static void main(String[] args) {
        String name = "lol";
        System.out.println("hello" + name);
        /*
        1. Stack: Biến Tham chiếu
Khi chương trình chạy, luồng thực thi (thread) sẽ sử dụng bộ nhớ Stack để lưu trữ các biến cục bộ (local variables).

String name: Biến tham chiếu name được tạo ra trên Stack. Biến này không chứa chuỗi "lol" mà chứa địa chỉ bộ nhớ (tham chiếu) trỏ đến đối tượng String thực sự trên Heap.

        2. Heap: Đối tượng Chuỗi
Bộ nhớ Heap là nơi lưu trữ các đối tượng.

"lol": Một đối tượng String với giá trị là "lol" được tạo ra trên Heap. Vì "lol" là một hằng chuỗi (String Literal), nó thường được lưu trữ trong String Pool (một phần của Heap) để tái sử dụng. Biến name trên Stack trỏ đến đối tượng này.

"hello": Tương tự, hằng chuỗi "hello" cũng được tạo ra trong String Pool trên Heap.
        3. Hoạt động của Toán tử + (Nối chuỗi)
Phần phức tạp nhất là khi toán tử cộng (+) được sử dụng để nối chuỗi:

"hello" + name

Trình biên dịch Java (hoặc JVM) sẽ tối ưu hóa phép nối chuỗi này bằng cách sử dụng lớp StringBuilder (hoặc StringBuffer trong các phiên bản cũ hơn, hoặc khi có nhiều luồng).

Quá trình này diễn ra như sau:

Một đối tượng StringBuilder tạm thời được tạo ra trên Heap.

Nội dung của "hello" được thêm vào StringBuilder.

Nội dung được trỏ bởi biến name (tức là "lol") được thêm vào StringBuilder.

Phương thức toString() của StringBuilder được gọi để tạo ra đối tượng String cuối cùng: "hellolol".

============================OPTIMIZER=======================================================>
Trong Java, việc "tối ưu dấu **+**" (toán tử cộng) chủ yếu áp dụng cho ngữ cảnh **nối chuỗi** (`String concatenation`), đặc biệt là trong các vòng lặp lớn hoặc khi xử lý nhiều lần.

Khi bạn dùng dấu `+` để nối chuỗi (ví dụ: `"hello" + name`), Java sẽ tự động tạo ra nhiều đối tượng trung gian trên **Heap**. Việc tối ưu ở đây là **tránh sử dụng dấu `+`** trong những tình huống gây lãng phí tài nguyên và làm tăng công việc cho Garbage Collector (GC).

-----

## 1\. Cách Tối ưu: Sử dụng `StringBuilder` hoặc `StringBuffer`

Cách tối ưu nhất để thay thế toán tử `+` trong các tình huống nối chuỗi lặp đi lặp lại là sử dụng các lớp chuyên dụng:

| Lớp | Khi nào sử dụng | Đặc điểm tối ưu |
| :--- | :--- | :--- |
| **`StringBuilder`** | Khi nối chuỗi trong **môi trường đơn luồng** (single-threaded), tức là không có nhiều luồng truy cập cùng lúc. | **Tốc độ nhanh nhất** vì không cần xử lý đồng bộ hóa (synchronization overhead). |
| **`StringBuffer`** | Khi nối chuỗi trong **môi trường đa luồng** (multi-threaded), nơi nhiều luồng có thể truy cập chuỗi cùng lúc. | **An toàn luồng (thread-safe)** vì có các phương thức được đồng bộ hóa, nhưng chậm hơn `StringBuilder`. |

### Ví dụ về Tối ưu hóa

Thay vì code không tối ưu:

```java
String result = "";
for (int i = 0; i < 10000; i++) {
    // KHÔNG TỐI ƯU: Tạo ra hàng nghìn đối tượng String mới trên Heap.
    result = result + i;
}
```

Sử dụng code tối ưu:

```java
// TỐI ƯU: Chỉ tạo một đối tượng chính trên Heap và thay đổi nó.
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10000; i++) {
    sb.append(i);
}
String result = sb.toString();
```

-----

## 2\. Các Trường hợp KHÔNG CẦN Tối ưu Dấu `+`

Bạn **không cần** lo lắng về việc tối ưu dấu `+` trong các trường hợp sau, vì trình biên dịch Java đã đủ thông minh để xử lý hiệu quả:

| Trường hợp | Giải thích |
| :--- | :--- |
| **Nối chuỗi đơn giản** | Ví dụ: `String fullName = firstName + " " + lastName;`. Trình biên dịch sẽ tự động dùng `StringBuilder` ngầm định, chỉ tạo ra một `StringBuilder` và một `String` cuối cùng. |
| **Trong `System.out.println()`** | Ví dụ: `System.out.println("Giá trị: " + value);`. Việc nối chuỗi này chỉ xảy ra một lần và không nằm trong vòng lặp hiệu suất cao. |
| **Trong toán tử số học** | Dấu `+` được dùng để cộng số (ví dụ: `int c = a + b;`). Đây là phép toán học thông thường, không liên quan đến việc nối chuỗi hay vấn đề hiệu suất Heap. |
         */
    }
}
