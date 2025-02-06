package com.gunesakkaya._1_part_javatypes;

public class _04_operators {
    public static void main(String[] args) {
        //operator
        // +
        // -
        // *
        // /
        // %
        // ++
        // --
        int number1=23, number2=7;
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = (number1 * number2);
        int division = (number1 / number2);
        int modulus = number1 % number2;

        System.out.println("toplam: " + addition);
        System.out.println("çıkarma:" + subtraction);
        System.out.println("çarpma:" + multiplication);
        System.out.println("bölme:" + division);
        System.out.println("Kalan:" + modulus);

            // Mantıksal Operators: && = VE || = veya !=değil
            // ++ 1 arttır, -- 1 azaltır
    }
}
