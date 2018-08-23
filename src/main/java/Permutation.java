import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vito Zhuang on 8/23/2018.
 */
class Permutation {
	List<String> call(String input) {
		if (input.length() == 1) {
			return Collections.singletonList(input);
		}
		List<String> permutations = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			List<String> subPermutations = call(removeOneCharByIndex(input, i));
			for (String subPermutation : subPermutations) {
				permutations.add(input.charAt(i) + subPermutation);
			}
		}
		return permutations;
	}

	private String removeOneCharByIndex(String input, int index) {
		return input.substring(0, index) + input.substring(index + 1);
	}
}
