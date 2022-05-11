/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinche_programa_mamalonxd;

import java.util.Scanner;

/**
 *
 * @author nari_
 */
public class Pinche_programa_mamalonxd {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, g, l = 0;
        System.out.println("Ingresar el tamaño del alfabeto");
        n = sc.nextInt();
        int[] alf = new int[n];
        System.out.println("Ingresa los valores del alfabeto");
        for (int i = 0; i < n; i++) {
            alf[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("["+alf[i]+"]\n");
        }
        while(l != 1) {
            System.out.println("Ingresa el numero que buscas del alfabeto");
            g = sc.nextInt();
            boolean existe = false;
            for (int i = 0; i < n; i++) {
                if (g == alf[i]) {
                    existe = true;
                    break;
                } 
            }
            if (existe == true) {
                System.out.println("El numero que usted busco, si existe");
            } else {
                System.out.println("El numero que usted busco, no existe");
            }
            System.out.println("¿Queres buscar otro numero?");
            System.out.println("Si: 0");
            System.out.println("No: 1");
            l = sc.nextInt();
        }
    }
    
}
