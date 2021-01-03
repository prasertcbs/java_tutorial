package com.prasertcbs;

/**
 * Created by prasert on 10/16/2014.
 */
public class ThaiUtils {
    /**
     * แปลงเลขอารบิกให้เป็นเลขไทย
     * @param s
     * @return
     */
    public static String arabicToThaiNumeral(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current >= '0' && current <= '9') {
                // \u0030 = 0 (ศูนย์ เลขอารบิก)
                // \u0e50 = ๐ (ศูนย์ เลขไทย)
                // \u0e59 = ๙
                sb.append((char) (current + '\u0e50' - '0'));
            } else {
                sb.append(current);
            }
        }
        return sb.toString();
    }

    /**
     * แปลงเลขไทยให้เป็นเลขอารบิก
     * @param s
     * @return
     */
    public static String thaiNumeralToArabic(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current >= '\u0e50' && current <= '\u0e59') {
                // \u0030 = 0 (ศูนย์ เลขอารบิก)
                // \u0e50 = ๐ (ศูนย์ เลขไทย)
                // \u0e59 = ๙
                sb.append((char) (current - '\u0e50' + '0'));
            } else {
                sb.append(current);
            }
        }
        return sb.toString();
    }
}
