// class Solution {
//     public boolean stoneGameIX(int[] stones) {
//         long sum=0;
//         int n=stones.length;
//         for(int stone:stones){
//             sum+=stone;
//         }
//         if(sum%3==0){
//             if(n%2==0) return true;
//             return false;
//         }
//         if(n%2==0) return true;
//         return false;
//     }
// }


class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }
        if (count[0] % 2 == 0) {
            return count[1] > 0 && count[2] > 0;
        }
        return Math.abs(count[1] - count[2]) > 2;
    }
}