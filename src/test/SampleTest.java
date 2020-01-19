package test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class SampleTest {

	@Test
	public void test() {
		// リフレクション
		try {
			// クラスの取得
			Class<?> c = Class.forName("sample.Sample");
			// インスタンスの生成
			Object myObj = c.newInstance();

			// フィールド(db)の取得(1回目、中身は入っていない想定)
			Field f1 = c.getDeclaredField("db");
			f1.setAccessible(true);
			//結果の比較1回目（期待値,実測値）で記載。
			assertEquals(null, f1.get(myObj));

			// メソッド(mainメソッド)の取得
			Method m = c.getMethod("main", String[].class);
			// メソッド(mainメソッド)の実行
			m.invoke(null, (Object) new String[0]);

			// フィールド(db)の取得(2回目、中身が入っている想定)
			Field f2 = c.getDeclaredField("db");
			f2.setAccessible(true);

			//結果の比較2回目（期待値,実測値）で記載。
			assertEquals("[(`・ω・)b]", f2.get(myObj).toString());

			//reflection用例外クラス
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		}
	}

}
