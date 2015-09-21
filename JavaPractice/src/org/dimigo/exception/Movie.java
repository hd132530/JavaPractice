/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *        |_Movie
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 21.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limit;

	public Movie(String title, int limit) {
		this.title = title;
		this.limit = limit;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLimit() {
		return limit;
	}

}
