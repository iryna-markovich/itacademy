package by.itacademy.lesson9.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String pattern = "[a-z0-9]+";
//        String text = "code 2 learn java tutorial";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(text);
//        while(m.find()) {
//            System.out.print(text.substring(m.start(), m.end())+ "+");
//        }
//
//        Pattern pattern = Pattern.compile("\\s+");
//        Matcher matcher = pattern.matcher("code 2 code learn java tutorial");
//        StringBuffer string = new StringBuffer();
//        while (matcher.find()) {
//            String replacement = matcher.replaceFirst("-");
//            matcher.reset(replacement);
//            System.out.println(replacement);
//        }

        Compression compression = new Compression();
        String compressed = compression.forward("hellooooow");
        System.out.println(compressed);
        String text = compression.back(compressed);
        System.out.println(text);
    }
}
