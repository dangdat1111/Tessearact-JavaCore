public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 8;

        if (x>10 && x<=20) System.out.println("Hiii");
        else System.out.println("Heloooo");

        // ternary is a SHORTCUT for the If-Else
        // variable = (condition) ? value_if_true : value_if_false;

        int n =4;
        int result = 0;

        //Not Ternary
        if (n%2 == 0 )
            result = 10;
        else
            result = 20;
        System.out.println("Not Ternary "  + result);

        // Ternary
        result = n%2==0 ? 10 : 20;
        System.out.println("Ternary " + result);

    }
}
