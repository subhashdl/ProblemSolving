package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"eat", "tea", "tan", "ate", "nat", "bat"};
		// iterate via loop
		// use hashmap and fill with the keys
		// finally get all values
		HashMap<String,List> map = new HashMap<>();
		for(int i=0; i<str.length; i++) {
			char[] charArray =str[i].toCharArray(); 
			Arrays.sort(charArray);
			String newString = new String(charArray);
			if(map.containsKey(newString)) {
				List<String> l = map.get(newString);
				l.add(str[i]);
				map.put(newString,l);
			}else {
				List<String> l = new ArrayList<String>();
				l.add(str[i]);
				map.put(newString, l);
			}
		}
		
		System.out.println(map.values());
	}
	

}
