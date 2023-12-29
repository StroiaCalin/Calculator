package org.example;

import java.util.HashMap;
import java.util.Map;

public class Operatii {
    public static HashMap<Integer, Integer> adunare(HashMap<Integer, Integer> poly1, HashMap<Integer, Integer> poly2) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : poly1.entrySet()) {
            int grad = entry.getKey();
            int coeficient = entry.getValue();
            result.put(grad, coeficient);
        }
        for (Map.Entry<Integer, Integer> entry : poly2.entrySet()) {
            int grad = entry.getKey();
            int coeficient = entry.getValue();
            result.put(grad, coeficient + result.getOrDefault(grad, 0));
        }
        return result;
    }

    public static HashMap<Integer, Integer> scadere(HashMap<Integer, Integer> poly1, HashMap<Integer, Integer> poly2) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : poly1.entrySet()) {
            int degree = entry.getKey();
            int coefficient = entry.getValue();
            result.put(degree, coefficient );
        }
        for (Map.Entry<Integer, Integer> entry : poly2.entrySet()) {
            int degree = entry.getKey();
            int coefficient = entry.getValue();
            result.put(degree, result.getOrDefault(degree, 0)-coefficient);
        }
        return result;
    }
    public static HashMap<Integer, Integer> multiply(HashMap<Integer, Integer> poly1, HashMap<Integer, Integer> poly2) {
        HashMap<Integer, Integer> result = new HashMap<Integer,Integer>();
        for (Map.Entry<Integer, Integer> entry1 : poly1.entrySet()) {
            int grad1 = entry1.getKey();
            int coeficient1 = entry1.getValue();
            for (Map.Entry<Integer, Integer> entry2 : poly2.entrySet()) {
                int grad2 = entry2.getKey();
                int coeficient2 = entry2.getValue();
                int grad = grad1 + grad2;
                int coeficient = coeficient1 * coeficient2;
                result.put(grad, coeficient  );
            }
        }
        return result;
    }
    public static HashMap<Integer, Integer> derivative(HashMap<Integer, Integer> poly) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : poly.entrySet()) {
            int grad = entry.getKey();
            int coeficient = entry.getValue();
            if (grad > 0) {
                result.put(grad - 1, coeficient * grad);
            }
        }
        return result;
    }
    public static HashMap<Integer, Fraction> integrate(HashMap<Integer, Integer> poly) {
        HashMap<Integer, Fraction> result = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : poly.entrySet()) {
            int grad = entry.getKey();
            Fraction coef=new Fraction(entry.getValue(),grad+1);
            result.put(grad + 1, coef);
        }
        return result;
    }

}
