package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        System.out.println("List A");
        ListA.add("Отрицание");
        ListA.add("Гнев");
        ListA.add("Торг");
        ListA.add("Депрессия");
        ListA.add("Принятие");
        System.out.println(ListA);

        ArrayList<String> ListB = new ArrayList<>();
        System.out.println("List B");
        ListB.add("Счастье");
        ListB.add("Радость");
        ListB.add("Любовь");
        ListB.add("Забота");
        ListB.add("Дружелюбие");
        System.out.println(ListB);


        Scanner sc = new Scanner(System.in);

        ArrayList<String> List1= new ArrayList<String>();
        for (int i =0; i<5; i++){
           System.out.println("Input 5 Strings: " + " " + i);
          ListB.add(sc.nextLine());
         System.out.println(ListB);
         }

        ArrayList<String> ListC = new ArrayList<>();
        System.out.println("List C");
        ListC.addAll(ListA);
        ListC.addAll(ListB);
        System.out.println(ListC);

        System.out.println("List C sorted");
        Collections.sort(ListC);
        System.out.println(ListC);

        }

        }










