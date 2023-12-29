package org.example;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import org.example.View;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Controller {
    private View view;
    private Operatii operatii;
    private Polinom polinom1;
    private Polinom polinom2;

    public String text1="";
    public String text2="";


    public Controller(View v)
    {
//	model[i]=m;
        view=v;
//	initView(i);
    }


    public void initController()
    {
        view.getJb0().addActionListener(e->zero());
        view.getJb1().addActionListener(e->unu());
        view.getJb2().addActionListener(e->doi());
        view.getJb3().addActionListener(e->trei());
        view.getJb4().addActionListener(e->patru());
        view.getJb5().addActionListener(e->cinci());
        view.getJb6().addActionListener(e->sase());
        view.getJb7().addActionListener(e->sapte());
        view.getJb8().addActionListener(e->opt());
        view.getJb9().addActionListener(e->noua());
        view.getJbPutere().addActionListener(e->putere());
        view.getJbOri().addActionListener(e->ori());
        view.getJbAdd().addActionListener(e-> add());
        view.getJbSubs().addActionListener(e->subs());
        view.getJbX().addActionListener(e->x());
        view.getJbplus().addActionListener(e->adunare(view.getPolinom1().getText(),view.getPolinom2().getText()));
        view.getJbminus().addActionListener(e->minus(view.getPolinom1().getText(),view.getPolinom2().getText()));
        view.getJbMultiply().addActionListener(e->multiply(view.getPolinom1().getText(),view.getPolinom2().getText()));
        view.getJbDerivative().addActionListener(e->derivative(view.getPolinom1().getText()));
        view.getJbIntegration().addActionListener(e->integrate(view.getPolinom1().getText()));
        view.getJbReset().addActionListener(e->reset());
        view.getJbSterge().addActionListener(e->sterge());


    }
    private void sterge()
    {
        if(view.getJb10().isSelected())
        {
            text1= text1.substring(0,text1.length()-1);
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            text2= text2.substring(0,text2.length()-1);
            view.getPolinom2().setText(text2);

        }


    }
    private void reset()
    {
        text1="";
        text2="";
        view.getPolinom1().setText("");
        view.getPolinom2().setText("");
        view.getPolinom3().setText("Result=");
    }
    private void integrate(String polinom1)
    {

        LinkedList<Integer> numbersForFirst = new LinkedList<Integer>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher firstString = p.matcher(polinom1);
        while (firstString.find()) {
            numbersForFirst.add(Integer.parseInt(firstString.group()));
        }
        Operatii Operatii= new Operatii();
        HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
        HashMap<Integer, Fraction> third = new HashMap<Integer, Fraction>();
        for(int i=0;i<numbersForFirst.size();i+=2)
        {
            first.put(numbersForFirst.get(i+1),numbersForFirst.get(i));// (putere,coeficient)
        }
        Polinom primul= new Polinom(first);
        PolinomSpecial aux= new PolinomSpecial(third);
        aux.setMap(Operatii.integrate(primul.getMap()));
        view.getPolinom3().setText("Result="+aux.toString());
    }
    private void derivative(String polinom1)
    {

        LinkedList<Integer> numbersForFirst = new LinkedList<Integer>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher firstString = p.matcher(polinom1);
        while (firstString.find()) {
            numbersForFirst.add(Integer.parseInt(firstString.group()));
        }
        Operatii Operatii= new Operatii();
        HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> third = new HashMap<Integer, Integer>();
        for(int i=0;i<numbersForFirst.size();i+=2)
        {
            first.put(numbersForFirst.get(i+1),numbersForFirst.get(i));// (putere,coeficient)
        }
        Polinom primul= new Polinom(first);
        Polinom aux= new Polinom(third);
        aux.setMap(Operatii.derivative(primul.getMap()));
        view.getPolinom3().setText("Result="+aux.toString());
    }

    private void multiply(String polinom1,String polinom2)
    {

        LinkedList<Integer> numbersForFirst = new LinkedList<Integer>();
        LinkedList<Integer> numbersForSecond = new LinkedList<Integer>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher firstString = p.matcher(polinom1);
        Matcher secondString = p.matcher(polinom2);
        while (firstString.find()) {
            numbersForFirst.add(Integer.parseInt(firstString.group()));
        }
        while (secondString.find()) {
            numbersForSecond.add(Integer.parseInt(secondString.group()));
        }
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
        Polinom primul= new Polinom(first);
        Polinom doilea= new Polinom(second);
        Polinom aux= new Polinom(third);
        aux.setMap(Operatii.multiply(primul.getMap(),doilea.getMap()));
        view.getPolinom3().setText("Result="+aux.toString());

    }
    private void minus(String polinom1,String polinom2)
    {

        LinkedList<Integer> numbersForFirst = new LinkedList<Integer>();
        LinkedList<Integer> numbersForSecond = new LinkedList<Integer>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher firstString = p.matcher(polinom1);
        Matcher secondString = p.matcher(polinom2);
        while (firstString.find()) {
            numbersForFirst.add(Integer.parseInt(firstString.group()));
        }
        while (secondString.find()) {
            numbersForSecond.add(Integer.parseInt(secondString.group()));
        }
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
        Polinom primul= new Polinom(first);
        Polinom doilea= new Polinom(second);
        Polinom aux= new Polinom(third);
        aux.setMap(Operatii.scadere(primul.getMap(),doilea.getMap()));
        view.getPolinom3().setText("Result="+aux.toString());

    }
    private void adunare(String polinom1,String polinom2)
    {

        LinkedList<Integer> numbersForFirst = new LinkedList<Integer>();
        LinkedList<Integer> numbersForSecond = new LinkedList<Integer>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher firstString = p.matcher(polinom1);
        Matcher secondString = p.matcher(polinom2);
        while (firstString.find()) {
            numbersForFirst.add(Integer.parseInt(firstString.group()));
        }
        while (secondString.find()) {
            numbersForSecond.add(Integer.parseInt(secondString.group()));
        }
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
        Polinom primul= new Polinom(first);
        Polinom doilea= new Polinom(second);
        Polinom aux= new Polinom(third);
        aux.setMap(Operatii.adunare(primul.getMap(),doilea.getMap()));
        view.getPolinom3().setText("Result="+aux.toString());

    }

    private void x(){
        if(view.getJb10().isSelected())
        {
            view.getJbX().setActionCommand(text1 = text1 + "x");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJbX().setActionCommand(text2 = text2 + "x");
            view.getPolinom2().setText(text2);
        }
    }
    private void subs(){
        if(view.getJb10().isSelected())
        {
            view.getJbSubs().setActionCommand(text1 = text1 + "-");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJbSubs().setActionCommand(text2 = text2 + "-");
            view.getPolinom2().setText(text2);
        }
    }
    private void add(){
        if(view.getJb10().isSelected())
        {
            view.getJbAdd().setActionCommand(text1 = text1 + "+");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJbAdd().setActionCommand(text2 = text2 + "+");
            view.getPolinom2().setText(text2);
        }
    }
    private void ori(){
        if(view.getJb10().isSelected())
        {
            view.getJbOri().setActionCommand(text1 = text1 + "*");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJbOri().setActionCommand(text2 = text2 + "*");
            view.getPolinom2().setText(text2);
        }
    }
    private void putere(){
        if(view.getJb10().isSelected())
        {
            view.getJbPutere().setActionCommand(text1 = text1 + "^");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJbPutere().setActionCommand(text2 = text2 + "^");
            view.getPolinom2().setText(text2);
        }
    }
    private void noua(){
        if(view.getJb10().isSelected())
        {
            view.getJb9().setActionCommand(text1 = text1 + "9");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb9().setActionCommand(text2 = text2 + "9");
            view.getPolinom2().setText(text2);
        }
    }
    private void opt(){
        if(view.getJb10().isSelected())
        {
            view.getJb8().setActionCommand(text1 = text1 + "8");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb8().setActionCommand(text2 = text2 + "8");
            view.getPolinom2().setText(text2);
        }
    }
    private void sapte(){
        if(view.getJb10().isSelected())
        {
            view.getJb7().setActionCommand(text1 = text1 + "7");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb7().setActionCommand(text2 = text2 + "7");
            view.getPolinom2().setText(text2);
        }
    }
    private void sase(){
        if(view.getJb10().isSelected())
        {
            view.getJb6().setActionCommand(text1 = text1 + "6");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb6().setActionCommand(text2 = text2 + "6");
            view.getPolinom2().setText(text2);
        }
    }
    private void cinci(){
        if(view.getJb10().isSelected())
        {
            view.getJb5().setActionCommand(text1 = text1 + "5");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb5().setActionCommand(text2 = text2 + "5");
            view.getPolinom2().setText(text2);
        }
    }
    private void patru(){
        if(view.getJb10().isSelected())
        {
            view.getJb4().setActionCommand(text1 = text1 + "4");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb4().setActionCommand(text2 = text2 + "4");
            view.getPolinom2().setText(text2);
        }
    }
    private void trei(){
        if(view.getJb10().isSelected())
        {
            view.getJb3().setActionCommand(text1 = text1 + "3");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb3().setActionCommand(text2 = text2 + "3");
            view.getPolinom2().setText(text2);
        }
    }
    private void doi(){
        if(view.getJb10().isSelected())
        {
            view.getJb2().setActionCommand(text1 = text1 + "2");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb2().setActionCommand(text2 = text2 + "2");
            view.getPolinom2().setText(text2);
        }
    }
    private void unu(){
        if(view.getJb10().isSelected())
        {
            view.getJb1().setActionCommand(text1 = text1 + "1");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb1().setActionCommand(text2 = text2 + "1");
            view.getPolinom2().setText(text2);
        }
    }
    private void zero(){
        if(view.getJb10().isSelected())
        {
            view.getJb0().setActionCommand(text1 = text1 + "0");
            view.getPolinom1().setText(text1);
        }
        if(view.getJb11().isSelected())
        {
            view.getJb0().setActionCommand(text2 = text2 + "0");
            view.getPolinom2().setText(text2);
        }
    }
    private void test() {
        JOptionPane.showMessageDialog(null, "test", "Info", JOptionPane.INFORMATION_MESSAGE);

    }
}