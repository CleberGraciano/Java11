package br.com.curso.java11.Threads.contadorThreads;

public class Counter {
    public static void main(String[] args) {
        Threads thread = new Threads();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        Thread thread3 = new Thread(thread);
        Thread thread4 = new Thread(thread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
