package DataStructureInterview.Stack;

import java.util.Stack;

public class BookingcomQuestionStringRemovalAdvanced {
//{Given a string "ABC#DD#E", for every # consider it as a back space. Output the final string. For example, in the above string answer will be "ABDE". SImilary "A##BB#E##F" will output "F" (Use stack)
//This was extended saying if you see @ consider it as a redo, how do you implement it. For example, A#@BB#E#F will output "ABF"}
    public static void main(String[] args) {

        String inputString="A#@BB#E#F";

        stringRemoval(inputString);
    }

    private static void stringRemoval(String inputString) {

        Stack<Character> firststack = new Stack<>();
        Stack<Character> secondStack = new Stack<>();

        char[] charArray= inputString.toCharArray();

        for(char c:charArray)
        {
            if(c=='#')
            {
                if (!firststack.isEmpty())
                {
                    secondStack.push(firststack.pop());
                }
            }
            if(c=='@')
            {
                firststack.push(secondStack.pop());
            }
            else if(c!='#'){
                firststack.push(c);
            }


        }
        System.out.println(firststack);


        StringBuilder sb = new StringBuilder();

        for(char d:firststack)
        {
            sb.append(d);
        }

        System.out.println(sb);

    }
}
