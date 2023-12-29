package org.example;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;

public class View extends JFrame{
    private JFrame frame;
    private JLabel Polinom1;
    private JLabel P;
    private JLabel Q;
    private JLabel Polinom2;
    private JLabel Polinom3;
    private JButton jbMultiply;
    private JButton  jb0;
    private JButton  jb1;
    private JButton  jb2;
    private JButton  jb3;
    private JButton  jb4;
    private JButton  jb5;
    private JButton  jb6;
    private JButton  jb7;
    private JButton  jb8;
    private JButton  jb9;
    private JButton  jbPutere;
    private JButton  jbOri;
    private JButton  jbX;
    private JButton  jbAdd;
    private JButton  jbSubs;
    private JButton  jbDivision;
    private JButton  jbDerivative;
    private JButton  jbIntegration;
    private JButton  jbReset;
    private JButton  jbSterge;
    private JRadioButton jb10;
    private JRadioButton jb11;
    private JButton  jbplus;
    private JButton  jbminus;

    public View(JFrame frame, JRadioButton jb10, JRadioButton jb11) throws HeadlessException {
        this.frame = frame;
        this.jb10 = jb10;
        this.jb11 = jb11;
    }

    public JRadioButton getJb10() {
        return jb10;
    }

    public void setJb10(JRadioButton jb10) {
        this.jb10 = jb10;
    }

    public JRadioButton getJb11() {
        return jb11;
    }

    public void setJb11(JRadioButton jb11) {
        this.jb11 = jb11;
    }

    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create UI elements
        jb0 = new JButton("0");
        jb1 = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("7");
        jb8 = new JButton("8");
        jb9 = new JButton("9");
        jbPutere = new JButton("^");
        jbAdd = new JButton("+");
        jbX = new JButton("x");
        jbSubs = new JButton("-");
        jbOri = new JButton("*");
        jbminus = new JButton("Substract");
        jbplus = new JButton("Adder");
        jbMultiply = new JButton("Multiply");
        jbDivision = new JButton("Division");
        jbDerivative = new JButton("Derivative");
        jbIntegration = new JButton("Integration");
        jbReset=new JButton("Reset");
        jbSterge=new JButton("<--");


        jb10=new JRadioButton("P(x)");
        jb11=new JRadioButton("Q(x)");


        P = new JLabel("P(x)=");
        Q = new JLabel("Q(x)=");
        Polinom1 = new JLabel();
        Polinom3 = new JLabel("Result=");
        Polinom2 = new JLabel();


