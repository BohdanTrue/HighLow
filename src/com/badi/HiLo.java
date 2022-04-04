package com.badi;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = 0, count = 0;
        int number = (int)(Math.random() * 100 + 1);
        System.out.println("Добро пожаловать в ЧИСЛОВУЮ УГАДАЙКУ!");
        while (guess != number){
            count++;
            System.out.println("Введите число от 1 до 100:");
            guess = sc.nextInt();
            if (guess < number)
                System.out.println("Число " + guess + " меньше заданого числа, попробуй ещё раз!");
            else if (guess > number)
                System.out.println("Число " + guess + " больше заданого числа, попробуй ещё раз!");
            else
                System.out.println("Поздравляю!!! Вы угадали загаданое число!");
        }
        System.out.println("Число попыток: " + count);
    }
}
