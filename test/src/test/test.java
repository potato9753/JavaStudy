package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();
		ArrayList<Integer> list3 = new ArrayList();
		Map<String, Integer> result = new HashMap<String, Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
	
		list1.add(11);
		list1.add(22);
		list1.add(32);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		user a = new user(list);
		card b = new card(list1);
		card b1 = new card(list2);
		card b2 = new card(list3);
		
		HashMap<String, user> perform= new HashMap<String, user>();
		HashMap<String, card> benefit= new HashMap<String, card>();
		
		perform.put("man1", a);
		
		benefit.put("card1",b);
		benefit.put("card2",b1);
		benefit.put("card3",b2);
		
		System.out.println(list);
		System.out.println(perform);
		System.out.println(benefit);
		System.out.println("------------------------");
		
		for (String key : benefit.keySet()) {
			int sum = 0;
			ArrayList<Integer> aa = (benefit.get(key)).getCard1();
			for (int i = 0; i < list.size(); i++) {
				sum += (aa.get(i)) * list.get(i);
			}
			System.out.println(key+"\t"+"혜택금액"+"\t"+sum);
			result.put(key, sum);
		}
		System.out.println(result);
		
		List<String> result1 = new ArrayList<>(result.keySet());
		
		result1.sort((o1, o2) -> result.get(o2) - result.get(o1));
		
		for (String key : result1) {
            System.out.println(String.format("Key : %s, Value : %s", key, result.get(key)));
        }
		
		System.out.println(result1);
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 4;
		Random random = new Random();
		String card_num_rand = "";
		for(int i=0;i<4;i++) {
			String generatedString = random.ints(leftLimit, rightLimit + 1)
		        .limit(targetStringLength)
		        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		        .toString();
			if(i!=3) {
				card_num_rand += generatedString+'-';
			}
			else {
				card_num_rand += generatedString;
			}
		}
		System.out.println(card_num_rand);
	}
	
}
