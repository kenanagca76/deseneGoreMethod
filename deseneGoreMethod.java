package odevler;

import java.util.Scanner;

public class deseneGoreMethod {
// Kural :
// Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
// Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
// Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

//Senaryolar;
//N Sayısı : 16
//Çıktısı : 16 11 6 1 -4 1 6 11 16

//N Sayısı : 10
//Çıktısı : 10 5 0 5 10

//N Sayısı : 25
//Çıktısı : 25 20 15 10 5 0 5 10 15 20 25

//N Sayısı : 5
//Çıktısı : 5 0 5


    static int desenMethod(int x, int tempX, boolean stop) {
        System.out.print(x + " ");
        if (x < 0 || x == 0 || !stop) {
            stop = false;
            if (x != tempX) {
                return desenMethod(x + 5, tempX, stop);
            } else
                return 0;
        } else {
            return desenMethod(x - 5, tempX, stop);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, tempX;
        System.out.print("Bir Sayı Giriniz: ");
        x = inp.nextInt();
        desenMethod(x, tempX = x, true);
    }

}

