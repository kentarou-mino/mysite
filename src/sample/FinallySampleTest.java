package sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class FinallySampleTest {

	//例外処理を期待値にする場合
	@Test(expected = NullPointerException.class)
	public void test1() {

		FinallySample test = new FinallySample();
		test.checkTest();

	}

	@Test
	public void test2() {
		try {
			FinallySample target = new FinallySample();
			// class は予約語なので慣例的に clazz や klass などにする
			Class<FinallySample> clazz = (Class<FinallySample>) target.getClass();

			// 第二引数は呼び出すメソッドの引数の型の配列。無いときは null にする
			Method method = clazz.getDeclaredMethod("check", null);

			// 見えないはずのメソッドを見えるようにする魔法のメソッド
			method.setAccessible(true);

			// 第一引数にメソッドを呼び出すインスタンス、第二引数以後は実際の引数
			String result = (String) method.invoke(target, null);

			System.out.println(result);
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
