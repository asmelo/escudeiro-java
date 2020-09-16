package com.db1.plataforma.questao12;

public class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Realiando tarefa");

        } catch (InterruptedException e) {
            System.out.println("Exceção InterruptedException lançada: " + e.getMessage());
        }
    }
}