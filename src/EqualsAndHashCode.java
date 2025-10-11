import java.util.Objects;

class X{


    int price;
    String brand;

//    public String toString(){
//        return "hey";
//    }

    @Override
    public String toString() {
        return "X {" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }


//    public boolean equals(X obj){
////        if (this.brand.equals(obj.brand) && this.price == obj.price){ return true;}
////        else return false;
//        return this.brand.equals(obj.brand) && this.price == obj.price;
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        X x = (X) o;
        return price == x.price && Objects.equals(brand, x.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, brand);
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {
        X obj1 = new X();
        obj1.price = 200;
        obj1.brand = "iphone";

        X obj2 = new X();
        obj2.price = 200;
        obj2.brand = "iphone";

//        boolean result = obj2 == obj1; // false
        //Phương thức equals()
        //Phương thức equals() được sử dụng để so sánh xem hai đối tượng có bằng nhau về mặt giá trị (state) hay không.
        //Cần ghi đè (Override): Hầu hết các lớp tùy chỉnh (custom classes) cần ghi đè phương thức này để so sánh các trường (fields) quan trọng (key fields) của đối tượng.
        boolean result = obj2.equals(obj1); //false
        System.out.println(obj2);
        System.out.println(result);
        System.out.println(obj2.hashCode() == obj1.hashCode());
    }
}
