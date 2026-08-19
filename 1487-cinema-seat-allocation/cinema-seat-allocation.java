// class Solution {
//     public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
//         long ans=n*2;
//         Map<Integer,List<Integer>> map=new HashMap<>();
//         for(int x[]:reservedSeats){
//             int a=x[0],b=x[1];
//             if(b==1 || b==10) continue;
//             if(map.containsKey(a)){
//                 if(b<=3){
//                     if(map.get(a).contains(1)) continue;
//                 }else if(b<=5){
//                     if(map.get(a).contains(1) || map.get(a).contains(2)) continue;
//                 }else if(b<=7){
//                     if(map.get(a).contains(2) || map.get(a).contains(3)) continue;
//                 }else if(b<=9){
//                     if(map.get(a).contains(3)) continue;
//                 }
//             }
//             if(!map.containsKey(a)) {
//                     map.put(a,new ArrayList<>());
//                 }
//             if(b>=2 && b<=9){
//                 if(b==4 || b==5){
//                     ans-=2;
//                     map.get(a).add(1);
//                     map.get(a).add(2);
//                 }else if(b==6 || b==7){
//                     ans-=2;
//                     map.get(a).add(2);
//                     map.get(a).add(3);
//                 }else if(b==2 || b==3){
//                     ans--;
//                     map.get(a).add(1);
//                 }else{
//                     ans--;
//                     map.get(a).add(3);
//                 }
//             }
//         }
//         return (int)ans;
//     }
// }

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> rows = new HashMap<>();

        for (int[] r : reservedSeats) {
            int row = r[0];
            int seat = r[1];

            if (seat == 1 || seat == 10) {
                continue;
            }

            int mask = rows.getOrDefault(row, 0);
            mask |= 1 << seat;
            rows.put(row, mask);
        }

        int total = (n - rows.size()) * 2;

        int leftMask = 0;
        int middleMask = 0;
        int rightMask = 0;

        for (int seat = 2; seat <= 5; seat++) {
            leftMask |= 1 << seat;
        }

        for (int seat = 4; seat <= 7; seat++) {
            middleMask |= 1 << seat;
        }

        for (int seat = 6; seat <= 9; seat++) {
            rightMask |= 1 << seat;
        }

        for (int mask : rows.values()) {
            boolean leftFree = (mask & leftMask) == 0;
            boolean middleFree = (mask & middleMask) == 0;
            boolean rightFree = (mask & rightMask) == 0;

            if (leftFree && rightFree) {
                total += 2;
            } else if (leftFree || middleFree || rightFree) {
                total += 1;
            }
        }

        return total;
    }
}