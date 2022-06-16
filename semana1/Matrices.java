package com.mycompany.matrices;

public class Matrices {

    public static void main(String[] args) {
       //declarar matriz
       int mat[][]= new int[2][2];
        int numero=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               numero=(int)(Math.random()*1000);
               mat[i][j]=numero;
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
