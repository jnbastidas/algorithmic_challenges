package impl;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class FirstNonRepeatedCharacter {
	public Character getFirstNonRepeatedCharacter(final String input) {
		if (input == null) {
			return null;
		}

			//Traditional implementation
		/*final Map<Character, Integer> charactersGroup = new HashMap<>();
		for(final Character inCharater : input.toCharArray()) {
			if (charactersGroup.containsKey(inCharater)) {
				charactersGroup.put(inCharater, charactersGroup.get(inCharater) + 1);
			} else {
				charactersGroup.put(inCharater, 1);
			}
		}

		Character rdo = null;
		for(final Map.Entry<Character, Integer> entry : charactersGroup.entrySet()) {
			if (Integer.valueOf(1).equals(entry.getValue())) {
				rdo = entry.getKey();
				break;
			}
		}

		return rdo;*/

		// Streams implementation

		final Map<Character, Long> charactersGroup = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy((c -> c), Collectors.counting()));
		final Optional<Map.Entry<Character, Long>> nonRepeatedCharacter = charactersGroup.entrySet().stream().filter(e -> Long.valueOf(1L).compareTo(e.getValue()) == 0).findFirst();

		return nonRepeatedCharacter.map(Map.Entry::getKey).orElse(null);
	}
}
