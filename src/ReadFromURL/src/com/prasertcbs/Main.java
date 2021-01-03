package com.prasertcbs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = readTextFromUrl("https://dl.dropboxusercontent.com/u/23148470/temples.txt");
        System.out.println(s);
    }

    public static String readTextFromUrl(String urlString) {
//        String urlString = "https://dl.dropboxusercontent.com/u/23148470/temples.txt";
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while((line = r.readLine()) != null) {
                sb.append(line);
                sb.append(System.getProperty("line.separator"));
            }
            r.close();
//            System.out.println(sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
