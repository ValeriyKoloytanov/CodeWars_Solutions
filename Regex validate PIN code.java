public class Solution {

    public static boolean validatePin(String pin) {
        int length = pin.length();
        if( (length==4 || length==6)&& pin.matches("[0-9]+"))
            return true;
        else return false;
    }

}