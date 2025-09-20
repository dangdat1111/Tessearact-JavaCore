public class Loop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 4){
            System.out.println("Hi " + i );
            i++;
        }
        System.out.println("Bye " + i);


        int j = 1;
        do {
            System.out.println("Hello " + j );
            j++;
        } while (j <= 5);

        for(int  a = 1 ; a <= 2; a++){
            System.out.println("Cook " +a);
            for(int b = 0 ; b < a; b ++){
                System.out.println("Boom" + b);
            }
        }
    }
}
