package StringDemo;

public class FrequencyCountOfAllCharacter {

	public static void getFre(String str) {
		
		int [] arr= new int[256];
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			int ascii= ch;
			arr[ascii]++;
//			arr[str.charAt(i)]++;
		}
		
		for(int i=0; i<256;i++) {
			if(arr[i]>0) {
				int ascii= i;
				char ch =(char)ascii;
				System.out.println(ch + " -> " + arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str= "abbabbcdddaaa";
          getFre(str);
	}

}
