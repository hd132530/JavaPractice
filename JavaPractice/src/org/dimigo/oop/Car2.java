/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Car
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Car2 {
	private String company;
	private String model;
	private String colur;
	private int maxSpeed;
	private int price;
	
	public Car2() {
		
	}
	
	public Car2(String newCompany, String newModel, 
			String newColur, int newMaxSpeed, int newPrice){			
			company = newCompany;
			model = newModel;
			colur = newColur;
			maxSpeed = newMaxSpeed;
			price = newPrice;
			
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColur(){
		return colur;
	}
	public int getMaxspeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
// 이하 생략
//	public void setCompany(String newCompany){
//		company = newCompany;
//	}
//	public void setModel(String newModel){
//		model = newModel;
//	}
//	public void setColur(String newColur){
//		colur = newColur;
//	}
//	public void setMaxspeed(int newMaxspeed){
//		if(newMaxspeed > 0)
//		maxSpeed = newMaxspeed;
//	}
//	public void setPrice(int newPrice){
//		if(newPrice > 0)
//		price = newPrice;
//	}
}

