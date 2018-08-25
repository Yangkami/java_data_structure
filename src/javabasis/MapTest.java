package javabasis;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map= new HashMap();
		map.put("ss","adsf");
		map.put("adf","asdfadfasdf");

		Set keys=map.keySet();
		for(Object key:keys){
			System.out.println("key:"+key+" value:"+map.get(key));
		}
	}

}
