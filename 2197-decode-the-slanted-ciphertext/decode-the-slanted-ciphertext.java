class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=encodedText.length();
        int x=n/rows;
        char grid[][]=new char[rows][x];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<x;j++){
                grid[i][j]=encodedText.charAt(k);
                k++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<x;i++){
            int h=0,g=i;
            while(h<rows && g<x){
             sb.append(grid[h][g]);
             h++;
             g++;
            }
        }
       return sb.toString().stripTrailing();//trim();
    }
}