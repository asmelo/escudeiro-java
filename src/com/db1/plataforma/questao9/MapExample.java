package com.db1.plataforma.questao9;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        /*
            Um map consiste em um objeto que faz o mapeamento entre uma chave e um valor. Um Map não pode possuir chaves duplicadas
            e cada chave faz o mapeamento de apenas um valor.
         */

        // Exemplos de uso dos métodos declarados na interface Map

        HashMap<String, String> ipDnsMap = new HashMap<>();
        HashMap<String, String> ipDnsMapGoogle = new HashMap<>();
        HashMap<String, String> ipDnsMapMicrosoft = new HashMap<>();

        //Aplicações Google
        ipDnsMapGoogle.put("www.google.com.br", "172.217.162.99");
        ipDnsMapGoogle.put("www.drive.google.com", "64.233.190.189");
        ipDnsMapGoogle.put("www.photos.google.com", "216.58.202.238");

        //Aplicações
        ipDnsMapMicrosoft.put("www.azure.microsoft.com", "104.41.9.139");
        ipDnsMapMicrosoft.put("www.powerplatform.microsoft.com", "40.118.246.51");
        ipDnsMapMicrosoft.put("www.onedrive.live.com", "127.0.0.0");

        ipDnsMapMicrosoft.replace("www.onedrive.live.com", "23.44.182.222");

        ipDnsMap.putAll(ipDnsMapGoogle);
        ipDnsMap.putAll(ipDnsMapMicrosoft);

        System.out.println("O IP da www.azure.microsoft.com é " + ipDnsMap.get("www.azure.microsoft.com"));
        System.out.println("O IP do www.drive.google.com é " + ipDnsMap.get("www.drive.google.com"));
        System.out.println("Existem " + ipDnsMap.size() + " IPs mapeados");

        System.out.println("\nOs mapeamentos existentes são: ");
        ipDnsMap.entrySet().forEach(System.out::println);

        if (!ipDnsMap.containsKey("www.uol.com.br")) {
            System.out.println("\nO endereço www.uol.com.br não está mapeado");
        }

    }

}
