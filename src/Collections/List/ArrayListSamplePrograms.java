package Collections.List;

import java.util.*;

public class ArrayListSamplePrograms {

    public static void main(String[] args)

    {

        //Sorting
        List obj = new ArrayList();

        obj.add(10);
        obj.add(60);
        obj.add(30);
        obj.add(20);

        SortedSet setobj = new TreeSet(obj);

        System.out.println(setobj);

        Collections.sort(obj);
        System.out.println(obj);

        // copy from one array list to another
        //whatever we need to copy we need to put that in bracket also we can use collections.copy
        List mobj = new ArrayList();

        mobj.add(100);
        mobj.add(600);
        List copyobj = new ArrayList();
        copyobj.addAll(mobj);
        System.out.println(copyobj);

        // How to shuffle elements in the array list

        List shuffleObj = new ArrayList();

        shuffleObj.add("test");
        shuffleObj.add("sample");
        shuffleObj.add("hi");

        Collections.shuffle(shuffleObj);

//        int arrayListSize =shuffleObj.size();
//        int i=0;
//        while (arrayListSize>=i)
//        {
//            shuffleObj.set(i,shuffleObj.get(arrayListSize-1));
//            arrayListSize--;
//            i++;
//        }

        System.out.println("After shuffling"+shuffleObj);


        // Reverese elements in arraylist

        List reverseObj = new ArrayList();

        reverseObj.add("abc");
        reverseObj.add("def");
        reverseObj.add("123");


        Collections.reverse(reverseObj);

        System.out.println(reverseObj);

        // Reverse elements in arraylist without inbuilt reverse method

        List numObj = new ArrayList();

        numObj.add(12);
        numObj.add(34);
        numObj.add(56);
        List numrevObj = new ArrayList();
        // find the length of the arraylist
        //need to set the first element with the last element

        for(int i=numObj.size()-1;i>=0;i--)
        {
            numrevObj.add(numObj.get(i));
        }


        System.out.println("After reversing" +numrevObj);


        ///  Write a Java program to extract a portion of a array list.

        List porObj = new ArrayList();

        List porObjnew = new ArrayList();

        porObj.add('a');
        porObj.add('b');
        porObj.add('c');
        porObj.add('d');
        porObj.add('e');
        porObj.add('f');

        porObjnew= porObj.subList(0,4);

        System.out.println("SUblist "+porObjnew);

        int mySize=porObj.size();

        for(int i=mySize-1;i>=(mySize/2);i--)
        {
            porObj.remove(i);
        }

//
//        for(int i=0;i<mySize/2;i++)
//        {
//            porObjnew.add(i,porObj.get(i));
//        }
        System.out.println("only portion of arraylist "+porObj);



        //Write java program to compare two arraylists:

        List compareObj1 = new ArrayList();
        List compareObj2 = new ArrayList();

        compareObj1.add("test");
        compareObj1.add("hi");
        compareObj2.add("hi");
        compareObj2.add("test");

        if(compareObj1.equals(compareObj2))
        {
            System.out.println("Two arraylists are equal");
        }

        else
        {
            System.out.println("Two arraylists are not equal");
        }


        List swapObj = new ArrayList();

        swapObj.add("hi");
        swapObj.add("test");
        System.out.println(swapObj);
        Collections.swap(swapObj,0,1);
        System.out.println(swapObj);


        // JOINT TWO ARRAYLISTS


        List joinObj1 = new ArrayList();
        List joinObj2 = new ArrayList();

        joinObj1.add("hi");
        joinObj1.add("test");


        joinObj2.add("sample");
        joinObj2.add("dude");

        joinObj1.addAll(joinObj2);


        System.out.println("After joining"+joinObj1);

        // Clone arraylist

        ArrayList cloneObj1 = new ArrayList();
        List cloneObj2 = new ArrayList();



        cloneObj1.add("hi");
        cloneObj1.add("test");

        cloneObj2= (ArrayList)cloneObj1.clone();

        System.out.println(cloneObj2);

        // EMPTY ARRAYLIST

        List emptObj = new ArrayList();

        emptObj.add("test1");
        emptObj.add("test2");
        emptObj.add("test3");


        emptObj.removeAll(emptObj);

        //emptObj.clear();

        System.out.println("After clearing "+emptObj);


        // Ensure capacity

        ArrayList obj4 = new ArrayList(3);
        obj4.add("test1");
        obj4.add("test2");
        obj4.add("test3");

        obj4.ensureCapacity(4);
        obj4.add("test4");

        System.out.println("ensureCapacity  "+obj4);

        ArrayList indexObj = new ArrayList();
        indexObj.add("test");
        indexObj.add("hi");
        int i=0;
        for (Object s :indexObj)
        {
            System.out.print(""+i+" :");
            System.out.println(s);
            i++;
        }


        // Remove duplicates in arraylist

        ArrayList dupObj = new ArrayList();

        dupObj.add(1);
        dupObj.add(1);
        dupObj.add(2);
        dupObj.add(3);

            //Linked hash set because it maintains order
        LinkedHashSet setObj = new LinkedHashSet(dupObj);

        dupObj.clear();
        dupObj.addAll(setObj);

        System.out.println("After removing duplicates "+dupObj);


        // Reverse elements in array list

        ArrayList dupObj2 = new ArrayList();

        dupObj2.add(1);
        dupObj2.add(5);
        dupObj2.add(3);
        //Collections.reverse(dupObj2);
        System.out.println(dupObj2);


        LinkedList testObj = new LinkedList(dupObj2);
        dupObj2.clear();
        Iterator it =testObj.descendingIterator();

        while (it.hasNext())
        {
            dupObj2.add(it.next());
        }

        System.out.println("descending "+dupObj2);


        TreeSet treeObj = new TreeSet(dupObj2);

        System.out.println("Tree descedning"+treeObj.descendingSet());

        ArrayList stringList = new ArrayList();

        stringList.add("hi");
        stringList.add("bye");
        stringList.add("hello");

        System.out.println("string list "+stringList);
        LinkedList lllooj = new LinkedList(stringList);
        Iterator its =lllooj.descendingIterator();

        stringList.clear();
        while (its.hasNext())
        {
            stringList.add(its.next());
        }

        System.out.println("After descending iterator "+stringList);

        /**********************
         *
         * Add two list
         */


        ArrayList objList1 = new ArrayList();
        ArrayList objList2 = new ArrayList();

        objList1.add(1);
        objList1.add(3);
        objList1.add(5);

        objList2.add("100");

        objList2.addAll(objList1);
        System.out.println("objlist 2 "+objList2);

        // find the duplicate
    }

}
