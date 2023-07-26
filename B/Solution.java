import java.util.HashMap;
import java.util.Map;

class Solution {

    private static int dohaColors(int[] p1, int[] p2, int query) {
        // we don't wanna to look for complexity in square root for this
        // we mjust have access in constant time for one them

        Map<Integer, Boolean> map = new HashMap<>();
        int res = 0;
        for (int val : p2) {
            map.put(val, true);
        }

        for (int val : p1) {
            if (map.containsKey(query - val))
                res++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Bismi Allah");
        int p1[] = { 1, 2, 3 };
        int p2[] = { 2, 4 };

        int res = dohaColors(p1, p2, 5);
        System.out.println(res);
        res = dohaColors(p1, p2, 1);
        System.out.println(res);

    }
}