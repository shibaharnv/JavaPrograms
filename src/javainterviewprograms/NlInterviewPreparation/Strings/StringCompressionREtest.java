package javainterviewprograms.NlInterviewPreparation.Strings;

public class StringCompressionREtest {


    public static void main(String[] args) {

        //{input : abb -Ouput: a1b2
        // take two pointers
        // i,i+1 if they are not equal get the string and append count}

        String word="abbc";
        //{abb=a1b2
        // if there is different charater adjacent characters not equal means  get the first chracter and append count
        // if the adjacent character is equal increase the count}

        StringBuffer sb = new StringBuffer();
        int count=1;

        for (int i=1;i<word.length();i++)
        {
//abcount=1;

            //ab
            if(word.charAt(i-1)==word.charAt(i))
            {//ab-->a;
               count++;//2
            }
            else
            {
                //{ab--->a1}
                sb.append(word.charAt(i-1));//
                sb.append(count);//1
                count=1;
                //a1
            }



        }

        //last character
        sb.append(word.charAt(word.length()-1));
        sb.append(count);

        System.out.println(sb);
    }




}
