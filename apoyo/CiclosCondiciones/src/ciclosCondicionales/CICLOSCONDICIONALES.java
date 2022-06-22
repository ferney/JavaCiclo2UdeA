/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosCondicionales;

/**
 *
 * @author kevinf
 */
public class CICLOSCONDICIONALES {
    public static void main(String[] args){
        bf: for(int i=1;i<6;i++){
            for ( int j=1; j<6; j++ ) {
                if ( j>i ) {
                    System.out.println(" ");
                    continue bf;
                }
                System.out.print( " " + (i*j)+" " );
            }
        }
    }

}

