package org.example;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Integer> numbersForFirst = new LinkedList<Integer>();
        LinkedList<Integer> numbersForSecond = new LinkedList<Integer>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher firstString = p.matcher("4*x^5-2*x^4+1*x^2-8*x^1+1*x^0");
        Matcher secondString = p.matcher("3*x^4-1*x^3+1*x^2+2*x^1-1*x^0");
        while (firstString.find()) {
            numbersForFirst.add(Integer.parseInt(firstString.group()));
        }
        while (secondString.find()) {
            numbersForSecond.add(Integer.parseInt(secondString.group()));
        }
//        for(int i=0;i<numbersForFirst.size();i++)
//        {
//            System.out.println(numbersForFirst.get(i));
//        }
//        for(int i=0;i<numbersForSecond.size();i++)
//        {
//            System.out.println(numbersForSecond.get(i));
//        }
        Operatii Operatii= new Operatii();
        HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> second = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> third = new HashMap<Integer, Integer>();
        for(int i=0;i<numbersForFirst.size();i+=2)
        {
            first.put(numbersForFirst.get(i+1),numbersForFirst.get(i));// (putere,coeficient)
        }
        for(int i=0;i<numbersForSecond.size();i+=2)
        {
            second.put(numbersForSecond.get(i+1),numbersForSecond.get(i));
        }
        Polinom polinom1= new Polinom(first);
        Polinom polinom2= new Polinom(second);
        System.out.println(polinom1.toString());
        System.out.println(polinom2.toString());
//     //   System.out.println(polinom1.getMap().size());
        Polinom aux= new Polinom(third);
      //  aux.setMap(Operatii.adunare(polinom1.getMap(),polinom2.getMap()));
        aux.setMap(Operatii.scadere(polinom1.getMap(),polinom2.getMap()));
//        //System.out.println(polinom1.size());
//        //System.out.println(second.toString());
        System.out.printf(aux.toString());
    }
}