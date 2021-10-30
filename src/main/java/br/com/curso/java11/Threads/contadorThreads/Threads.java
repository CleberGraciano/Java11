package br.com.curso.java11.Threads.contadorThreads;

public class Threads implements Runnable {

    private int counter;

    @Override
    public void run() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() +": "+counter);
        }

    }
}
