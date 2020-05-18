package cn.itcast.day05.demo01;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println("my name is " + getString() + ",I am "+ getAge()+ " years old");
    }

    private static String getString() {
        return "itBoys";
    }

    private static int getAge() {
        return 18;
    }
}
