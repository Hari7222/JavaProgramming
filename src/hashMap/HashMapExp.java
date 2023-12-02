package hashMap;
import java.util.HashMap;
public class HashMapExp {
	static boolean answer=false;
	
	public static void main(String[] args) {
		HashMap<String, String> hashMap=new HashMap<String, String>();
		HashMap<String, String> h=new HashMap<String, String>();
		hashMap.put("Name", "HAri");
		hashMap.put("Age", "29");
		hashMap.put("Gender", "Female");
		hashMap.put("Spouse", "AMN");
		h.put("Name", "HAri");
		h.put("Age", "29");
		h.put("Gender", "Female");
		h.put("Spouse", "AMN");
		
		System.out.println(hashMap.get("Name"));
		System.out.println(hashMap.get("Age"));
		System.out.println(hashMap.get("Gender"));
		System.out.println(hashMap.get("Spouse"));
		System.out.println("Equals: "+hashMap.equals(h));
		
		System.out.println("Size:"+hashMap.size());
		System.out.println("Clone:"+hashMap.clone());
		System.out.println("Contains: "+hashMap.containsKey("Spouse"));
		System.out.println("Compute: "+hashMap.compute("Name",(key,value)->value.concat("Priya")));
		System.out.println("Contains value: "+hashMap.containsValue("290"));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.entrySet());
		System.out.println(hashMap.getOrDefault("Age", "29"));
		System.out.println(hashMap.putIfAbsent("777", "Jade"));
		System.out.println(hashMap.computeIfAbsent("City", k-> "Coimbatore"));
		System.out.println("Empty:"+hashMap.isEmpty());
		//System.out.println("Merge:"+hashMap.merge(null, null, null));
		System.out.println(hashMap.entrySet());
		System.out.println("Equals: "+hashMap.equals(h));
		String search="Name";
		hashMap.forEach((key, value)->{
			if(key.contains(search)||value.contains(search)) {
				answer=true;
			}
		} );
		System.out.println(search+ " contains "+answer);
		hashMap.clear();
		System.out.println("Entry"+hashMap.entrySet());
		System.out.println("Empty:"+hashMap.isEmpty());
		
		
		//hashMap.
		
	}

}
