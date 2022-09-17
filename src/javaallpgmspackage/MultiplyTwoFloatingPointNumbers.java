package javaallpgmspackage;

public class MultiplyTwoFloatingPointNumbers {


    public static void main(String[] args) {
        //{MultiplyTwoFloatingPointNumbers
        // float is represented in 32 bits, with 1 sign bit, 8 bits of exponent, and 23 bits of the significand (or what follows from a scientific-notation number: 2.33728*1012; 33728 is the significand).
        //
        //double is represented in 64 bits, with 1 sign bit, 11 bits of exponent, and 52 bits of significand.
        // You should use double instead of float for precise calculations, and float instead of double when using less accurate calculations. Float contains only decimal numbers, but double contains an IEEE754 double-precision floating point number, making it easier to contain and computate numbers more accurately.}

        float a = 1.5f;
        float b = 1.5f;

        float sum = a*b;

        System.out.println("Floating Sum "+sum);

    }
}
