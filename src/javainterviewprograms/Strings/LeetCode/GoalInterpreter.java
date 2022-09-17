package javainterviewprograms.Strings.LeetCode;

public class GoalInterpreter

{

    public static void main(String[] args)
    {
        //{Example 1:
        //
        //Input: command = "G()(al)"
        //Output: "Goal"
        //Explanation: The Goal Parser interprets the command as follows:
        //G -> G
        //() -> o
        //(al) -> al
        //The final concatenated result is "Goal".
        //Example 2:
        //
        //Input: command = "G()()()()(al)"
        //Output: "Gooooal"
        //Example 3:
        //
        //Input: command = "(al)G(al)()()G"
        //Output: "alGalooG"}

        //{Logic:
        // Input - String
        // //Output String
        //G -> G
        //() -> o
        //(al) -> al }

        String command = "G()(al)";
        String answer=goalInterpreterMethod(command);
        System.out.println(answer);
    }

    public static String goalInterpreterMethod(String command)
    {
        String newString;
       //newString= command.replaceAll("[()]","o").replaceAll("[(al)]","al");
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;

    }
}
