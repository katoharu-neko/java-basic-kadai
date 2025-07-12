package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	private HashMap<String, String> dictionary;
	
	public Dictionary_Chapter21() {
		dictionary = new HashMap<>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemmon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");	
	}
	
	public void dictfind( String[] words ) {
		for ( String word : words) {
			if( dictionary.containsKey(word)) {
				System.out.print(word + "の意味は" + dictionary.get(word)+"です\n");
			} else {
				System.out.print(word + "は辞書に存在しません\n");
			}
			
			
		}
		
		
	}

}
