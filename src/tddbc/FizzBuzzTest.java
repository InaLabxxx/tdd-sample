package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void _1を渡すと文字列1を返す() throws Exception {
		//準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		//実行
		String actual = fizzbuzz.convert(1);
		//検証
		assertEquals("1", actual);
	}

}
