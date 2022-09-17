package DataStructureInterview.Recursion;

public class Print1to100UsingRecursion {


    public static void main(String[] args)
    {
        //print(1);
        print2(1,100);

    }

        static void print(int num)
        {

            if(num<=100) {
                System.out.println(num);
                num++;
                print(num);
            }
        }


        static void print2(int startNum,int endNum)
        {
            if(startNum<=endNum)
            {
                System.out.println(startNum);
                startNum++;
                print2(startNum,endNum);
            }
        }
























































}


