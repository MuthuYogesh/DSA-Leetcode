class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, n = s.length(), len = 0;
        HashMap <Character, Integer> mp = new HashMap<>();

        for (int right = 0; right < n; right++){
            mp.put(s.charAt(right), mp.getOrDefault(s.charAt(right), 0) + 1);

            while (mp.get(s.charAt(right)) > 1){
                int temp = mp.get(s.charAt(left));

                if (temp > 1) mp.put(s.charAt(left), mp.get(s.charAt(left)) - 1);
                else mp.remove(s.charAt(left));
                
                left++;
            }

            len = Math.max(len, right - left + 1);
        }

        return len;
    }
}