class Animal{
    public void show(){
        System.out.println("in Animal show");
    }
}
class Dog extends Animal{
    @Override
    public void show(){
        System.out.println("in Dog show");
    }

    public void add(){
        System.out.println("in Dog add");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal dg = new Dog();
        dg.show();
//        dg.add();
    }
}
