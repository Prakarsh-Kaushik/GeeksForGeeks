class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder reversed = new StringBuilder();
        reversed.append(s);
        reversed.reverse();
        
        return reversed.toString();
    }
}