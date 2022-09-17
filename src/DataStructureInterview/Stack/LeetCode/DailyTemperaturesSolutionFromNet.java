package DataStructureInterview.Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperaturesSolutionFromNet {

    public static void main(String[] args)
    {
         int[] inputtemperatures= {10,20,30,15,40};

       // int[] inputtemperatures= {73,74,75,71,69,72,76,73};


        int[] finalstackarray=   dailyTemperatures(inputtemperatures);

        System.out.println(Arrays.toString(finalstackarray));
    }



    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length;

        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--){
            int temp = temperatures[i];
            if(stack.isEmpty()){
                stack.push(i);
                ans[i] = 0;
            }else{
                if(temp < temperatures[stack.peek()]){
                    ans[i] = stack.peek() - i;
                    stack.push(i);
                }else{
                    while(stack.isEmpty() == false && temperatures[stack.peek()] <= temp){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        ans[i] = 0;
                    }else{
                        ans[i] = stack.peek() - i;
                    }
                    stack.push(i);
                }
            }
        }

        return ans;
    }

}
