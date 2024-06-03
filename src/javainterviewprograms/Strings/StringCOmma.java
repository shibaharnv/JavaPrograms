package javainterviewprograms.Strings;

public class StringCOmma {

    public static void main(String[] args) {

        int[] b={2,2,3,1};

        //op/p :2,2 3,1

        String result="";

        for(Object c:b)
        {
            String d=c.toString();
            result=result+d;
        }

        System.out.println(result);

        StringBuffer sb = new StringBuffer(result);

        for(int i=1;i< b.length;i++)
        {
            sb.insert(i,",");
        }


        System.out.println(sb);
    }
}
