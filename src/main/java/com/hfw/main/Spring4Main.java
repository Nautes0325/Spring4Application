package com.hfw.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Spring4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("test1");
		hashSet.add("test2");
		
		Iterator<String> iter = hashSet.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		Set<Entry<String,String>> entrySets = map.entrySet();
		
		for(Entry<String,String> entrySet : entrySets ) {
			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
		}
		
		Iterator<Entry<String,String>> iter2 = entrySets.iterator();
		
		while(iter2.hasNext()) {
			Entry<String,String> entrySet = iter2.next();
			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
		}
		
		
	}

}
