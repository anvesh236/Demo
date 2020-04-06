package HashMap1;

import org.apache.commons.collections4.map.HashedMap;

public class Data {
	
	public static  HashedMap<String, String> getUserLogin() {
		
		HashedMap<String, String> userMap=new HashedMap<String, String>();
		
		userMap.put("lab1", "qaplanet1");
		userMap.put("anil", "qaplanet2_lab2");    // splitmethode    qaplanet2[0], lab2[1]
		userMap.put("lab3", "qaplanet3");
		 
		return userMap;
	}

}
