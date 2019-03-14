/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.javaTasks.Bogdan;

import java.util.Random;

public class Search {
    public static final int lines = 5;
    public static final int columns = 5;
    public static final int maxrand = 2;
    
    private static void printvector(int[][] vector, int size1, int size2) {
        for (int i = 0; i < size1; i++) {
            for (int k = 0; k < size2; k++) {
                System.out.print(vector[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void printserie(int[] serie, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(serie[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] minserie(int[][] vector, int size1, int size2) {
        linesbuble(vector, size1, size2);
        int min = getserie(vector[0], size2);
        int id = 0;
        for (int i = 0; i < size1; i++) {
            if (getserie(vector[i], size2) < min) {
                min = getserie(vector[i], size2);
                id = i;
            }
        }
        return vector[id];
    }
    
    private static int getserie(int[] serie, int size) {
        int buf = 1;
        int maxbuf = 0;
        for (int i = 0; i < size - 1; i++) {
            if (serie[i] == serie[i + 1])
                buf++;
            else 
                buf = 1;
            if (maxbuf < buf)
                maxbuf = buf;
        }
        return maxbuf;
    }
    
    private static void linesbuble(int[][] vector, int size1, int size2) {
        boolean sorted;
        int buf;
        for (int i = 0; i < size1; i++) {
            while (true) {
                sorted = false;
                for (int k = 0; k < size2 - 1; k++) {
                    if (vector[i][k] < vector[i][k + 1]) {
                        buf = vector[i][k];
                        vector[i][k] = vector[i][k + 1];
                        vector[i][k + 1] = buf;
                        sorted = true;
                    }
                }
                if (!sorted)
                    break;
            }
        }
    }
            
    public static void initvector(int[][] vector, int size1, int size2, int maxrand) {
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            for (int k = 0; k < size2; k++) {
                vector[i][k] = rand.nextInt(maxrand);
            }
        }
    }
}
