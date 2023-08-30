public class StaticDemo {
    static int staticVar = 10;

    static {
        System.out.println("This is a static block.");
        staticVar = 20;
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        System.out.println("Static variable value: " + staticVar);
        staticMethod();
    }
}
