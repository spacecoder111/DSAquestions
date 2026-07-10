class TrieNode{

    Map<Character,TrieNode> map;

    boolean flag;

    public TrieNode(){
        map=new HashMap<>();
        flag=false;
    }

    Map<Character,TrieNode> child(){
       return map;
    }

    void setAsEnd(boolean x){
        flag=x;
    }

    boolean isEnd(){
        return flag;
    }
}

class MagicDictionary {
    TrieNode root;

    public MagicDictionary() {
        root=new TrieNode();
    }
    
    public void buildDict(String[] dictionary) {
    for(String word:dictionary){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.child().containsKey(ch)){
                node.child().put(ch,new TrieNode());
            }
            node=node.child().get(ch);
        }
        node.setAsEnd(true);
      }
    }
    
    public boolean search(String searchWord) {
        return solve(searchWord,root,0,0);
    }

    public boolean solve(String word,TrieNode root,int i,int c) { 
        if(c>1) return false;
        if(i==word.length()) {
            return root.isEnd() && c==1;
        }
            char ch=word.charAt(i);
            // if(!root.child().containsKey(ch)){
            //     c++;
                for(Map.Entry<Character,TrieNode> e : root.child().entrySet()){
                    int x=e.getKey()==ch?c:c+1;
                    if(solve(word,e.getValue(),i+1,x)) return true;
                }
                return false;
            // }else {
            //     if(!root.child().containsKey(ch)) return false;
            //      root=root.child().get(ch);
            //      return solve(word,root,i+1,c);
            // }
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */