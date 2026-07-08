import java.util.*;

class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        int limit = (int) Math.cbrt(n);

        for (int i = 1; i <= limit; i++) {
            long cubeI = 1L * i * i * i;

            for (int j = i; j <= limit; j++) {
                long sum = cubeI + 1L * j * j * j;

                if (sum > n) {
                    break;
                }

                map.put((int) sum, map.getOrDefault((int) sum, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                res.add(entry.getKey());
            }
        }

        Collections.sort(res);
        return res;
    }
}