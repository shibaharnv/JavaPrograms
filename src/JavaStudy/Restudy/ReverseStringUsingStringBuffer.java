package JavaStudy.Restudy;

import java.util.Arrays;

public class ReverseStringUsingStringBuffer {

    public static void main(String[] args) {

        String myText= "This is word";

        //o/p - "word is This"

        //{input is string with space and that can be converted to array using split
        // 0-This,1-is ,2-word --- > 0-word,1-is 2-This
        // 0-->2
        // 1-->1
        // 2-->0}

        String[] stringArray =myText.split(" ");

        String[] resultArray= new String[stringArray.length];

        System.out.println(Arrays.toString(stringArray));
        int count=0;
        for(int i=stringArray.length-1;i>=0;i--)
        {
            resultArray[count]=stringArray[i];
            count++;
        }

        System.out.println(Arrays.toString(resultArray));

        for(String s:resultArray)

        {
            System.out.println(s);
        }
    }


}
