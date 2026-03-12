class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length, left = 0;
        HashMap <Integer, Integer> mp = new HashMap<>();
        int maxCount = 0;

        for(int right = 0; right < n; right++){


            mp.put(fruits[right], mp.getOrDefault(fruits[right], 0) + 1);
            
            // System.out.println("Mp Before: " + mp);
            while(mp.size() > 2){
                if(mp.get(fruits[left]) > 1){
                    mp.put(fruits[left], mp.get(fruits[left]) - 1);
                }else{
                    mp.remove(fruits[left]);
                }
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
            // System.out.println("Mp after: "+ mp + "count: " + maxCount);
        }

        return maxCount;
    }
}