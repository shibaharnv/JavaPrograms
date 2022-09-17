package javainterviewprograms;

import java.util.HashMap;

public class CharacterCount {
public static void main(String[] args)
{
    String word = "Shibahar";

    char[] wordCharArray =word.toCharArray();

    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

    HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();

    hm1.put('a',2);
    hm1.put('b',3);

    System.out.println("keyset "+hm1.keySet());
    System.out.println("Values "+hm1.values());

    for(Character ct:hm1.keySet())
    {
        System.out.println("Get key "+hm1.get(ct));

    }

    int count=1;

    for(char c:wordCharArray)
    {
        if(!hm.containsKey(c))
        {
            hm.put(c,count);
        }
        else
        {
            hm.put(c,count+1);
        }



    }

    System.out.println(hm);

    //Duplicate values

        for(Character cobj:hm.keySet())
        {
            if(hm.get(cobj)>1)
            {
                System.out.println(cobj);
            }
        }


}
}
