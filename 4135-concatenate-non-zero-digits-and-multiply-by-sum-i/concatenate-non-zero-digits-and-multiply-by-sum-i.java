class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        long sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0') continue;
            sum+=(long)ch-'0';
            sb.append(ch);
        }
        if(sb.isEmpty()) return 0;
        return Long.parseLong(sb.toString())*sum;
    }
}