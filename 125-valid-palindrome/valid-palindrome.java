class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        s = s.toLowerCase();
        while(left<right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

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