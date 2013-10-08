/**************************************************
 * Filename: UserInfo.java
 * Version: v1.0
 * CreatedDate: 2011-11-27
 * Copyright (C) 2011 By cafebabe.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses/.
 *
 * If you would like to negotiate alternate licensing terms, you may do
 * so by contacting the author: talentyao@foxmail.com
 ***************************************************/

package com.ywh.train.bean;

import java.io.Serializable;



/**
 * 用户信息
 * 
 * @author cafebabe
 * @since 2011-11-27
 * @version 1.0
 */
public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3546300109240864706L;
	/**字段注释*/
	
	// 乘车人信息
	private String cardType = "1"; // 证件类型
	private String ID;//证件号码
	private String name;//姓名
	private String phone;//手机号码
	
	private String 	tickType = "1"; // 车票类型,成人
	
	/**
	 * 座位类型
	 */
	private String seatType = "1";
	
	/**
	 * 卧铺类型
	 */
	private String sleepSeatType = "0";
	
	/**
	 * @return Returns the iD.
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD The iD to set.
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the phone.
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone The phone to set.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	/**
	 * @return Returns the tickType.
	 */
	public String getTickType() {
		return tickType;
	}

	/**
	 * @param tickType The tickType to set.
	 */
	public void setTickType(String tickType) {
		this.tickType = tickType;
	}

	/**
	 * @return Returns the cardType.
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType The cardType to set.
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getText() {
		StringBuilder builder = new StringBuilder()
			.append(seatType).append(",")
			.append(sleepSeatType).append(",").append(tickType).append(",")
			.append(getSimpleText()).append(",").append(phone).append(",N");
		return builder.toString();
	}
	
	public String getSimpleText() {
		StringBuilder builder = new StringBuilder();
		builder.append(name).append(",").append(cardType)
		.append(",").append(ID);
		return builder.toString();
	}
	


	/**
	 * override 方法
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserInfo [ID=").append(ID).append(", name=")
				.append(name).append(", phone=").append(phone)
				.append(", seatType=").append(", tickType=").append(tickType).append(", cardType=")
				.append(cardType).append(", idMode=")
				.append("]");
		return builder.toString();
	}

	

}
