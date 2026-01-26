package task1;
public class Parser {
    public static Object parseInput(String s) {
        for (DataType type : DataType.values()) {
            try {
                return type.parse(s);
            } catch (Exception e) {
            }
        }
        return s;
        }
    }

