
class Calculator{
    public int add (int num1, int num2){
        return num1 + num2;
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 4;
        int num2 = 5;

        System.out.println(calc.add(num1, num2));


    }
}
