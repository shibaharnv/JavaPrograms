package DataStructureLearning.stackrepeat;

public class stackmainclasstest {

    public static void main(String[] args)
    {
        stackclasstest obj =new stackclasstest(5);

        int maxsizeout=obj.maxsize;
        System.out.println(maxsizeout);
        obj.push(50);
        obj.push(40);
        obj.push(30);
        obj.push(20);
        obj.push(10);

        while (!obj.isEmpty())
        {
            System.out.println(obj.pop());
        }

//        for(int i=0;i<obj.stackarray.length;i++)
//        {
//            if(obj.isEmpty())
//            {
//                obj.push(50);
//            }
//            else
//            {
//                System.out.println(obj.pop());
//            }
//
//        }
    }
}
