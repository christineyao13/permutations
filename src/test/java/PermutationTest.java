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
		//given
		String input = "a";
		//when
		List<String> permutations = new Permutation().call(input);
		//then
		Assert.assertEquals(Arrays.asList("a"),permutations);

	}

	@Test
	public void should_return_ab_ba_when_input_ab (){
		//given
		String input = "ab";
		//when
		List<String> permutations = new Permutation().call(input);
		//then
		Assert.assertEquals(Arrays.asList("ab","ba"),permutations);
	}
}
