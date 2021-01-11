package BT3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlWep {
    private static String getContent(String link) throws IOException {
        URL url = new URL(link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        content = content.replaceAll("\\R", "");
        return content;
    }

    public static String getEvent(String c) {
        String result = "";
        Pattern pattern = Pattern.compile("dt-list dt-list--link\">(.*?)</ul>");
        Matcher matcher = pattern.matcher(c);
        while (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String content = getContent("https://dantri.com.vn/");
        String c = getEvent(content);
        Pattern pattern = Pattern.compile("htm\">(.*?)</a>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(1).trim());
        }
    }
}
