class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> lakeToLastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;
            } else {
                int lake = rains[i];
                if (lakeToLastRain.containsKey(lake)) {
                    int lastRainDay = lakeToLastRain.get(lake);
                    Integer dryDay = dryDays.higher(lastRainDay);
                    if (dryDay == null) return new int[0]; 
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }
                lakeToLastRain.put(lake, i);
                ans[i] = -1;
            }
        }
        return ans;
    }
}