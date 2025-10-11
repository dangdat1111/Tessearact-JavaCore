abstract class Car{
    public abstract void drive();
    public abstract void fire();
    public void playMusic(){
        System.out.println("play Music");
    }
}
class VinFast extends Car{
    @Override
    public void drive(){
        System.out.println("Drive");
    }

    @Override
    public void fire(){
        System.out.println("fire");
    }
}
public class Abtract {
    public static void main(String[] args) {
        Car obj = new VinFast();
        obj.drive();
        obj.playMusic();
        obj.fire();
    }
}
