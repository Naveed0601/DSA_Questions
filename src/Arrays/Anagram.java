package Arrays;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Anagram
{
    public static Boolean CheckAnagram(String s1 , String s2){
        char[] temp1 = s1.toCharArray();
        char[] temp2 = s2.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

//        for(int i = 0; i < temp1.length; i++){
//            if(temp1[i] != temp2[i]) return false;
//        }
        return Arrays.equals(temp1 , temp2);
    }

    public static void main (String[] args)
    {
        String s1 = "listen" , s2 = "silent";
        Boolean result = CheckAnagram(s1 , s2);
        System.out.println(result);
        // your code goes here
    }
}