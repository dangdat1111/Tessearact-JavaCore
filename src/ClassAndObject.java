
class Calculator{
    int a ;

    public int add (int num1, int num2){
        return num1 + num2;
    }
    public void println(){
        System.out.println("hiiiiiiii");
    }

}

public class ClassAndObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 4;
        int num2 = 5;

        int number = 10;
        calc.a =  number;
        System.out.println(number);
        calc.println();
        System.out.println(calc.add(num1, num2));


    }
}
