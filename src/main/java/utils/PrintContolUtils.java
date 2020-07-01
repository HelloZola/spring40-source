package utils;

import org.springframework.util.StringUtils;

public class PrintContolUtils {

    public final static String Bean = "Bean";
    public final static String Aop = "Aop";

    private static String KEY_WORD = Aop;

    public static void print(String keyword, String content) {

        if (StringUtils.isEmpty(KEY_WORD)) {
            System.out.println(keyword);
        } else {
            if (keyword.equals(KEY_WORD)) {
                System.out.println(content);
            }
        }
    }


}
