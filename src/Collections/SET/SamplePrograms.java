package Collections.SET;

import java.util.*;

public class SamplePrograms {


    public static void main(String[] args)
    {

        HashSet<String> obj = new HashSet<String>();

        obj.add("10");
        obj.add("20");
        obj.add("30");
        obj.add("40");

        System.out.println(obj);

        //Itertaion

        Iterator testit=obj.iterator();

        while (testit.hasNext())
        {
            Object testObj= testit.next();
            //String value=String.valueOf(testObj);
            System.out.println(testObj);
        }

        //find number of elements in hashset
        int elements=  obj.size();

        System.out.println(elements);

        //empty hashset

        obj.clear();
        System.out.println(obj);

        HashSet<String> obj2 = new HashSet<String>();

        obj2.add("10");
        obj2.add("20");
        obj2.add("30");
        obj2.add("40");
        HashSet<String> obj3 = new HashSet<String>();

        obj3=(HashSet)obj2.clone();

        System.out.println(obj3);

    // Array to set
        int[] arr = {1,2,3,4,5};
        Integer[] integerArr= new Integer[arr.length];
        Arrays.setAll(integerArr,i->arr[i]);

        HashSet testObj= new HashSet(Arrays.asList(integerArr));

        System.out.println(testObj);

        // Set to array- Direct method is also available
        String[] stringArray = new String[obj2.size()];
        int setLength= obj2.size();

        Iterator it =obj2.iterator();
        int i=0;
        while (it.hasNext())
        {
           Object itObj= it.next();
            stringArray[i]=itObj.toString();
            i++;
        }

        System.out.println(Arrays.asList(stringArray));

        obj2.toArray(stringArray);

        System.out.println(Arrays.asList(stringArray));


        HashSet hashabc = new HashSet();
        hashabc.add(65);
        hashabc.add(165);
        hashabc.add(25);
        hashabc.add(85);

        TreeSet treeObj= new TreeSet(hashabc);

        System.out.println(treeObj);


        List myList = new ArrayList(hashabc);

//        Iterator ittest=hashabc.iterator();
//
//        while (ittest.hasNext())
//        {
//            Object abcObj=ittest.next();
//            myList.add(abcObj.toString());
//        }
        System.out.println("Array list "+myList);



        // COMPARE TWO HASHSETS

        HashSet<Integer> hashabcd = new HashSet<Integer>();
        hashabcd.add(65);
        hashabcd.add(165);
        hashabcd.add(44);
        hashabcd.add(77);

        HashSet<Integer> hashxyz = new HashSet<Integer>();
        hashxyz.add(165);
        hashxyz.add(65);
        hashxyz.add(25);
        hashxyz.add(85);

        System.out.println(hashabc.equals(hashxyz));
        hashabcd.retainAll(hashxyz);
        System.out.println("Retain all"+hashabcd.retainAll(hashxyz));
        System.out.println("Retain all"+hashxyz.retainAll(hashabcd));
        System.out.println("Retain all hashabcd "+hashabcd);
        System.out.println("Retain all hashxyz "+hashxyz);


        for(int x :hashabcd)
        {
            System.out.println(hashxyz.contains(x) ? "yes ":"no");


        }

        for(int j: hashabcd)
        {
           if(!hashxyz.contains(j))
           {
               hashabcd.remove(j);
               //hashxyz.remove(j);
           }
        }

        System.out.println("After removing abcd"+hashabcd);
        System.out.println("After removing xyz"+hashxyz);

    }

}
