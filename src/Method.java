class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

class Calculat{
    public int add (int n1, int n2, int n3){
        int result = n1 + n2 + n3;
        return result;
    }
    // overloading method
    public int add (int n1, int n2){
        return n1 + n2;
    }

    public double add (double n1 , double n2){
        return n1 + n2;
    }
}

public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
//        System.out.println(obj.getMeAPen(10));
        String str = obj.getMeAPen(2);
        System.out.println(str);

        Calculat cal = new Calculat();

        // Gọi phương thức add(int, int)
        System.out.println("Kết quả cộng 2 số nguyên: " + cal.add(10, 20));

        // Gọi phương thức add(int, int, int)
        System.out.println("Kết quả cộng 3 số nguyên: " + cal.add(10, 20, 30));

        // Gọi phương thức add(double, double)
        System.out.println("Kết quả cộng 2 số double: " + cal.add(10.5, 20.3));
    }
}
