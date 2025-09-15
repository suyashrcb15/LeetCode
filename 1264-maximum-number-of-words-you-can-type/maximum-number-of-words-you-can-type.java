class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt = 0;
        String[] words = text.split(" ");
        HashSet<Character> brokenSet = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            brokenSet.add(brokenLetters.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            HashSet<Character> res = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                res.add(words[i].charAt(j));
            }
            boolean isBroken = false;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (res.contains(brokenLetters.charAt(j))) {
                    isBroken = true;
                    break;
                }
            }
            if (!isBroken) {
                cnt++;
            }
        }
        return cnt;
    }
}