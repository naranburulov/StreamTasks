package IntroToStream;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {



        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                .map(each -> each.length())
                .forEach(System.out::println);


    }
}
