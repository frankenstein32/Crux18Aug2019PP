package Lec32;

public class TClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie trie = new Trie();
		trie.addWord("see");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.addWord("be");
		trie.addWord("been");

		trie.display();

		System.out.println(trie.findWord("been"));

		trie.removeWord("been");
		System.out.println(trie.findWord("been"));
		trie.removeWord("be");
		
		
		System.out.println();
		trie.display();
		
		System.out.println(trie);

	}

	
	
	
	
	
	
	
	
	
	
	
}
