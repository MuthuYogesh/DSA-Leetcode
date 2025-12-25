class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int start = 0, end = n - 1;
        char[] charArrS = s.toCharArray();
        

        while(start < end){
            char ch1 = Character.toLowerCase(charArrS[start]);
            char ch2 = Character.toLowerCase(charArrS[end]);

            if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 !='u') {start++; continue;}
            if(ch2 != 'a'&& ch2 != 'e'&& ch2 != 'i' && ch2 != 'o'&& ch2 !='u') {end--; continue;}


            char temp = charArrS[start];
            charArrS[start] = charArrS[end];
            charArrS[end] = temp;

            start++;
            end--;
        }

        String str = new String(charArrS);
        return str;
    }
}