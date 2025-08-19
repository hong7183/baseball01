package com.myspring.baseball.vo;

import org.springframework.stereotype.Component;

@Component("baseballVO")
public class baseballVO {

	private int player_id;
	private String player_name;
	private String position;
	private String bd_date;
	private int height;
	private int weight;
	private String trophy;
	private int salary;
	private String down_payment;
	private String Contract_period;

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBd_date() {
		return bd_date;
	}

	public void setBd_date(String bd_date) {
		this.bd_date = bd_date;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getTrophy() {
		return trophy;
	}

	public void setTrophy(String trophy) {
		this.trophy = trophy;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDown_payment() {
		return down_payment;
	}

	public void setDown_payment(String down_payment) {
		this.down_payment = down_payment;
	}

	public String getContract_period() {
		return Contract_period;
	}

	public void setContract_period(String contract_period) {
		Contract_period = contract_period;
	}

}
