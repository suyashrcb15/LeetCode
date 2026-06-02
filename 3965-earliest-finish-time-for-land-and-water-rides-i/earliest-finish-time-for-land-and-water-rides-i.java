class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++) {
            int t = landStartTime[i];
            int d = landDuration[i];
            int finishLand = t + d;
            for(int j = 0; j < waterStartTime.length; j++) {
                int a = waterStartTime[j];
                int b = waterDuration[j];
                int startWater = Math.max(a, finishLand);
                int finishWater = startWater + b;
                min = Math.min(min, finishWater);
            }
        }
        for(int i = 0; i < waterStartTime.length; i++) {
            int a = waterStartTime[i];
            int b = waterDuration[i];
            int finishWater = a + b;
            for(int j = 0; j < landStartTime.length; j++) {
                int t = landStartTime[j];
                int d = landDuration[j];
                int startLand = Math.max(t, finishWater);
                int finishLand = startLand + d;
                min = Math.min(min, finishLand);
            }
        }
        return min;
    }
}
