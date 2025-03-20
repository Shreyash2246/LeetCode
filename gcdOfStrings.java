package leetcode;

class Solution_gcdOfStrings {
    public static String _gcdOfStrings(String str1, String str2){
        if(!(str1 + str2).equals(str1+str2)){
            return "";
        }
    
        int gcdlen = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdlen);
    }

    private static int gcd(int a, int b){
        return b==0 ? a:gcd(b, a%b);
    }
}
    
public class gcdOfStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
    
        System.out.println(Solution_gcdOfStrings._gcdOfStrings(str1, str2));
    }
}
