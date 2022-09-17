package DataStructureInterview.BinarySearch;

public class BinarySearchLogicClass {

    //{1.In order to perform binary search we need to sort the array first.
    // 2.first find the middle number and break the array
    // 3three variables first number ,last number and middle number
    // 4.check if the answer is equal to middle number if yes then break the loop answer found
    // 5.Check if the answer is greater than middle number first number should be changed to midnumber +1
    //and last number remains the same
    // 6. CHeck if the answer is less than the middle number then first number remains the same and lastnumber should be
    // changed to middle number -1
    // 7. IF first value and last value of the sorted array are same in binary search then the searched element is
    // not present}


    public static void main(String[] args)
    {
        int[] a ={1,2,3,4,5,6,7,8,9,10};

        int firstnumber=a[0];

        int lastnumber=a[a.length-1];

        int middlenumber;

        int answer=3;

        // CHeck if the element is present using binary search

        //Finding middle number

        middlenumber=(firstnumber+lastnumber)/2;
        System.out.println(" middlenumber "+middlenumber);

        if(answer==middlenumber)
        {
            System.out.println("Answer found "+middlenumber);
        }

        if(answer>middlenumber)
        {
            firstnumber=middlenumber+1;
        }

        if(answer==firstnumber)
        {
            System.out.println("Answer matching "+firstnumber);
        }

        middlenumber=(firstnumber+lastnumber)/2;
        System.out.println(" second middlenumber "+middlenumber);

        if(middlenumber==answer)
        {
            System.out.println("Answer found "+middlenumber);
        }
        if(answer>middlenumber)
        {
            firstnumber=middlenumber+1;
        }

        if(answer==firstnumber)
        {
            System.out.println("Answer matching firstnumber"+firstnumber);
        }

        if(answer<middlenumber)
        {
            lastnumber=middlenumber-1;
        }

        if(answer==lastnumber)
        {
            System.out.println("Answer matching lastnumber"+lastnumber);
        }











    }

}
