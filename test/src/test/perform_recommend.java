package test;

public class perform_recommend {
	List<PerformVO> perform = perform_service.performListByCategory(user.getUser_id());
	List<CardVO> card = card_service.cardList();
	Map<String, ArrayList<Integer>> card_performlist = new HashMap<String, ArrayList<Integer>>();
	Map<String, Integer> result = new HashMap<String, Integer>();
	
	ArrayList<Integer> user_perform = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0));
	
	for (PerformVO performVO : perform) {
		user_perform.set(performVO.getCategory_id()-1, performVO.getCategory_sum());
	}
	
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
		for (int i = 0; i < user_perform.size(); i++) {
			sum += (_.get(i)) * user_perform.get(i)*0.01;
		}
		result.put(key, sum);
	}
	
	List<Entry<String, Integer>> result1 = result.entrySet().stream()
	        .sorted(Map.Entry.comparingByValue())
	        .collect(Collectors.toList());
	
	Collections.reverse(result1);
	
	System.out.println(result1);
}
