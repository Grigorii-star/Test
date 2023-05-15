import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] array = {"bb", "aa", "cc", "bb", "ff", "aa", "gg"};
        String strResult = removeDuplicates(array);
        System.out.println(strResult);
    }

    public static String removeDuplicates(String[] array) {
        Set<String> str = new LinkedHashSet<>();
        String string = "";
        for (String str2 : array) {
            str.add(str2);
        }
        string = String.join(" ", str);
        return string;
    }
}