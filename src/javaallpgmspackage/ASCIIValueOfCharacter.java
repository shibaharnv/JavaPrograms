package javaallpgmspackage;

public class ASCIIValueOfCharacter {

    public static void main(String[] args) {

        //{Two Ways of find ascii value one assign to integer and print integer
        // 2) cast the character to integer and print integer   }

        char c= 'a';

        int ascii =c;

        int asciinumber= (int)c;

        System.out.println("ascii number "+ascii);

        System.out.println("ascii number "+asciinumber);
    }
}
