package leetcode;

class Solutioncompress {
    public int compress(char[] chars) {
        int write = 0;  
        int i = 0;  

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}

public class compress{
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        System.out.println(new Solutioncompress().compress(chars));
    }
}
