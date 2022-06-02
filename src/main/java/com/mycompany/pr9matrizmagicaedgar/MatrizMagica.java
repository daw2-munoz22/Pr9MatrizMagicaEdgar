/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr9matrizmagicaedgar;

/**
 *
 * @author Jupiter
 */
class MatrizMagica {
    private int[][] cuadromagico = new int[3][3];
    MatrizMagica(int[][] matriz) {
        cuadromagico = matriz;
    }
    public boolean Horizontal(){
        int columnas[] = new int[cuadromagico.length];
        int filas = 0;
        int comprobacion = 0;
        boolean validar = true;
        for(int i =0 ; i < cuadromagico.length; i++){
            for (int x = 0; x < cuadromagico[0].length; x++){               
                System.out.println(cuadromagico[i][x]+ " ");    
                filas = filas + cuadromagico[i][x];  
                columnas[x] = cuadromagico[i][x];  
            }
            System.out.println(" SumaFilas = "+filas);
            comprobacion = filas;    
            System.out.println(" Comprobar = "+comprobacion);
            System.out.println("");
        
            System.out.println("SumaFilas es " + filas + " Comprobar es " + comprobacion);
            if (filas != comprobacion){
                validar = false;
            }
            filas = 0;   
        }
        return validar;
    }
    public boolean Vertical(){
        int columnas[] = new int[cuadromagico.length];
        int filas = 0;
        int comprobacion = 0;
        boolean validar = true;
        for(int i =0 ; i < cuadromagico.length; i++){
            for (int x = 0; x < cuadromagico[0].length; x++){               
                System.out.println(cuadromagico[i][x]+ " ");    
                filas = filas + cuadromagico[i][x];  
                columnas[x] = cuadromagico[i][x];  
            }
            System.out.println(" SumaFilas = "+filas);
            comprobacion = filas;    
            System.out.println(" Comprobar = "+comprobacion);
            System.out.println("");
        
            System.out.println("SumaFilas es " + filas + " Comprobar es " + comprobacion);
            if (filas != comprobacion){
                validar = false;
            }
            filas = 0;   
        }
        return validar;
    }
    /*Funcion para mostrar la matriz*/
    public void mostrar() {
        System.out.println(cuadromagico);
    }
}
