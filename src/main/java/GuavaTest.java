import com.google.common.base.Strings;

public class GuavaTest {

    public static void main(String[] args) {

        String output = Strings.padEnd("cat", 9, '*');
        System.out.println(output);

    }

}