class TrieNode{
    TrieNode arr[];
    boolean flag;
    public TrieNode(){
        arr=new TrieNode[26];
        flag=false;
    }
    TrieNode[] child(){
       return arr;
    }
    void setAsEnd(boolean x){
        flag=x;
    }
    boolean isEnd(){
        return flag;
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.child()[ch-'a']==null){
                node.child()[ch-'a']=new TrieNode();
            }
            node=node.child()[ch-'a'];
        }
        node.setAsEnd(true);
    }
    
    public boolean search(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.child()[ch-'a']==null){
                return false;
            }
            node=node.child()[ch-'a'];
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(node.child()[ch-'a']==null){
                return false;
            }
            node=node.child()[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */