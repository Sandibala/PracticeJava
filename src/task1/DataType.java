package task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public enum DataType {
    INT(s -> Integer.parseInt(s)),
    DOUBLE(s -> Double.parseDouble(s)),
    BOOLEAN(s -> {
        if(s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")){
            return Boolean.parseBoolean(s);
        }
        throw new IllegalArgumentException();
    }),
    LOCALDATE(s -> LocalDate.parse(s, DateTimeFormatter.ISO_LOCAL_DATE)),
    STRING(s -> s);

    private final Function<String, ?> parser;
    DataType(Function<String, ?> parser){
        this.parser = parser;
    }
    public Object parse(String s) throws Exception {
        return parser.apply(s);
    }

}
