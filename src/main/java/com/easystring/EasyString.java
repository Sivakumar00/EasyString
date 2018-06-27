package com.easystring;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private static boolean isValidEmail(String email){


        String[] deniedIdCharList = { ",", ";", "'", "\"", "[", "]", "|", "\\",
                "=",  "!", "#", "$", "%", "^", "&", "*", "(", ")",
                "/", "`", "~", ":", "<", ">", "?", "{", "}" };

        int atLoc = email.indexOf("@");
        if (atLoc == -1) {
            return false;
        } else {
            String id = email.substring(0, atLoc);
            String domain = email.substring(atLoc + 1, email.length());

            if (domain.indexOf("@") != -1) {
                return false;
            }

            else {

                for (String deny : deniedIdCharList) {
                    if (id.indexOf(deny) != -1) {
                        return false;
                    }
                    if (domain.indexOf(deny) != -1) {
                        return false;
                    }

                }
                if (id.length() == 0 || domain.length() == 0) {
                    return false;
                }

                int dotIndex = domain.indexOf(".");
                String host = domain.substring(0, dotIndex);
                String extn = domain.substring(dotIndex + 1);
                if (host.length() == 0) {
                    return false;
                }
                if ((extn.length() != 2 && extn.length() != 3 && extn.length() != 5)) {
                    return false;
                }
                if (extn.length() == 5 && extn.indexOf(".") == -1) {
                    return false;
                }

            }
            return true;
        }

    }
}