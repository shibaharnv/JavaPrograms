package DataStructureInterview;

public class ArryCommonItems {

    // Two arrays .find common items
    //Return true if it is able  to find common item
    // Return false if it is not able to find common item

    public static void main(String[] args) {


        int a[] = {2, 3, 8,};
        int b[] = {5, 9, 8};


        ArryCommonItems obj = new ArryCommonItems();

        boolean flag = obj.checArrayForCommonItems(a, b);

        if(flag)
        {
            System.out.println("Arrays have items in common");
        }
        else
        {
            System.out.println("Arrays dont have any items in common");
        }
    }


    boolean checArrayForCommonItems(int[] input1, int[] input2) {


        for (int i = 0; i < input1.length; i++) {

            for (int j = 0; j < input2.length; j++) {
                if (input1[i] == input2[j]) {
                    System.out.println("Common item is present");
                    return true;
                }
            }

        }


        return false;
    }
}
