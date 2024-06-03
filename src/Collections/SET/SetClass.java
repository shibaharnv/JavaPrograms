package Collections.SET;

import com.sun.source.tree.Tree;

import java.util.*;


public class SetClass {

    //{No duplicates No order .
    // In set different data types can be added as an object
    // We need to use Wrapper class so that
    // Array can be added directly to a set using Arrays.aslist(arrayname) while object creation
    //Int array can be converted into integer array and that can be added as a list while declaring set eg :Set setobj = new HashSet(Arrays.asList(integerarray));
    // Converting int array to wrapper class Integer array for that use Arrays.setall method

    // No datatype for set
    // Set can be added to an another Set using add all method
    // Set objects can be printed directly or we can convert that to to string and print
    // equals,contains,containsall,clear method
    // no replace method in set
    // only one null can be added in the set
    // hashcode is the object's hash code (number) which is object memory address in hexa decimal  allows objects to be stored/retrieved quickly in a Hashtable.
    //  Iterator is a interface it contains method like has next, next and remove method .. it is different from for each and for loop because we have an option to remove the elements
    //  In iterator the cursor will be present before the object at the begining and when we do next the cursor will point to the first element
    //  In iterator inorder to remove the elements first we need to do next
    //  List iterator is similar to iterator but it contains hasprevious and previous methods along with has next and next methods
    //  Retainall method - Retain first object    txtobj.retainAll(newobj); inthis case reatian txtobj
    //  add all union,retainall -intersection, remove all -difference
    //
    //  Important point to remember if you try to add duplicate to a set then it returns false
    //  If we try to remove a element that is not present inside the set then it throws false.
    //  To array conversion    Integer[] integerArray1=intSet.toArray(new Integer[intSet.size()]);
    //  In Iterator we have equal,next ,hasnext,remove
    //  //All three implementations HashSet, LinkedHashSet and TreeSet are not synchronized. So if you use them in concurrent context (multi-threads), you have to synchronize them externally using Collections.synchronizedSet() static method. For example:
    //1
    //Set<Integer> numbers = Collections.synchronizedSet(new HashSet<Integer>());}

