package javainterviewprograms.Preparation;

public class Solution {

    //{Input- day string and K index
    // Output -day string
    // Given String array ,calculate days of week
    // first find the index of the given day
    // with k index and s find out the actual index  }

    private int daysOfWeekCount = 7;
    private String[] daysOfWeek = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.solution("Sun", 0)); // Sun
        System.out.println(obj.solution("Tue", 1));// wed

        obj.solution("Tue", 1);
    }

    public String solution(String S, int K) {

        // finding index of the given day
        int indexOfS = getIndexForDay(S, daysOfWeek);

        // apply module over K to get the offset
        int indexForSandK = (indexOfS + K) % daysOfWeekCount;

        return daysOfWeek[indexForSandK];
    }

    private int getIndexForDay(String S, String[] daysOfWeek) {
        for (int i=0, c=daysOfWeek.length; i < c; ++i) {
            if (daysOfWeek[i].equals(S)) {
                return i;
            }
        }
        return 0;
    }
}
