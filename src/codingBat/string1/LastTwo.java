package codingBat.string1;

import com.sun.security.jgss.GSSUtil;

public class LastTwo { // lastTwo("coding") → "codign"

    public static void main(String[] args) {
        String coding = "coding";
        System.out.println(coding.charAt(coding.length() - 1));
    }
    public String lastTwo(String str) {
        if (str.length() >= 2)
            return str.substring(0,str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        return str;
    }

}
