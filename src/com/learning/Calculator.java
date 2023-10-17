package com.learning;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 12;
        int c = add(x,y);
        int result = z++;
        double a = 2.02;
        double b = 3.04;
        double n = 3.03;
        System.out.println(c);
        System.out.println(sub(10,5));
        System.out.println(mul(a,b));
        System.out.println(mod(mul(a,b) , c));
        System.out.println(div(sub(x,y),add(x,y)));
        System.out.println(incrementby(a));
        System.out.println(incrementby(result));
        System.out.println(incrementby(z));
    }

        /**
         * @param a addition program a+b
         * @param b
         * @return
         */
        public static int add ( int a, int b){
            return a + b;
        }

    /**
     * @param a Subtraction program a-b
     * @param b
     * @return
     */
        public static int sub (int a, int b){
            return a-b;
        }

    /**
     * @param a Multiplication program with double value
     * @param b
     * @return
     */
        public static double mul (double a, double b){
            return a*b;
        }
        public static double mod (double a, double b){
            return a%b;
        }
        public static int div (int a , int b){
            return a/b;
        }
        public static double incrementby (double a){
            return ++a;
        }
        public static int incrementby (int i){
            return i++;
      }



      Map<String,String> m = new HashMap<>();

    }
