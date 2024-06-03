    package Collections.SET;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.NavigableSet;
    import java.util.TreeSet;

    public class NavigableSetClass {
        //{Navigable set extends sorted set interface and similar to sorted set but it has more navigable methods
        //2.The floor() method of NavigableSet interface in Java is used to return the greatest element in this set less than or equal to the given element, or null if there is no such element exists in the set. Where, E is the type of elements maintained by this Set container.
        // 1.Lower method The lower() method of NavigableSet interface in Java is used to return the greatest element in this set strictly less than the given element, or null if there is no such element exists in the set. Where, E is the type of elements maintained by this Set container.
        // lower <less than(one element), higer >greater than
        // floor <= less than or equal to one element ,Celing >= greater than or equal to
        //poll first removes the first element in the set and when we print the set again we will set the rest of the elements from the set
        // polllast removes the last element from the set
        // All methods return one element
        // Sorted set and Navigable set doesn't allow null value}
        public static void main(String[] args)
        {

            NavigableSet nobj = new TreeSet();



            nobj.add(10);
            nobj.add(20);
            nobj.add(30);
            nobj.add(40);
            nobj.add(50);
            nobj.add(60);

            List list= new ArrayList();

            list.addAll(nobj);

            System.out.println("list "+list);

            System.out.println(nobj.higher(60));


            //Always return one element

            System.out.println("Navigable SET "+nobj);
            System.out.println("lower "+nobj.lower(30));
            System.out.println("higher  "+nobj.higher(30));
            System.out.println("floor "+nobj.floor(30));
            System.out.println("celing "+nobj.ceiling(40));

            System.out.println("Navigable SET "+nobj);

            nobj.pollFirst();

            System.out.println("Navigable SET After poll first"+nobj);

            nobj.pollLast();

            System.out.println("Navigable SET After poll last"+nobj);

            Object number =nobj.pollFirst();

            String mystring = String.valueOf(number);

            String mystring2= number.toString();

            int a = (int)number;

            //char c = (char)number;
            //String s = (String) number;

           // System.out.println("string"+s.length());

            System.out.println("number "+number);


            System.out.println("TESTING***********");

            NavigableSet testobj = new TreeSet();

            testobj.add(23);
            testobj.add(13);
            testobj.add(31);
            testobj.add(24);

            for (Object c:testobj)
            {
                System.out.println(c);
            }
        }

    }
