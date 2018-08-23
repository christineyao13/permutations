import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Vito Zhuang on 8/23/2018.
 */
public class PermutationTest {
	@Test
	public void should_return_a_when_input_a (){
		String input = "a";

		List<String> permutations = new Permutation().call(input);

		Assert.assertEquals(Arrays.asList("a"),permutations);
	}

	@Test
	public void should_return_ab_ba_when_input_ab (){
		String input = "ab";

		List<String> permutations = new Permutation().call(input);

		Assert.assertEquals(Arrays.asList("ab","ba"),permutations);
	}

	@Test
	public void should_return_abc_acb_bac_bca_cab_cba_when_input_abc (){
		String input = "abc";

		List<String> permutations = new Permutation().call(input);

		Assert.assertEquals(Arrays.asList("abc","acb","bac","bca","cab","cba"),permutations);
	}

	@Test
	public void should_return_size_equals_24_when_input_abcd (){
		String input = "abcd";

		List<String> permutations = new Permutation().call(input);

		Assert.assertEquals(24,permutations.size());
	}
}
