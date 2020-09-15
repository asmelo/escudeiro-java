package com.db1.plataforma.questao12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            File file = new File("arquivoTeste.txt");

            //Como o arquivo arquivoTeste.txt não existe o contrutor da classe Scanner irá lançar a exceção Checked
            //FileNotFoundException e a execução do código é interrompida.
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {

            //Caso a exceção FileNotFoundException seja lançada o código presente no catch será executado
            System.out.println("Ocorreu um erro na leitura do arquivo: " + e.getMessage());

        } finally {

            //O trecho de código presente no bloco finally será será sempre executado independente se a exceção foi capturada ou não
            System.out.println("Finalizado o processo de leitura do arquivo");
        }

    }

}
