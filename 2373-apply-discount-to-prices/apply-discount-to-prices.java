class Solution {
    public String discountPrices(String sentence, int discount) {
        String s[]=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            String word=s[i];
            if(word.startsWith("$")){
                boolean vis=false;
                String p="";
                for(int j=1;j<word.length();j++){
                    char ch=word.charAt(j);
                    if(!Character.isDigit(ch)) {
                        vis=true;
                        break;
                    }
                    p+=ch;
                }
                if(vis || p=="") continue;
                double d=Double.parseDouble(p);
                double r=(d*discount)/100;
                r=d-r;
                String f=String.format("%.2f",r);
                s[i]="$"+f;
            }
        }
        return String.join(" ",s);
    }
}