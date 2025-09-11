class Solution {
    public String sortVowels(String s) {
        StringBuilder str =new StringBuilder();
        int idx=0;
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                char ch=s.charAt(i);
                int ascii=(int) ch;
                arr[idx]=ascii;
                idx++;
            }
        }
        Arrays.sort(arr,0,idx);
        int vowel=0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                str.append((char) arr[vowel]);
                vowel++;
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}