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
			permutations.add(input);
			permutations.add(input.substring(0, 1) + input.substring(2, 3) + input.substring(1, 2));
			permutations.add(input.substring(1, 2) + input.substring(0, 1) + input.substring(2, 3));
			permutations.add(input.substring(1, 2) + input.substring(2, 3) + input.substring(0, 1));
			permutations.add(input.substring(2, 3) + input.substring(0, 1) + input.substring(1, 2));
			permutations.add(input.substring(2, 3) + input.substring(1, 2) + input.substring(0, 1));
			return permutations;
		}
		return Arrays.asList(input);
	}
}
