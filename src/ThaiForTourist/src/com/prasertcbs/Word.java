package com.prasertcbs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by prasert on 11/10/2014.
 */
public class Word {
    private static Map<String, String> words = new LinkedHashMap<>();

    private int x;

    static {
//        x = 10;
        System.out.println("static init was called.");
        words.put("Hello", "Sawatdee (kub/kah)");
        words.put("How are you?", "Sabai dee ru (krub/kah)");
        words.put("Fine", "Sabai dee (krub/kah)");
        words.put("Thank you", "Khob Khun (kup/kaa)");
        words.put("Yes", "chai");
        words.put("No", "mai chai");
        words.put("can", "dai");
        words.put("can not", "mai dai");
        words.put("I do not understand", "mai kow jai");
        words.put("How much?", "nee Tao Rai?");
        words.put("expensive", "pang");
        words.put("very expensive", "pang mak");
        words.put("cheap", "took");
        words.put("water", "naam");
        words.put("good luck", "chok dee");
        words.put("Airport", "sanaam bin");
        words.put("hot", "ron");
        words.put("cold", "nao");
        words.put("toilet", "hong naam");
        words.put("ice", "naam keng");
        words.put("a little bit", "nit noi");
        words.put("large", "yai");
        words.put("beer", "bia");
        words.put("1", "neung");
        words.put("2", "song");
        words.put("3", "sam");
        words.put("4", "see");
        words.put("5", "haa");
        words.put("6", "hok");
        words.put("7", "jet");
        words.put("8", "paed");
        words.put("9", "gow");
        words.put("10", "sip");
        words.put("11", "sip-et");
        words.put("12", "sip-song");
        words.put("20", "yee sip");
        words.put("30", "saam sip");
        words.put("100", "roi/loi");
    }

    public static String search(String key) {
        return words.getOrDefault(key, "not found");
    }
}
