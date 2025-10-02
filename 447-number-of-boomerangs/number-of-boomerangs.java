class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int[] p : points) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int[] q : points) {
                int dx = p[0] - q[0];
                int dy = p[1] - q[1];
                int dist = dx * dx + dy * dy;
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            for (int count : map.values()) {
                res += count * (count - 1);
            }
        }
        return res;
    }
}