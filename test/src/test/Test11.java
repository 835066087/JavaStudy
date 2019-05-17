package test;

import java.util.Arrays;
import java.util.HashMap; 
import java.util.List; 
import java.util.Map.Entry;
import java.util.Set;


public class Test11 {
	public static void main(String[] args) {
		HashMap<String,List<String>> map = new HashMap<String,List<String>>();
		map.put("北京市", Arrays.asList("北京市"));
		map.put("海南省", Arrays.asList("海口市","三亚市"));
		map.put("浙江省", Arrays.asList("金华","舟山","丽水","绍兴","温州"));
		
		Set<Entry<String,List<String>>> entry = map.entrySet();
				for(Entry<String,List<String>> entry1 : entry) {
					System.out.println(entry1.getKey());
						List<String> value = entry1.getValue();
						for(String string : value) {
							System.out.println(string);
					}

		}
		
	}
}
