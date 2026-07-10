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

class WordDictionary {
   TrieNode root;
    public WordDictionary() {
        this.root=new TrieNode();
    }
    
    public void addWord(String word) {
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
    
    public boolean search(String word) {
       return solve(word,root,0);
    }

     public boolean solve(String word,TrieNode root,int i) {
        if(i==word.length()) return root.isEnd();
            char ch=word.charAt(i);
            if(ch=='.'){
                // for(TrieNode baby:root.child()){
                //     if(baby!=null && solve(word,baby,i+1)) return true;
                // }
                for(Map.Entry<Character,TrieNode> e : root.child().entrySet()){
                    if(solve(word,e.getValue(),i+1)) return true;
                }
                return false;
            }else {
                if(!root.child().containsKey(ch)) return false;
                 root=root.child().get(ch);
                 return solve(word,root,i+1);
            }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */