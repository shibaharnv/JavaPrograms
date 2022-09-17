package LambaExpressions;

interface cabb
{
    public String bookingcab(String source,String destination);

}

class olas implements cabb{
    public String bookingcab(String source,String destination)
    {
        System.out.println("Booking cab from "+source+" to "+destination+"");
        return "price :Rs 5000";
    }
    //{Lambda expression :
    // (String source,String destination)->    {
    //        System.out.println("Booking cab from "+source+" to "+destination+"");
    //        return "price :Rs 5000";
    //    }}
}

public class LambdaExpFuncInterFaceWithParameterReturnType {

    public static void main(String[] args)
    {
        //cabb obj = new olas();
        cabb obj = (source,destination)->    {
            System.out.println("Booking cab from "+source+" to "+destination+"");
            return "price :Rs 5000";
        };
        String ans= obj.bookingcab("chennai","hyd");
        System.out.println(ans);
    }
}
