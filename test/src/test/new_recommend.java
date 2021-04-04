package test;

public class new_recommend {
	List<PerformVO> perform = perform_service.performListByCategory(user.getUser_id());
	List<CardVO> card = card_service.cardList();
	Map<String, ArrayList<Integer>> card_performlist = new HashMap<String, ArrayList<Integer>>();
	Map<String, Integer> result_benefit = new HashMap<String, Integer>();
	
	ArrayList<Integer> user_benefit = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0));
	
	if(user.getBenefit1()==0) {

	}else {
		user_benefit.set(user.getBenefit1()-1,15);
	}
	if(user.getBenefit2()==0) {
		
	}else {
		user_benefit.set(user.getBenefit2()-1,9);
	}
	if(user.getBenefit3()==0) {
		
	}else {
		user_benefit.set(user.getBenefit3()-1,6);
	}
	System.out.println(user_benefit);
	
	for (CardVO i : card) {
		
		ArrayList<Integer> card1 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0));
		
		if(i.getBenefit1()==0) {
			
		}else {
			card1.set(i.getBenefit1()-1, i.getBenefit1_grade());
		}
		
		if(i.getBenefit2()==0) {
			
		}else {
			card1.set(i.getBenefit2()-1, i.getBenefit2_grade());
		}
		
		if(i.getBenefit3()==0) {
			
		}else {
			card1.set(i.getBenefit3()-1, i.getBenefit2_grade());
		}
		
		if(i.getBenefit4()==0) {
			
		}else {
			card1.set(i.getBenefit4()-1, i.getBenefit2_grade());
		}
		
		if(i.getBenefit5()==0) {
			
		}else {
			card1.set(i.getBenefit5()-1, i.getBenefit2_grade());
		}
		
		card_performlist.put(i.getCard_name(), card1);
	}
	System.out.println(card_performlist);
	
	for (String key : card_performlist.keySet()) {
		int sum = 0;
		ArrayList<Integer> _ = card_performlist.get(key);
		for (int i = 0; i < user_benefit.size(); i++) {
			sum += (_.get(i)) * user_benefit.get(i)*0.01;
		}
		result_benefit.put(key, sum);
	}
	
	List<Entry<String, Integer>> result2 = result_benefit.entrySet().stream()
	        .sorted(Map.Entry.comparingByValue())
	        .collect(Collectors.toList());
	
	Collections.reverse(result2);

	System.out.println(result2.subList(0,3));
}
