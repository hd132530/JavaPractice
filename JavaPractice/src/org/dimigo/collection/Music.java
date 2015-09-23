/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *        |_Music
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Music {
	private String title;
	private String Singer;
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		Singer = singer;
	}

	public final String getTitle() {
		return title;
	}
	
	public final void setTitle(String title) {
		this.title = title;
	}
	
	public final String getSinger() {
		return Singer;
	}
	
	public final void setSinger(String singer) {
		Singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", Singer=" + Singer + "]";
	}
	
	
}
