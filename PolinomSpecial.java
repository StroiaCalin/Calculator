package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class PolinomSpecial {
    private HashMap<Integer, Fraction> map = new HashMap<Integer,Fraction>();

    public PolinomSpecial(HashMap<Integer, Fraction> map) {
        this.map = map;
    }

    public HashMap<Integer, Fraction> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, Fraction> map) {
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
        ListIterator<Map.Entry<Integer, Fraction>> iterator = new ArrayList<>(map.entrySet()).listIterator(map.size());

        while (iterator.hasPrevious()) {
            Map.Entry<Integer, Fraction> entry = iterator.previous();
                rez += entry.getValue().getNumarator()+"/"+entry.getValue().getNumitor() + "*" + "x^" + entry.getKey()+"+";

        }

           rez+="C";
        return rez;
    }

    public int size() {
        int i=0;
        for (Map.Entry<Integer, Fraction> entry : map.entrySet())
        {
            i++;
        }
        return i;
    }
}



