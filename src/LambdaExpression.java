@FunctionalInterface // đánh dấu 1 interface chỉ có 1 method duy nhất
interface LEI{
    void show();
}



public class LambdaExpression {
    public static void main(String[] args) {
        LEI obj  = () -> System.out.println("in show");
        obj.show();
    }
}
