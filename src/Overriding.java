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

public class Overriding {
    public static void main(String[] args) {
        Bb obj = new Bb();
        obj.show();
        obj.config();
    }
}
