package javainterviewprograms.Strings;

public class StringRightRotationThreePositions {

    public static void main(String[] args) {

        String word="arun";
        //aacd
        //aabd
        //aabc
        //dabc

        //abca
        //bbca
        //bccd
        //bcd



        //{Right rotate three positions
        // a-> dTh postion
        // b->ath postion
        // c->b postion
        // d->c postion
        // a[i]
        // i=3:c[i]=c[0]
        // i=2 c[i]=c[]}

        System.out.println(rightRotateThreePositions(word,2));


    }

    private static StringBuffer rightRotateThreePositions(String word,int count) {

        char[] c=word.toCharArray();

        for(int j=1;j<=count;j++)
        {
            char last=c[c.length-1];

            for(int i=c.length-1;i>0;i--)
            {

                c[i]=c[i-1];

            }

            c[0]=last;
        }



        StringBuffer    sb = new StringBuffer();

        for(char k:c)
        {
            sb.append(k);
        }

        return sb;

    }


}
