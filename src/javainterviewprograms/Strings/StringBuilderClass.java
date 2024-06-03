package javainterviewprograms.Strings;

public class StringBuilderClass {

    public static void main(String[] args) {


        StringBuilder sb= new StringBuilder("helloe");

        StringBuilder sb1= new StringBuilder();

        sb1.append(sb.substring(2));
        System.out.println("subs : "+sb1);

        //sb.substring(0,3);

        StringBuilder sb4= new StringBuilder("helloe");

        StringBuilder sb2= new StringBuilder();
        sb2.append(sb4.substring(0,3));

        System.out.println("subs 3: "+sb2);
//        sb.append("world");
//        sb.insert(0,"i");
        //sb.delete(0,3);
       // sb.deleteCharAt(0);
        System.out.println(sb.indexOf("e"));
        System.out.println(sb.lastIndexOf("e"));

        sb.replace(0,1,"k");
        sb.replace(1,2,"z");

        System.out.println(sb);

        //[2,2,1,3]
        //2,2 1,3
        //{First add comma inbetween all}
   int[] b={2,2,1,3};
        String result="2213";

        StringBuffer sb5 = new StringBuffer();

//        sb5.insert(1,",");
//        System.out.println(sb5);
//        sb5.insert(3,",");
//        System.out.println(sb5);
//        sb5.insert(5,",");

        //fi


        //{Loop should run three time and index should increase by 2 every time}


        //{b[1],b[2],b[3],}

        for(int i=0;i<result.length();i++)
        {
            if(i!=0)
            {
                sb5.append(",");
            }


            sb5.append(b[i]);
        }

        System.out.println(sb5);

        //2,2,1,3  ---> 2,2 1,3


        for(int k=1;k<sb5.length();k=k+3)
        {
            sb5.insert(k," ");
        }

        System.out.println(sb5);
    }
}
