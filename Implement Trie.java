class Trie {
    class Node{
        Node[] children = new Node[26];
        boolean isEnd;
    }
    Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node current = root;
        for(char c: word.toCharArray()){
            int index = c-'a';
            if(current.children[index] == null){
                current.children[index]=new Node();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }
    
    public boolean search(String word) {
        Node current = root;
        for(char c: word.toCharArray()){
            int index = c -'a';
            if(current.children[index] == null)
            return false;
            current = current.children[index];
        }
        return current.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node current = root;
        for(char c:prefix.toCharArray()){
            int index = c-'a';
            if(current.children[index] == null)
            return false;
            current = current.children[index];
        }
        return true;
    }

}

