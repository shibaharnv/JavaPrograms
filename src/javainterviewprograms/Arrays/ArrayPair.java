package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayPair {

    public static void main(String[] args) {


        //{Using make count the number of Occurances in array
        //set pair count as 0
        // use entry get value from the map if the value is 2 increase pair count
        // if not equeyal to 2 ignore less than 2
        // if greater than 2 divide by two and get the quaoteint}

        int[] a= {1,1,2,2,3,3,3,3,3};



        Integer[] integerArray=new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        int number=5;
        arrayPair(number,al);
    }

    public static void arrayPair(int inputNumber,List<Integer> inputArrayList)
    {
//        System.out.println(inputArrayList);
//        System.out.println(inputNumber);
//
        int pairCount=0;

        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<inputArrayList.size();i++)
        {
            if(!hm.containsKey(inputArrayList.get(i)))
            {
                hm.put(inputArrayList.get(i),1);
            }
            else
            {
                hm.put(inputArrayList.get(i),hm.get(inputArrayList.get(i))+1);
            }
        }

        System.out.println(hm);


      for(Map.Entry entry :hm.entrySet())

      {
          Object objectValue=entry.getValue();
          int intValue=(int)objectValue;
          System.out.println(intValue);

          if(intValue==2)
          {
              pairCount++;

          }
          else if(intValue>2)
          {
              intValue=intValue/2;
              pairCount=pairCount+intValue;
          }
      }

        System.out.println("paircount"+ pairCount);


    }
}
