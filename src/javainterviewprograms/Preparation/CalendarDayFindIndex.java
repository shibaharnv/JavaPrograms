package javainterviewprograms.Preparation;

public class CalendarDayFindIndex {

    public static void main(String[] args) {

        String[] daysStringArray = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

        int weekLength= daysStringArray.length;

        //findIndex

        int indexforDay=findIndexDay(daysStringArray,"Sun");

        System.out.println(indexforDay);

        String output=solution("Thu",2);
        System.out.println(output);


    }

    private static String solution(String dayValue,int Kindex)
    {
        String[] daysStringArray = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        int dayValueIndex=findIndexDay(daysStringArray,dayValue);

        int finalindex =dayValueIndex+Kindex;

        String result=daysStringArray[finalindex];

        return result;
    }

    private static int findIndexDay(String[] daysArray,String day) {

        for(int i=0;i< daysArray.length;i++)
        {
            if(daysArray[i].equalsIgnoreCase(day))
            {
                return i;
            }
        }
        return 0;
    }
}
