package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringBasics {

    public static void main(String[] args) {

        String s="ab@cd";

        System.out.println(s.charAt(0));

        System.out.println(s.indexOf('d'));

        System.out.println(s.substring(1));
        System.out.println(s.substring(1,2));

        System.out.println(s);

        String[] sArray=s.split("@");

        System.out.println(Arrays.toString(sArray));

        System.out.println(s.replace('@','&'));

        s=s.replaceAll("[^a-z]","");
        System.out.println(s);

        s=s.concat("ef");
        System.out.println(s);
        s=s.concat("g");
        System.out.println(s);

        String word="3s5h10d1k";


        String charString=word.replaceAll("[0-9]","");

        System.out.println(charString);

        String[] numArray=word.split("[a-z]");

        System.out.println(Arrays.toString(numArray));

        char[] charArray=charString.toCharArray();

        System.out.println(Arrays.toString(charArray));


                int[] numbers = {3, 5, 10, 1};
                char[] characters = {'s', 'h', 'd', 'k'};

                // Iterate through the arrays simultaneously
                for (int i = 0; i < numbers.length; i++) {

                    int count=numbers[i];

                    char c=characters[i];

                    for(int j=0;j<count;j++)
                    {
                        System.out.println(c);

                    }
                }
            }
        }



