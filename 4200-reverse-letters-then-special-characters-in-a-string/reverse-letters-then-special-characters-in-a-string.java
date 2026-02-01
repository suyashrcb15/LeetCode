class Solution {
    public String reverseByType(String s) {
        StringBuilder str = new StringBuilder();

        int l = s.length() - 1;
        int sp = s.length() - 1;

        for (int k = 0; k < s.length(); k++) {
            if (Character.isLetter(s.charAt(k))) {
                while (l >= 0 && !Character.isLetter(s.charAt(l))) {
                    l--;
                }
                str.append(s.charAt(l--));
            } else {
                while (sp >= 0 && Character.isLetter(s.charAt(sp))) {
                    sp--;
                }
                str.append(s.charAt(sp--));
            }
        }
        return str.toString();
    }
}


