public class Solution {
    public static String repeatStr(final int repeat, final String string)
    { if (repeat<0)
        return "";
    else
        return string.repeat(repeat);
    }
}
