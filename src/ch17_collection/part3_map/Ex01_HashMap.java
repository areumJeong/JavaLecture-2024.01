package ch17_collection.part3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("사과", 1500); map.put("배", 2500); map.put("감", 1000);
		map.put("배", 3000);			// map 안에 key 값이 없으면 생성, 있으면 값 수정
		System.out.println(map);
		
		// 추출
		System.out.println(map.get("사과")); 		// key로 값 얻기
		
		// 정보 추출
		System.out.println(map.containsKey("배") + ", " + map.containsValue(4000));
		
		// key의 
	}

}
	