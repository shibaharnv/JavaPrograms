package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayNeonCompanySum {

    //{4,2,3,2}
    //{Get which two numbers sum up to the given number
    // given number is first number
    // check if a[i]+a[i+1]=givennumber
    // a[i]+a[i+2]=given number
    // a[]
    // set start=a[1]
    // final condition start<=length of th array}

    public static void main(String[] args) {


        int[] a={4,2,3,2,1};

        System.out.println(Arrays.toString(a));

        int start=1;
        int givenNumber=a[0];

        List<Integer> list= new ArrayList<>();

        List<List<Integer>> lists = new ArrayList<>();

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();


            for(int i=1;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]+a[j]==givenNumber)
                    {
                        list.add(a[i]);
                        list.add(a[j]);
                        //sb1.delete(0,2);
                       // sb1.append(a[i]);
                       // sb1.append(",");
                       // sb1.append(a[j]);



                    }


                }
               // sb2.append(sb1);
                //sb2.append(" ");


                lists.add(list);
        }

        System.out.println(sb2);
        System.out.println("lists" +lists);

        StringBuffer sb3 = new StringBuffer();
        System.out.println(list);


        for(int i=0;i<list.size();i++)
        {
            sb3.append(list.get(i));
            if(i!=list.size()-1)
            {
                sb3.append(",");
            }

        }

//        for(int j=2;j<sb3.length();j=+2)
//        {
//            sb3.insert(j," ");
//        }

        System.out.println(sb3);


                for(int j=2;j<sb3.length();j=+2)
        {

        }

        // i/p  [2, 2, 3, 1]  o/p 2,2 3,1

        //using for loop convert array to strng
        //2231
        //first place comma,second place space again comma again space
        int[] b={2,2,3,1};

                String result="";

                for(Object c:b)
                {
                    String d=c.toString();
                    result=result+d;
                }

        System.out.println(result);

    }
}
