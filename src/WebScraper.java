import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] unused) {
        System.out.println("https://cs.illinois.edu/");
    }

    public static int wordCount(String input) {
        if (input == null || input.equals("")) {
            return 0;
        }
        String[] words = input.split("");
        return words.length;
    }

}
    public static void nameSearch(String[] word, final String wordSearch) {
        boolean search = false;
        for (String word : word) {
            if (word.equals(wordSearch)) {
                search = true;
                System.out.println(word.toLowerCase());
            }
        }
        return word;
    }



/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
        return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
        }
}
