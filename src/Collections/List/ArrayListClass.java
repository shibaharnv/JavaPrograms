package Collections.List;

import java.util.*;

public class ArrayListClass {

    //{default maintains order,element will be added at last
    // element can be added using index
    // if we add element using index elements will be moved to the right
    // Inorder to replace the element we can use set method
    // get an element using get method
    //allows duplicate
    // List Methods : add,add(index,element),
    // In add all method if we leave some index and try to add then we will get index out of bound exception
    // In add all using index elements will be added in the specific postion moving the other elements to the right
    // lastIndexOf It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain
    // this element.(Useful for duplicate elements"
    // To array will return object array and that can be converted to string array using for each method
    // While object creation of set and list both can be added as  a parameter eg given below
    //     List newListObj= new ArrayList(setObj);
    //     Set newSetObj= new TreeSet(listobj);}

    public static void main(String[] args)
    {
        List lobj = new ArrayList();

        lobj.add(10);//0
        lobj.add("test");//1
        lobj.add('c');//2
      //  lobj.add(0,20);
       // lobj.add(1,"sample");
        lobj.set(2,'d');



        System.out.println(lobj);
        System.out.println(lobj.get(1));

        //Simple add all method

        List obj1 = new ArrayList();
        obj1.add("hi");
        obj1.add("bye");

        List obj2 = new ArrayList();
        obj2.add("test");
        obj2.add("sample");

        obj1.addAll(obj2);

        System.out.println("add all"+ obj1);


        //Index Addall method

        List obj3 = new ArrayList();
        obj3.add("hi");
        obj3.add("bye");

        List obj4 = new ArrayList();
        obj4.add("test");
        obj4.add("sample");


        obj3.addAll(0,obj4);
        //obj3.addAll(1,obj4);
        //obj3.addAll(2,obj4);
       // obj3.addAll(3,obj4);

        System.out.println("obj 3 add all "+obj3);

        //clear
        obj3.clear();
        System.out.println("clear "+obj3);
        //is empty
        System.out.println("obj3 is empty"+obj3.isEmpty());

        //equals.
        List obj5 = new ArrayList();
        obj5.add("hi");
        obj5.add("bye");

        List obj6 = new ArrayList();
        obj6.add("hi");
        obj6.add("sample");
        obj6.add("sample");
        obj6.add("hi");

        boolean result =obj5.get(0).equals(obj6.get(0));
        System.out.println("result "+result);

        // Last index of "	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element."

       int indexValue= obj6.lastIndexOf("hi");
        System.out.println("last indexValue"+indexValue);


        //Object to array - When we use Toarray method in list it always returns object array

        List myl = new ArrayList();


        myl.add("hi");
        myl.add("bye");

       Object[] sarray= myl.toArray();
        //Arrays.toString(sarray);
        //System.out.println("object to string "+Arrays.toString(sarray));
        String[] myStringarray = new String[sarray.length];
        int count =0;

        for(Object a:sarray)
        {
            String objectString=a.toString();
            myStringarray[count]=objectString;
            System.out.println(objectString);
            count++;
        }

        for(String s:myStringarray)
        {
            System.out.println("string array for each"+s);
        }



        List my2l = new ArrayList();
        my2l.add(10);
        my2l.add(20);
        my2l.add(30);

       // my2l.remove(1);

        List test = new ArrayList();
        test.add(25);
        test.add(20);
        test.add(30);


//        System.out.println("Remove all "+my2l.removeAll(test));
//        System.out.println("Remove all "+my2l);

        System.out.println(my2l.retainAll(test));

        System.out.println(my2l);

       // System.out.println("After removing "+my2l);

        String word = "abcd";

        word=word.replace("abcd","z");

        System.out.println("After replacing "+word);

        String testword ="123 abcd 534534 xyz";




        // Remove numbers from the string use replace all

        testword = testword.replaceAll("[0-9]","");

        testword = testword.replaceAll(" ","");

        System.out.println("after replace all numbers"+testword);





        // Remove characters from the string use replace all method

        String stringWord ="123 abcd 534534 XYz";

        stringWord= stringWord.replaceAll("[a-zA-Z]","");

        stringWord = stringWord.replaceAll(" ","");

        System.out.println("after replace all characters "+stringWord);


        List myArrList = new ArrayList();

        myArrList.add(100);
        myArrList.add(200);
        myArrList.add(100);
        myArrList.add(300);

        Collections.replaceAll(myArrList,100,400);


        System.out.println(myArrList);

        // Set to list

        Set mysetobj = new TreeSet();
        mysetobj.add(1);
        mysetobj.add(2);

        ArrayList myaobj = new ArrayList(mysetobj);

        System.out.println("SET TO LIST "+myaobj);

        // List to Set

        ArrayList testaobj = new ArrayList();
        testaobj.add("abc");
        testaobj.add("xyz");

        Set testsetobj= new HashSet(testaobj);
        System.out.println("LIST TO SET "+testsetobj);





    }
}
