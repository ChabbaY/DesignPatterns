package cloud.englert.patterns.creation.builder;

import java.util.ArrayList;
import java.util.List;

public class StringBuilder extends Builder {
    List<String> list;

    public StringBuilder() {
        list = new ArrayList<>();
    }
    public StringBuilder(String str) {
        this();
        append(str);
    }

    public StringBuilder append(String str) {
        list.add(str);
        return this;
    }

    public String build() {
        char[] chars = String.join("", list).toCharArray();
        return new String(chars);
    }
}
