class Ano{
    public Ano(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in Ano Show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
//        Ano obj = new Ano();
//        obj.show();
        // convert anonymousObject
        new Ano().show(); //anonymousObject

    }
}
