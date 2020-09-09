package com.db1.plataforma.questao8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ColletionExample {

    public static void main(String[] args) {

        //Exemplos do uso de métodos declarados na interface Colletion

        List<String> shoppingList = new ArrayList<>();
        List<String> productList = new ArrayList<>();

        productList.add("Feijão");
        productList.add("Arroz");
        productList.add("Tomate");
        productList.add("Batata");

        shoppingList.addAll(productList);

        HashMap<String, Integer> currentProductStock = getCurrentProductStock();
        for (String product : productList) {
            int quantity = currentProductStock.get(product);
            if (quantity > 1) {
                shoppingList.remove(product);
            }
        }

        System.out.println("A lista de compras com os produtos com baixo estoque é: " + shoppingList);
        System.out.println("A lista de compras possui " + shoppingList.size() + " produtos.");

        if (shoppingList.contains("Arroz")) {
            System.out.println("O Arroz está na lista de compras");
        }

    }

    private static HashMap<String, Integer> getCurrentProductStock() {
        HashMap<String, Integer> productStockMap = new HashMap<>();

        productStockMap.put("Feijão", 5);
        productStockMap.put("Arroz", 0);
        productStockMap.put("Tomate", 1);
        productStockMap.put("Batata", 3);

        return  productStockMap;
    }




}
