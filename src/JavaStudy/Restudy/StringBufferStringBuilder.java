package JavaStudy.Restudy;

public class StringBufferStringBuilder {

    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);

        sb.append(" world");
        System.out.println(sb);

        sb.insert(5,",");
        System.out.println(sb);

        sb.delete(0,3);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuffer sb1= new StringBuffer("testing");

        sb1.replace(0,3,"ING");

        System.out.println(sb1);

        sb1.substring(5);

        System.out.println(sb1);


    }
}
