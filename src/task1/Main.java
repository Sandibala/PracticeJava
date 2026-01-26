package task1;
import java.util.Scanner;
import static task1.Parser.parseInput;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Object res = parseInput(s);
        System.out.println(res.getClass());
        System.out.println(res.getClass().getSimpleName());

    }
}
