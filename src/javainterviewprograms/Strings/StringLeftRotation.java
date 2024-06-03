package javainterviewprograms.Strings;

public class StringLeftRotation {

    //[10,20,30]   -->  [20,30,10]
    //{left rotation
    // input abc -->   1st -->[a,b,a]--store last value
    //         2nd[b,b,a]
    //         a[1]}

    //{[a,r,u,n]  []
    // //Postion-1 <0 store the elemetn
    // 0th pos--->3 arraysize-1
    // 1st post-->0
    // 2nd po->1
    // 3rd ps-2
    // abc,1-aba,2bba,3bca
    // 0-->2
    // 1-->0
    // 2--1}

    public static void main(String[] args) {

        String word="abc";//bca


        System.out.println(leftStrigRotation(word));

    }

    private static StringBuffer leftStrigRotation(String word) {

        char[] ca=word.toCharArray();

       int size= ca.length;
        System.out.println(size);

       char temp=ca[0];

       for(int i=1;i<size;i++)//1st--->[x,a,c] 2nd[]
       {
           // 0-->2
           // 1-->0
           // 2--1}

           ca[i-1]=ca[i];
       }

       ca[size-1]=temp;

       StringBuffer sb = new StringBuffer();

       for(char k:ca)
       {
           sb.append(k);
       }

       return sb;

    }
}
