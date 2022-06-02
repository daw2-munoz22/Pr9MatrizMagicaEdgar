/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr9matrizmagicaedgar;

/**
 *
 * @author Jupiter
 */
public class Pr9MatrizMagicaEdgar {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int [][] matriz = {{2,7,6}, {9,5,1},{4,3,8}};
        MatrizMagica cuadro = new MatrizMagica(matriz);
        /*Comprovación de la matriz magica*/
        if(cuadro.Vertical()){/*Para llamar a la función vertical*/
            System.out.println("Es magica");
        }else{
            System.out.println("No es magica");
        }
        
        if(cuadro.Horizontal()){/*Para llamar a la función Horizontal*/
            System.out.println("Es magica");
        }else{
            System.out.println("No es magica");
        }
    }
}
