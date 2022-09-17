package LambaExpressions;


interface cabs
{
    public void bookCab(String source,String destination);
}

//class UberCab implements cabs
//{
//
//    @Override
//    public void bookCab(String source,String destination) {
//
//        System.out.println("Cab is booked from " +source+" to "+destination);
//    }
//    //{Writing lambda expression
//    // (String source,String destination)->System.out.println("Cab is booked from " +source+" to "+destination);}
//}

public class LambdaExpFuncInterFaceWithParameter {

    public static void main(String[] args)
    {
        //cabs objs = new UberCab();

        cabs objs =(source,destination)->System.out.println("Cab is booked from " +source+" to "+destination);

        objs.bookCab("chennai","bangalore");
    }
}
