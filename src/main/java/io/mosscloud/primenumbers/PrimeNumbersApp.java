package io.mosscloud.primenumbers;

import java.util.Scanner;

public class PrimeNumbersApp {
    public static void main(String[] args) {

        int minNumberOfRange;
        int maxNumberOfRange;

        while (true) {
            System.out.println("Podaj pierwszą liczbe z przedziału liczb większą od 1 ");
            Scanner scanner = new Scanner(System.in);
            minNumberOfRange = scanner.nextInt();
            if (minNumberOfRange <= 1) {
                System.out.println("WIĘKSZĄ od 1");
                minNumberOfRange = scanner.nextInt();
            }
            System.out.println("Podaj ostatnią liczbę z przedziału liczb");
            maxNumberOfRange = scanner.nextInt();

            if (minNumberOfRange <= 1 || maxNumberOfRange <= 1){
                System.out.println("Wrong range of numbers, try again");


            }else break;

            }

        for (int i = minNumberOfRange; i <= maxNumberOfRange; i++) {
            boolean iIsPrimeNumber = true;
            int minDividingsNumber = 2;
            int maxDividingsNumber = i - 1;
            for (int j = minDividingsNumber; j <= maxDividingsNumber; j++) {
                if (i % j == 0) {
                    iIsPrimeNumber = false;
                    break;
                }


            }
            if (iIsPrimeNumber) {
                System.out.println(i);
            }
        }


        }
    }

//TODO
//Usecase
//1. System prosi o podanie przedziału liczb z jakich ma podać liczby pierwsze
//2. Użytkownik podaje liczby pierwsze
//3. System wypisuje liczby pierwsze
//2a uzytkownik podał ujemny przedział (jak to obsluzyc) next punkt 3a
//3a System informuje o ujemnym przedziale i prosi o podanie poprawnego (wracamy do kroku 1)