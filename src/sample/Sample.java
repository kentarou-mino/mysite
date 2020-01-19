package sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	//変数を分割して書かないと難しいかも...。
	static List<String> db = null;

	public static void main(String[] args) {

		//DBから値を取得した想定
		db = dbAccess();
		System.out.println(db.get(db.size() - 1));

	}

	//DBにアクセスした想定のメソッド。
	//野田さんの現場だと、DBfluteのメソッド。
	private static List<String> dbAccess() {

		List<String> dbResult = new ArrayList<>();
		dbResult.add("(`・ω・)b");
		return dbResult;

	}

}
