package LambaExpressions.PreDefinedInterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceClass {

    //{Predicate interface is used to check conditions
    //Interface structure
    //
    //interface Predicate<T>
    //{
    //public abstract boolean test(T t);
    //}}
    public static void main(String[] args)
    {

        //Eg 1
        Predicate<Integer> obj = i->(i>10);

        System.out.println(obj.test(10));
        System.out.println(obj.test(5));
        System.out.println(obj.test(30));

        //Eg2 :String length check

        Predicate<String> pobj=s->(s.length()>4);
        System.out.println(pobj.test("welcome"));

    }
}
