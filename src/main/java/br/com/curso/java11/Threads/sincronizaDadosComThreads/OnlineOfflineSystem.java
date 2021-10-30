package br.com.curso.java11.Threads.sincronizaDadosComThreads;

public class OnlineOfflineSystem {

    public static void main(String[] args) {
        Data data = new Data();
        data.setOutOfSync(true); // Caso eu comentar essa linha eu preciso do deamon para a aplicação parar
        Thread readData = new Thread(new ReadDataThread(data));
        Thread syncData = new Thread(new SyncDataThread(data));
        syncData.setDaemon(true); // JVM termina o processo
        readData.start();
        syncData.start();
    }
}
