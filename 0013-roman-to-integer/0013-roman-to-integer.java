public class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int i = 0;

        while (i < s.length()) {
            if (i + 1 < s.length()) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    total += 4;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    total += 9;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    total += 40;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    total += 90;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    total += 400;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    total += 900;
                    i += 2;
                    continue;
                }
            }

            
            char c = s.charAt(i);
            if (c == 'I') total += 1;
            else if (c == 'V') total += 5;
            else if (c == 'X') total += 10;
            else if (c == 'L') total += 50;
            else if (c == 'C') total += 100;
            else if (c == 'D') total += 500;
            else if (c == 'M') total += 1000;

            i++;
        }

        return total;
    }
}
