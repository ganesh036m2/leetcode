class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> a = new ArrayList<>();

        for (int x : nums) {
            while (!a.isEmpty()) {
                int y = a.get(a.size() - 1);
                int g = gcd(x, y);
                if (g == 1)
                    break;
                x = (x / g) * y;
                a.remove(a.size() - 1);
            }
            a.add(x);
        }
        return a;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}