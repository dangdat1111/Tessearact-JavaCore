
/*
Đặc điểm|	this	                                            super
Ý nghĩa	|Tham chiếu đến đối tượng hiện tại	                |Tham chiếu đến lớp cha trực tiếp
Tham chiếu|	Thành viên (biến/phương thức) của lớp hiện tại	|Thành viên (biến/phương thức) của lớp cha
Gọi Constructor|	this(...) - Gọi constructor cùng lớp	|super(...) - Gọi constructor lớp cha
Mục đích|	Khử sự mơ hồ (Shadowing), chuỗi constructor	    |Truy cập thành viên lớp cha, gọi constructor lớp cha
 */
class A{
    public A(){
        System.out.println("==== in A ====");
    }
    public A(int n){
        System.out.println("==== in A int n ====");
    }
}
class B extends A{

    public B(){
        super();
        System.out.println("==== in B ====");
    }
    public B(int n){
//        super(n);
        this();
        System.out.println("==== in B int n ====");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
