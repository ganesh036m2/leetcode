class Solution {
    public int primePalindrome(int n) {
        while (true) {
            if (isPalindrome(n) && isPrime(n))
                return n;
            n++;
            if (n > 10000000 && n < 100000000)
                n = 100000000;
        }
    }
    boolean isPalindrome(int n) {
        int x = n;
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return n == rev;
    }
    boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}