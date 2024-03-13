import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dictionary drill = new Dictionary();
        drill.word = "screwdriver";

        String uppercased;
        int count;

        System.out.println(drill.word);
        uppercased = drill.lowerCaseToUpperCase(drill.word);
        System.out.println(uppercased);

        count = drill.countVowels(uppercased);
        System.out.println(count);
    }
}