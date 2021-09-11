/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three.numbers;
import java.util.Scanner;
/**
 *
 * @author estel
 */
public class ThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трезхначное число: ");
        int number = scanner.nextInt();
        while (number>999 || number<100){
            System.out.println("Неверное число");
            System.out.print("Введите трезхначное число: ");
            number = scanner.nextInt();
        }
        int hundreds = (int) Math.floor(number/100);
        int tens = (int) Math.floor((number - hundreds*100)/10);
        int units = number - hundreds*100 - tens*10;
        System.out.println("В числе "+number+" "+hundreds+" сотен, "+tens+" десятков, "+units+" единиц");
        }
    }


    

