package BT3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlWep {
    private static final String REGEX = "Cate_TheGioi|MainList|\">(.*?)</a>";

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            BufferedReader is = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = is.readLine()) != null) {
               list.add(line);
            }
            line = line.replaceAll("\\n+", " ");
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String str : list) {
            System.out.println(str);
        }

    }
}
