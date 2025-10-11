abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("play Music");
    }
}
class VinFast extends Car{
    @Override
    public void drive(){
        System.out.println("Drive");
    }
}
public class Abtract {
    public static void main(String[] args) {
        Car obj = new VinFast();
        obj.drive();
        obj.playMusic();
    }
}
