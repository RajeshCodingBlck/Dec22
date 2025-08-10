package DP2;

import java.util.HashMap;
import java.util.Objects;

class A{
	
	int val=12;

	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return val == other.val;
	}

	
	
}
public class HashMapWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1= new A();
		A obj2= new A();
		
		HashMap<A, Integer> hm= new HashMap();
		hm.put(obj1, 11);
		hm.put(obj2, 12);
		
		System.out.println(hm);
		
	}

}
