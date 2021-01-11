package sample;

import java.util.regex.Pattern;

public class RegexSample {

	//正規化表現のサンプルコード
	public static void main(String[] args) {

		//
		System.out.println("ーーーー正規表現の実行結果 startーーーー");
		System.out.println("isNumber(\"2\")->");
		System.out.println(isNumber("2"));

		//空白判定
		System.out.println("isNumber(\"\")->");
		System.out.println(isNumber(""));

		//数字以外の文字列を含んでいる場合
		System.out.println("isNumber(\"\")->");
		System.out.println(isNumber("1a0"));
		System.out.println("ーーーー正規表現の実行結果 endーーーー");

	}

	//	正規表現　数値判定
	//	空白を許容しない正規表現
	private static final String notPermmitSpace = "^[0-9]+$";
	//	空白を許容
	//	private static final String permmitSpace = "^[0-9]*$";
	//正規表現のオブジェクト化
	private static final Pattern pattern = Pattern.compile(notPermmitSpace);

	/**
	 *数値判定メソッド
	 *@param num
	 *@return 正規表現の判定結果
	 *@author minokentarou
	 * */
	private static boolean isNumber(String num) {
		//		return pattern.matcher(num).matches();
		return pattern.matcher(num).find();
	}
}
