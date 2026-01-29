package task3;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiniTemplateRegex {
    public static String render(String template, Map<String, Object> values) {
        Pattern pattern = Pattern.compile("\\$\\{([^{}:]+)(:([^{}]+))?}");
        Matcher matcher = pattern.matcher(template);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String key = matcher.group(1);
            String format = matcher.group(3);
            Object value = values.get(key);
            String replacement = "";

            if (value != null) {
                if (format != null && value instanceof Number) {
                    replacement = new DecimalFormat(format).format(value);
                } else {
                    replacement = value.toString();
                }
            }

            matcher.appendReplacement(result, Matcher.quoteReplacement(replacement));
        }

        matcher.appendTail(result);
        return result.toString();
    }
}
