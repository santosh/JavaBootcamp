package dev.santoshk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
1. put(key, value)
2. get(key)
3. remove(key)
4. containsKey(key)
5. replace(key, value)
 */

public class HashMapTutorial {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        // need to add something
        hashmap.put("Nithin", 12345);
        hashmap.put("Sandeep", 98765);
        hashmap.put("UmaShankar", 24680);
        hashmap.put("Digesh", 13579);

        System.out.println("UmaShankar phone number is " + hashmap.get("UmaShankar"));
        hashmap.put("Digesh", 97531);
        hashmap.replace("Digesh", 975310);
        System.out.println("Digesh phone number is " + hashmap.get("Digesh"));
        if(hashmap.containsKey("Nithin")) {
            hashmap.remove("Nithin");
        }

        Set<String> keys = hashmap.keySet();
        for(String key: keys) {
            System.out.println(key + ":" + hashmap.get(key));
        }
    }
}