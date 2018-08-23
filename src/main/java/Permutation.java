import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vito Zhuang on 8/23/2018.
 */
public class Permutation {
	public List<String> call(String input) {
		if (input.length() == 2) {
			List<String> permutations = new ArrayList<>();
			permutations.add(input);
			permutations.add(input.substring(1, 2) + input.substring(0, 1));
			return permutations;
		}
		if (input.length() == 3) {
			List<String> permutations = new ArrayList<>();

			for (int index = 0; index < input.length(); index++) {
				List<String> subPermutations = call(removeOneChar(input, index));
				permutations.add(input.charAt(index) + subPermutations.get(0));
				permutations.add(input.charAt(index) + subPermutations.get(1));

			}

//
//			List<String> subpermutations = call(removeOneChar(input, 0));
//			permutations.add(input.substring(0, 1) + subpermutations.get(0));
//			permutations.add(input.substring(0, 1) + subpermutations.get(1));
//
//			subpermutations = call(removeOneChar(input, 1));
//			permutations.add(input.substring(1, 2) + subpermutations.get(0));
//			permutations.add(input.substring(1, 2) + subpermutations.get(1));
//
//			subpermutations = call(removeOneChar(input, 2));
//			permutations.add(input.substring(2, 3) + subpermutations.get(0));
//			permutations.add(input.substring(2, 3) + subpermutations.get(1));
			return permutations;
		}
		return Arrays.asList(input);
	}

	private String removeOneChar(String input,int index) {
		if (index == 0){
			return input.substring(1);
		}
		return input.substring(0, index) + input.substring(index+1);
	}
}
