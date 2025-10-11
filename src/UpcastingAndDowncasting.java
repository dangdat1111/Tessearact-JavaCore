class Cha {
    public void show(){
        System.out.println(" in Cha show");
    }
}

class Con extends Cha{
    @Override
    public void show(){
        System.out.println(" in Con show");
    }

    public void talk(){
        System.out.println(" in Con talk");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        // upcasting
        Cha upcasting = new Con();
        upcasting.show();
//        obj.talk; //

        Cha downcasting = new Con();
        // Downcasting để truy cập phương thức đặc trưng của Dog
        //Sử dụng instanceof
        //Vì Downcasting không an toàn, trong Java, chúng ta thường sử dụng toán tử instanceof để kiểm tra xem đối tượng được tham chiếu bởi biến lớp cha có thực sự là một thể hiện của lớp con mà chúng ta muốn ép kiểu hay không. Điều này giúp ngăn chặn ngoại lệ ClassCastException.
        if (downcasting instanceof Con){  // Cực kỳ quan trọng để kiểm tra trước!
            Con objCon = (Con) downcasting; // Downcasting tường minh
            objCon.talk();
        }
    }
}
