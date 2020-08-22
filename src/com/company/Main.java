package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here

        HashMap<String, String[]> dictionary = new HashMap<>();

        dictionary.put("село", new String[]{"деревня", "поселок", "кишлак"});
        dictionary.put("удивительный", new String[]{"невероятный", "потрясающий", "потрясный"});
        dictionary.put("программист", new String[]{"гик", "девелопер", "айтишник"});
        dictionary.put("красивый", new String[]{"очаровательный", "симпатичный", "прелестный"});


        HashMap<String, String[]> bigDictionary = new HashMap<>(dictionary);
        bigDictionary.putAll(dictionary);
        Set<String> keys = bigDictionary.keySet();
        Collection<String[]> values = bigDictionary.values();
        Iterator<String> iterKeys = keys.iterator();
        while (iterKeys.hasNext()) {
            String k = iterKeys.next();
            String[] v = bigDictionary.get(k);
            ArrayList<String> valuesList = new ArrayList<>(Arrays.asList(v));
            Iterator<String> iterValuesList = valuesList.iterator();
            while (iterValuesList.hasNext()) {
                String iterV = iterValuesList.next();
                String[] newV = new String[valuesList.size()];
                valuesList.toArray(newV);
                dictionary.put(iterV,newV);


            }

        }


        Set<String> keysBD = bigDictionary.keySet();
        Iterator<String> iterBigDictionary = keysBD.iterator();
        while (iterBigDictionary.hasNext()) {
            String kBD = iterBigDictionary.next();
            System.out.println(kBD + " " + Arrays.toString(bigDictionary.get(kBD)));
        }
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите любое слово");
            String word = sc.next();
            String[] synonym = dictionary.get(word);
            if (synonym == null) {
                System.out.println("Такого слова нет в словаре, повторите попытку");
            } else {

                Random random = new Random();
                int x = random.nextInt(synonym.length);
                System.out.println(synonym[x]);
            }
        }


    }


}

