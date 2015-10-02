/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *        |_MelonGenreChart
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 30.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List <Music>> map = new HashMap<String, List <Music>>();
		List<Music> ballad = new ArrayList<Music>();
		
		ballad.add(new Music("내 첫사랑","베리굿"));
		ballad.add(new Music("또다시 사랑","임창정"));
		ballad.add(new Music("지우고 지워도","차수경"));
		
		List<Music> dance = new ArrayList();
		
		dance.add(new Music("커피", "유자환, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		System.out.println("----<<メーロンーザンル別チャート>>----");
		printMap(map);
		
		System.out.println("----<<バラドー３位曲変更>>----");
		ballad.set(2,  new Music("지우고 지워도", "차수경"));
		map.put("발라드", ballad);
		printMap(map);
		
		System.out.println("----<<バラドー１位曲削除>>----");
		ballad.remove(0);
		map.put("발라드", ballad);
		printMap(map);
		
		System.out.println("----<<全体のリストー削除する>>----");
		map.clear();
		printMap(map);
		
		
	}
	
	public static void printMap(Map map) {
		Map<String, List<Music>> ma = map;
		for(String s : ma.keySet()) {
			int i=1;
			System.out.println("[" + s + "]");
			for(Music m : ma.get(s))
				System.out.println((i++) + ". " + m.toString());
		}
		System.out.println();
	}

}
