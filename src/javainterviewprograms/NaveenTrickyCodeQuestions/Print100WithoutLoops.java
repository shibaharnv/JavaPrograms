package javainterviewprograms.NaveenTrickyCodeQuestions;

public class Print100WithoutLoops {

    public static void main(String[] args)
    {
        //{using recuresive function
        //}

        print(1);

    }

    static  void print(int i)
    {
        if(i<=10) {
            System.out.println(i);
            i++;
            print(i);
        }

    }

}
