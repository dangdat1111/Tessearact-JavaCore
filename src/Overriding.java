class Aa{
    public void show(){
        System.out.println("in A Show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class Bb extends Aa{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

class DongVat {
    // Phương thức lớp cha
    public void keu() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Cho extends DongVat {
    // Ghi đè phương thức keu() của lớp cha
    @Override
    public void keu() {
        System.out.println("Chó kêu: Gâu Gâu");
    }

    // Ghi đè với mức truy cập rộng hơn (ví dụ: nếu keu() ở DongVat là protected)
    // Hoặc sử dụng từ khóa super để gọi phương thức lớp cha
    public void keuVaGoiCha() {
        super.keu(); // Gọi phương thức keu() của lớp DongVat
        System.out.println("Và Chó kêu tiếp: Gâu Gâu");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Bb obj = new Bb();
        obj.show();
        obj.config();

        DongVat dv = new DongVat();
        Cho ch = new Cho();
        DongVat dvLaCho = new Cho(); // Tính đa hình

        dv.keu();         // Output: Động vật phát ra âm thanh
        ch.keu();         // Output: Chó kêu: Gâu Gâu (Phương thức lớp con được gọi)
        dvLaCho.keu();    // Output: Chó kêu: Gâu Gâu (Tính đa hình: phương thức được gọi dựa trên kiểu đối tượng thực tế)

        ch.keuVaGoiCha(); // Output: Động vật phát ra âm thanh \n Và Chó kêu tiếp: Gâu Gâu
    }
}
