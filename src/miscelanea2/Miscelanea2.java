package miscelanea2;

import java.util.Scanner;

public class Miscelanea2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cantidad en metros");
        //se lee el valor ingresado por consola
        Double metros = scanner.nextDouble();
        //se realiza la conversion de metros a pulgadas
        Double pulgadas = 39.37 * metros;
        //se realiza la conversion de metros a pies
        Double pies = 3.28 * metros;
        System.out.println(""+metros+" metros en pulgados son "+pulgadas);
        System.out.println(""+metros+" metros en pies son "+pies);
    }
    
}
