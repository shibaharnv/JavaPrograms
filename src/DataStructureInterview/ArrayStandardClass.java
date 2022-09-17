package DataStructureInterview;

public class ArrayStandardClass {

    int index;

    int[] data={1,2,3};

    public ArrayStandardClass()
    {
        System.out.println("this is constructor");

    }

     int  getIndex(int index)
    {
        return this.data[index];
    }


    public static void main(String[] args)
    {
        ArrayStandardClass obj = new ArrayStandardClass();

        int value =obj.getIndex(0);

        System.out.println("value "+value);
    }
}
