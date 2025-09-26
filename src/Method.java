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

public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
//        System.out.println(obj.getMeAPen(10));
        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}
