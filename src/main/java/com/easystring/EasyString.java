package com.easystring;
import java.util.ArrayList;
import java.util.List;

public class EasyString {
    static List<String> list=new ArrayList<String>();


    public static List<String> permutation(String str) {
        return permutation("", str);
    }

    private static List<String> permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) list.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));

        }
        return list;
    }

}