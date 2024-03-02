package Week4;
class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;
    
    public TrieNode(){
        children=new TrieNode[26];
        isEndOfWord=false;
    }
}
public class ImplementTrie {
    private TrieNode root;
    public ImplementTrie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node= root;
        for(char c: word.toCharArray()){
            int index= c- 'a';
            if(node.children[index]==null) node.children[index]= new TrieNode();
            node = node.children[index];
        }
        node.isEndOfWord=true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            int index = c -'a';
            if(node.children[index]==null) return false;
            node= node.children[index];
        }
        return node.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            int index = c-'a';
            if(node.children[index]==null) return false;
            node=node.children[index];
        }
        return true;
    }
}
