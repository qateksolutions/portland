package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public void addHashMapValue() {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("IE", "Internet Explorer");
        hmap.put("CHROME", "Google Chrome");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("Safari", "Mac Browser");

        //System.out.println("Browser Name: " + hmap.get("Safari"));

        for (Map.Entry map : hmap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }

    public void validateHashMapKey() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vishal", 10);
        hashMap.put("Sachin", 30);
        hashMap.put("Vaibhav", 20);
        System.out.println(hashMap);
        System.out.println("Size of the map is: " + hashMap.size());

        if (hashMap.containsKey("Vishal")) {
            System.out.println("Age is: " + hashMap.get("Vishal"));
        } else {
            System.out.println("The key does not exist");
        }
    }

}
