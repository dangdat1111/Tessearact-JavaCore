/*
Annotation trong Java (dịch nghĩa là chú thích hay siêu dữ liệu) là một hình thức cung cấp siêu dữ liệu (metadata) về chương trình của bạn.
Nó cho phép bạn gắn thêm thông tin vào các thành phần của code như:
lớp (classes), phương thức (methods), trường (fields), biến, và tham số mà không ảnh hưởng trực tiếp đến logic thực thi của chương trình.
 */


@Deprecated // class A1 sớm sẽ k đc dùng nữa
class A1{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B1 extends A1{
    @Override  //Anotation
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }

}

public class Annotation {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
