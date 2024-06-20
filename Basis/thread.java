package Basis;

public class thread extends Thread{ 
    public void run(){
        System.out.println("threadingggg");
    }
    public static void main(String[] args) {
        thread threadd = new thread();
        threadd.start();
        System.out.println("This code is outside of the thread");
        
    }

}