        JPanel pannel = new JPanel(null);
        pannel.setPreferredSize(new Dimension(600, 400));
        P.setBounds(40, 10, 150, 30);
        Q.setBounds(40, 50, 150, 30);
        Polinom1.setBounds(75, 10, 150, 30);
        Polinom2.setBounds(75, 50, 150, 30);
          jb1.setBounds(25, 220, 50, 50);
        jb2.setBounds(85, 220, 50, 50);
            jb3.setBounds(145, 220, 50, 50);
        jb4.setBounds(25, 160, 50, 50);
        jb5.setBounds(85, 160, 50, 50);
        jb6.setBounds(145, 160, 50, 50);
        jb7.setBounds(25, 100, 50, 50);
        jb8.setBounds(85, 100, 50, 50);
        jb9.setBounds(145, 100, 50, 50);
        jb0.setBounds(85, 280, 50, 50);
        jb10.setBounds(25, 280, 50, 50);
        jb11.setBounds(145, 280, 50, 50);
        jbPutere.setBounds(205, 100, 50, 50);
        jbOri.setBounds(205, 160, 50, 50);
        jbSubs.setBounds(205, 220, 50, 50);
        jbAdd.setBounds(205, 280, 50, 50);
        jbX.setBounds(265, 100, 50, 50);
        jbplus.setBounds(265, 160,150 , 50);
        jbminus.setBounds(265, 220, 150, 50);
        jbMultiply.setBounds(265, 280, 150, 50);
        jbDivision.setBounds(425, 280, 150, 50);
        jbDerivative.setBounds(425, 220, 150, 50);
        jbIntegration.setBounds(425, 160, 150, 50);
        Polinom3.setBounds(265, 10, 300, 30);
        jbSterge.setBounds(325, 100, 75, 50);
        jbReset.setBounds(410, 100, 165, 50);



//	  pannel.setBorder(BorderFactory.createEmptyBorder(100, 100,100,100));
        pannel.add(P);
        pannel.add(Q);
        pannel.add(Polinom1);
        pannel.add(Polinom2);
        pannel.add(Polinom3);
        pannel.add(jbX);
        pannel.add(jbAdd);
        pannel.add(jbSubs);
        pannel.add(jb0);
        pannel.add(jb1);
        pannel.add(jb2);
        pannel.add(jb3);
        pannel.add(jb4);
        pannel.add(jb5);
        pannel.add(jb6);
        pannel.add(jb7);
        pannel.add(jb8);
        pannel.add(jb9);
        pannel.add(jb10);
        pannel.add(jb11);
        pannel.add(jbminus);
        pannel.add(jbplus);
        pannel.add(jbPutere);
        pannel.add(jbDerivative);
        pannel.add(jbDivision);
        pannel.add(jbIntegration);
        pannel.add(jbOri);
        pannel.add(jbMultiply);
        pannel.add(jbSterge);
        pannel.add(jbReset);
        frame.setContentPane(pannel);
        frame.pack();
        frame.setVisible(true);
    }

    public View(JFrame frame, JButton jbDivision, JButton jbDerivative, JButton jbIntegration) throws HeadlessException {
        this.frame = frame;
        this.jbDivision = jbDivision;
        this.jbDerivative = jbDerivative;
        this.jbIntegration = jbIntegration;
    }

    public View(JButton jbMultiply) throws HeadlessException {
        this.jbMultiply = jbMultiply;
    }

    public JButton getJbMultiply() {
        return jbMultiply;
    }

    public void setJbMultiply(JButton jbMultiply) {
        this.jbMultiply = jbMultiply;
    }

    public JButton getJbDivision() {
        return jbDivision;
    }

    public void setJbDivision(JButton jbDivision) {
        this.jbDivision = jbDivision;
    }

    public JButton getJbDerivative() {
        return jbDerivative;
    }

    public void setJbDerivative(JButton jbDerivative) {
        this.jbDerivative = jbDerivative;
    }

    public JButton getJbIntegration() {
        return jbIntegration;
    }

    public void setJbIntegration(JButton jbIntegration) {
        this.jbIntegration = jbIntegration;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getPolinom1() {
        return Polinom1;
    }

    public View(JButton jbX, JButton jbAdd, JButton jbSubs) throws HeadlessException {
        this.jbX = jbX;
        this.jbAdd = jbAdd;
        this.jbSubs = jbSubs;
    }

    public JLabel getP() {
        return P;
    }

    public JButton getJbX() {
        return jbX;
    }

    public void setJbX(JButton jbX) {
        this.jbX = jbX;
    }

    public JButton getJbAdd() {
        return jbAdd;
    }

    public void setJbAdd(JButton jbAdd) {
        this.jbAdd = jbAdd;
    }

    public JButton getJbSubs() {
        return jbSubs;
    }

    public View(JButton jbReset, JButton jbSterge) throws HeadlessException {
        this.jbReset = jbReset;
        this.jbSterge = jbSterge;
    }

    public JButton getJbReset() {
        return jbReset;
    }

    public void setJbReset(JButton jbReset) {
        this.jbReset = jbReset;
    }

    public JButton getJbSterge() {
        return jbSterge;
    }

    public void setJbSterge(JButton jbSterge) {
        this.jbSterge = jbSterge;
    }

    public void setJbSubs(JButton jbSubs) {
        this.jbSubs = jbSubs;
    }

    public View(JFrame frame, JButton jbPutere, JButton jbOri) throws HeadlessException {
        this.frame = frame;
        this.jbPutere = jbPutere;
        this.jbOri = jbOri;
    }

    public JButton getJbPutere() {
        return jbPutere;
    }

    public void setJbPutere(JButton jbPutere) {
        this.jbPutere = jbPutere;
    }

    public JButton getJbOri() {
        return jbOri;
    }

    public void setJbOri(JButton jbOri) {
        this.jbOri = jbOri;
    }

    public void setP(JLabel p) {
        P = p;
    }

    public JLabel getQ() {
        return Q;
    }

    public void setQ(JLabel q) {
        Q = q;
    }

    public View(JLabel p, JLabel q) throws HeadlessException {
        P = p;
        Q = q;
    }

    public void setPolinom1(JLabel polinom1) {
        Polinom1 = polinom1;
    }

    public JLabel getPolinom2() {
        return Polinom2;
    }

    public void setPolinom2(JLabel polinom2) {
        Polinom2 = polinom2;
    }

    public JButton getMultiply() {
        return jbMultiply;
    }

    public void setMultiply(JButton multiply) {
        jbMultiply = multiply;
    }

    public JButton getJb0() {
        return jb0;
    }

    public void setJb0(JButton jb0) {
        this.jb0 = jb0;
    }

    public JButton getJb1() {
        return jb1;
    }

    public void setJb1(JButton jb1) {
        this.jb1 = jb1;
    }

    public JButton getJb2() {
        return jb2;
    }

    public void setJb2(JButton jb2) {
        this.jb2 = jb2;
    }

    public JButton getJb3() {
        return jb3;
    }

    public void setJb3(JButton jb3) {
        this.jb3 = jb3;
    }

    public JButton getJb4() {
        return jb4;
    }

    public void setJb4(JButton jb4) {
        this.jb4 = jb4;
    }

    public JButton getJb5() {
        return jb5;
    }

    public void setJb5(JButton jb5) {
        this.jb5 = jb5;
    }

    public JButton getJb6() {
        return jb6;
    }

    public void setJb6(JButton jb6) {
        this.jb6 = jb6;
    }

    public JButton getJb7() {
        return jb7;
    }

    public void setJb7(JButton jb7) {
        this.jb7 = jb7;
    }

    public JButton getJb8() {
        return jb8;
    }

    public void setJb8(JButton jb8) {
        this.jb8 = jb8;
    }

    public JButton getJb9() {
        return jb9;
    }

    public void setJb9(JButton jb9) {
        this.jb9 = jb9;
    }

    public JButton getJbplus() {
        return jbplus;
    }

    public void setJbplus(JButton jbplus) {
        this.jbplus = jbplus;
    }

    public JButton getJbminus() {
        return jbminus;
    }

    public void setJbminus(JButton jbminus) {
        this.jbminus = jbminus;
    }

    public View(JLabel polinom3) throws HeadlessException {
        Polinom3 = polinom3;
    }

    public JLabel getPolinom3() {
        return Polinom3;
    }

    public void setPolinom3(JLabel polinom3) {
        Polinom3 = polinom3;
    }

    public View(JFrame frame, JLabel polinom1, JLabel polinom2, JButton jbMultiply, JButton jb0, JButton jb1, JButton jb2, JButton jb3, JButton jb4, JButton jb5, JButton jb6, JButton jb7, JButton jb8, JButton jb9, JButton jbplus, JButton jbminus) throws HeadlessException {
        this.frame = frame;
        Polinom1 = polinom1;
        Polinom2 = polinom2;
         this.jbMultiply= jbMultiply;
        this.jb0 = jb0;
        this.jb1 = jb1;
        this.jb2 = jb2;
        this.jb3 = jb3;
        this.jb4 = jb4;
        this.jb5 = jb5;
        this.jb6 = jb6;
        this.jb7 = jb7;
        this.jb8 = jb8;
        this.jb9 = jb9;
        this.jbplus = jbplus;
        this.jbminus = jbminus;
    }
}