    public static void main(String[] args)
    {


        Set testobj2 = new HashSet();



        testobj2.add(null);
        testobj2.add(2);
        testobj2.add("word");
        System.out.println(testobj2);

        Set<Integer> intSet= new HashSet<>();

        intSet.add(5);
        intSet.add(10);
        intSet.add(15);
        intSet.add(25);
        System.out.println("inset "+intSet);


        Set<Integer> intSet2= new LinkedHashSet<>();

        intSet2.add(5);
        intSet2.add(10);
        intSet2.add(15);

        intSet.removeAll(intSet2);

        System.out.println("After removing "+intSet);
       // intSet2.add(25);
        System.out.println("intSet2 "+intSet2);

        System.out.println("CONTAINS ALL CHECK "+intSet.containsAll(intSet2));

        System.out.println("RETAINALL CHECK "+intSet.retainAll(intSet2));
        System.out.println("After retaining "+intSet);



       Set<Integer> set = Collections.synchronizedSet(new HashSet<>());

        Iterator itr3=intSet2.iterator();

        while (itr3.hasNext())
        {
            System.out.println("my itr"+itr3.next() );

        }




        System.out.println("EUQLS CHECK "+intSet2.equals(intSet));

        Integer[] integerArray1=intSet.toArray(new Integer[intSet.size()]);

        System.out.println("integerArray "+Arrays.toString(integerArray1));

        testobj2.remove(2);

        if(!testobj2.remove(2))
        {
            System.out.println("element not present to remove");
        }

        System.out.println("After removeing"+testobj2);


     ArrayList testobj = new ArrayList();
     testobj.add("rsrs");
     testobj.add("dsfsdf");
     ListIterator lobj =testobj.listIterator();

     while (lobj.hasNext())
     {
         lobj.hasPrevious();
         lobj.next();

         if(testobj.equals("rsrs"))
         lobj.set("bjp");
     }

        Set myobj = new HashSet();

        myobj.add(10);
        myobj.add("abc");
        myobj.add('c');
        myobj.add(1.5);


        System.out.println("myobj "+myobj.toString());

        Set myobj2 = new HashSet();

        myobj2.add("test");
        myobj2.add(1234);

        myobj2.addAll(myobj);
        System.out.println("myobj2"+myobj2);

        if(myobj.equals(myobj2))
        {
            System.out.println("Sets are equal");
        }
        else {
            System.out.println("Sets are NOT equal");
        }

        if(myobj.contains("ab"))
        {
            System.out.println("Sets contians element");
        }
        else
        {
            System.out.println("Sets NOT contians element");
        }


        Set myobj3 = new HashSet();
        Set myobj4 = new HashSet();

        myobj3.add(10);
        myobj3.add(20);

        myobj4.addAll(myobj3);

        if(myobj3.containsAll(myobj4))
        {
            System.out.println("Contians all Matching");
        }

        else
        {
            System.out.println("Contians all NOT Matching");
        }

        myobj.clear();
        System.out.println("after clearing the set is"+myobj);

        if(myobj.isEmpty())
        {
            System.out.println("is empty true");
        }

        else
        {
            System.out.println("is empty false");
        }


        System.out.println("hashcode "+myobj2.hashCode());

         Iterator iobj=myobj3.iterator();

         while(iobj.hasNext())
         {
                iobj.next();
                iobj.remove();
         }




        System.out.println("myobj3 iterator removal "+myobj3);




            int[] intarray={1,2,3,4,4};

            Integer[] integerarray= new Integer[intarray.length];

            Arrays.setAll(integerarray,i->intarray[i]);

            for(Integer result:integerarray)
            {
                System.out.println("result "+result);
            }

            Set setobj = new HashSet(Arrays.asList(integerarray));
        System.out.println("set after removing duplicate "+setobj.toString());




        char[] chararray = {'a','b','b'};

        Character[] characterarray= new Character[chararray.length];

        Arrays.setAll(characterarray,i->chararray[i]);

        for(Character charvalue :characterarray)
        {
            System.out.println("charvalue " +charvalue);
        }

        Set charsetobj = new HashSet(Arrays.asList(characterarray));

        System.out.println("charsetobj "+charsetobj.toString());

        String[] stringarray= {"ab","cd","Cd"};

        Set stringsetobj = new HashSet(Arrays.asList(stringarray));

        System.out.println("stringsetobj "+stringsetobj.toString());



        Set sobj1 = new HashSet();
        Set sobj2 = new HashSet();


        Set sobj3 = new HashSet(Arrays.asList(intarray));


        System.out.println("sobj 3 "+sobj3.toString());


        sobj1.add(10);
        sobj1.add(20);
        sobj1.add(30);
        sobj1.add(10);


        sobj2.addAll(sobj1);



        System.out.println("sobj1 "+sobj1.toString());
        System.out.println("Array print "+Arrays.toString(intarray));
        //System.out.println(Arrays.toString(sobj3.toString());

        for (Object s : sobj3) {
            System.out.println(s.toString());
        }



       Set newobj = new HashSet();

        Set txtobj = new HashSet();

        newobj.add("a");
        newobj.add("b");
        newobj.add("c");


        txtobj.add("a");
        txtobj.add("b");
        txtobj.add("e");

        txtobj.retainAll(newobj);

        for(Object a:txtobj)
        {
            System.out.println("retain all "+a);
        }



      Spliterator spobj=  newobj.spliterator();
        Spliterator secondpobj = spobj.trySplit();

     spobj.forEachRemaining(System.out::println);

        secondpobj.forEachRemaining(System.out::println);

        Integer[] a ={1,2,3,4};

        List<Integer> listobj = new ArrayList<Integer>();


        listobj= Arrays.asList(a);

        System.out.println("listobj "+listobj);


        int[] myArray ={1,2,3,3,5};

        Integer[] myIntegerArray = new Integer[myArray.length];

        Arrays.setAll(myIntegerArray,i->myArray[i]);

        Set obj = new HashSet(Arrays.asList(myIntegerArray));


        System.out.println("TESTING************************");
        for(Object i :obj)
        {
            int value = (int) i;
            System.out.println(i);
        }



        // remove odd elements from Set

        int[] zint={1,2,3,4,5};
        Integer[] zIntegerArray= new Integer[zint.length];

        Arrays.setAll(zIntegerArray,i->zint[i]);

        System.out.println(Arrays.toString(zIntegerArray));

        Set setObj = new HashSet(Arrays.asList(zIntegerArray));


        System.out.println(setObj);

        Iterator itr=setObj.iterator();

//        while (itr.hasNext())
//        {
//            itr.next();
//            itr.remove();
//            if(itr.hasNext()) {
//                System.out.println(itr.next());
//            }
//
//        }

        while (itr.hasNext())
        {
            //itr.next();
            System.out.println(itr.next());

                        if(itr.hasNext()) {
                            itr.next();
                            itr.remove();

            }


        }



        int[] numArray= {1,2,3,4,5,6};

        Integer[] integerArray= new Integer[numArray.length];

        Arrays.setAll(integerArray,i->numArray[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        System.out.println(al);


        HashSet hs = new HashSet();
        hs.add("test");
        hs.add(1);

        System.out.println(hs);

        ArrayList als= new ArrayList();

        als.add("tesitng");
        als.add("tesitng2");

        hs.addAll(als);

        System.out.println(hs);

        hs.removeAll(als);

        System.out.println(hs);

    }
}
