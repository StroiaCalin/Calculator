package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Polinom {
    private HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

    public Polinom(HashMap<Integer, Integer> map) {
        this.map = map;
    }

    public HashMap<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, Integer> map) {
        this.map = map;
    }

    public String toString() {
        String rez = "";
//        for (Map.Entry<Integer, Integer> entry : map.entrySet())
//        {
//            if(entry.getValue()>0)
//                rez +="+"+entry.getValue()  +"*"+ "x^" +entry.getKey();
//            if(entry.getValue()<0)
//                rez += entry.getValue()  +"*"+ "x^" +entry.getKey();
//        }
        ListIterator<Map.Entry<Integer, Integer>> iterator = new ArrayList<>(map.entrySet()).listIterator(map.size());

        while (iterator.hasPrevious()) {
            Map.Entry<Integer, Integer> entry = iterator.previous();
            if (entry.getValue() > 0) {
                rez += "+" + entry.getValue() + "*" + "x^" + entry.getKey();
            } else if (entry.getValue() < 0) {
                rez += entry.getValue() + "*" + "x^" + entry.getKey();
            }
        }

        //   rez= rez.substring(0,rez.length()-1);
        return rez;
    }

    public int size() {
        int i=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
           i++;
        }
        return i;
    }
}



