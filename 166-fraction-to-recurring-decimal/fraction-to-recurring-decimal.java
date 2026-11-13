
        
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder str = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0)) {
            str.append("-");
        }

        long a = Math.abs((long) numerator);
        long b = Math.abs((long) denominator);

        str.append(a / b);
        long rem = a % b;

        if (rem == 0) return str.toString();

        str.append(".");

        HashMap<Long, Integer> map = new HashMap<>();

        while (rem != 0) {
            if (map.containsKey(rem)) {
                str.insert(map.get(rem), "(");
                str.append(")");
                break;
            }

            map.put(rem, str.length());

            rem *= 10;
            str.append(rem / b);
            rem %= b;
        }

        return str.toString();
    }
}
