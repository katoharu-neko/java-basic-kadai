package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private Scanner scanner;
	
	public Jyanken_Chapter28() {
		scanner = new Scanner(System.in);
	}
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = scanner.next();
		
		//scanner.close();
		if(input.equals("r")) {
			return input;
		} else if(input.equals("s")) {
			return input;
		} else if(input.equals("p")) {
			return input;
		} else { 
			System.out.println("無効な入力です。もう一度入力してください");
			return getMyChoice();
		}
	}
	
	public String getRandom() {
		String[] ophands = new String[]{"r","s","p"};
		int i = (int)Math.floor(Math.random()*3);
		return ophands[i];
	}
	
	public void playGame(String myhand , String ophand) {
		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		System.out.println("自分の手は" + hand.get(myhand) + "対戦相手の手は" + hand.get(ophand));
		
		HashMap<String, String> results = new HashMap<String, String>();
		results.put("rr", "あいこです");
		results.put("rs", "自分の勝ちです");
		results.put("rp", "自分の負けです");
		results.put("ss", "あいこです");
		results.put("sp", "自分の勝ちです");
		results.put("sr", "自分の負けです");
		results.put("pp", "あいこです");
		results.put("pr", "自分の勝ちです");
		results.put("ps", "自分の負けです");
		
		System.out.println(results.get(myhand + ophand));
	}
	
	public void closeScanner() {
		scanner.close();
	}

}
