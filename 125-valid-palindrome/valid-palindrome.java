class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        
        while(left<right){
            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetterOrDigit(c1)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                right--;
                continue;
            }

            if(c1 != c2){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}