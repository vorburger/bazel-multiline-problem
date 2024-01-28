import static java.lang.StringTemplate.STR;

public class Multiline {
    static String planet = "world";

    static String s1 = STR."hello, \{planet}";

    static String s2 = STR."""
            hello, \{planet}
            """;
}
