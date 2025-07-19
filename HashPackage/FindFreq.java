package HashPackage;

import java.util.HashMap;

public class FindFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str="abaaacdaede";
		HashMap<Character, Integer> hm= new HashMap();
		
		for(int i=0;i<str.length();i++) {
			
			char ch =str.charAt(i);
			if(hm.containsKey(ch)==true) {
				
				int oldFre= hm.get(ch);
				hm.put(ch, oldFre+1);
			}else {
				hm.put(ch, 1);
			}
			
//			hm.put(ch, hm.getOrDefault(ch,0 )+1);
//			
//			int fre= hm.getOrDefault(ch, 0);
//			hm.put(ch, fre+1);
			
		}
		
		System.out.println(hm);
		
		
	}

}
