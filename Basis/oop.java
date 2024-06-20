package Basis;
public class oop {
    public static void main(String[] args) {
        Second examSecond = new Second("nguyen");
        // System.out.println(examSecond.sayHello());
        // examSecond.setName("truong");
        // System.out.println(examSecond.sayHello());

        Third examThird = new Third("nguyen",2004);
        System.out.println(examThird.sayAge());
        System.out.println(examThird.sayHello());

    }
}
