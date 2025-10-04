class Solution {
    public int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();

        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) return -1;

        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i + 1, arr.length - 1);

        StringBuilder sb = new StringBuilder();
        for (char c : arr) sb.append(c);

        long val = Long.parseLong(sb.toString());
        return (val > Integer.MAX_VALUE) ? -1 : (int) val;
    }

    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
