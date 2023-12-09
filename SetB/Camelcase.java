import java.util.*;
class Camelcase {
	static void CamelCase(ArrayList<String> words, String pattern) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < words.size(); i++) {
			String str = "";
			int l = words.get(i).length();
			for (int j = 0; j < l; j++) {
				if (words.get(i).charAt(j) >= 'A' && words.get(i).charAt(j) <= 'Z') {
					str += words.get(i).charAt(j);
					map.put(str, list(map.get(str), words.get(i)));
				}
			}
		}
		boolean wordFound = false;
		for (Map.Entry<String, List<String>> it : map.entrySet()) {
			if (it.getKey().equals(pattern)) {
				wordFound = true;
				for (String s : it.getValue())
					System.out.print(s + "\n");
			}
		}
		if (!wordFound) {
			System.out.print("No match found");
		}
	}

	private static List<String> list(List<String> list, String str) {
		List<String> temp = new ArrayList<String>();
		if (list != null)
			temp.addAll(list);
		temp.add(str);
		return temp;
	}

	public static void main(String[] args) {
		String arr[] = { "Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab" };

		ArrayList<String> words = new ArrayList<String>(Arrays.asList(arr));
		String pattern = "HT";
		CamelCase(words, pattern);
	}
}
