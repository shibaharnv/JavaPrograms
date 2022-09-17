package DataStructureInterview.LinearSearch;

public class LinearSearchClass {

    //{Linear search program
    // input : array a ,x value we are searching for
    // output : index position of x
    // 1. write a method with parameters that accept array and value
    // 2.Assume it as a integer array
    // 3.We need to find the value of a integer present inside the array
    // 4. Iterate through the array get the value and compare with input vaule
    // 5. return the index value ..if element is not found then return -1}


    public static void main(String[] args)
    {

        int[] a ={1,2,4,5,6};
        int inputvalue=9;
        int indexvalue=linearSearch(a,inputvalue);
        System.out.println("Input value "+inputvalue+ " is present in indexvalue "+indexvalue);


    }

    public static int linearSearch(int[] intarray,int valueCheck)
    {
        for(int i=0;i<intarray.length;i++)
        {
            if(intarray[i]==valueCheck)
            {
                return i;
            }
        }

        return -1;
    }


}

