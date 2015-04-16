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
public class Car3 {
	private String company;
	private String model;
	private String colur;
	private int maxSpeed;
	private int price;
	
	public Car3() {
		
	}
	
	public Car3(String company, String model, 
			String colur, int maxSpeed, int price){			
			this.company = company;
			this.model = model;
			this.colur = colur;
			this.maxSpeed = maxSpeed;
			this.price = price;
	}
	public Car3(String company, String model, 
			String colur, int maxSpeed){			
			this.company = company;
			this.model = model;
			this.colur = colur;
			this.maxSpeed = maxSpeed;
	}
	public Car3(String company, String model, 
			String colur){			
			this.company = company;
			this.model = model;
			this.colur = colur;
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

