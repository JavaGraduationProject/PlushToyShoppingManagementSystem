package com.soft.admin.domain;

import com.soft.common.domain.BaseDomain;

public class Member extends BaseDomain {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 935450826788987376L;
	private int user_id; // 
	private String user_name; // 
	private String user_pass; // 
	private String real_name; // 
	private int user_sex; // 1：男  2：女
	private String nick_name; // 
	private String user_address;
	private String user_mail; // 
	private String user_phone; //
	private int user_credit;
	private int member_type_id;
private String reg_date; // 

	private String member_type_name;
	private double member_discard; // 
	private String user_passOld; // 
	private String ids; //  
	private String random;

	public String getUser_sexDesc(){
		switch (user_sex) {
		case 1:
			return "男";
		case 2:
			return "女";
		default:
			return "男";
		}
	}
	
	public void setUser_id(int user_id){
		this.user_id=user_id;
	}

	public int getUser_id(){
		return user_id;
	}

	public void setUser_name(String user_name){
		this.user_name=user_name;
	}

	public String getUser_name(){
		return user_name;
	}

	public void setUser_pass(String user_pass){
		this.user_pass=user_pass;
	}

	public String getUser_pass(){
		return user_pass;
	}

	public void setUser_mail(String user_mail){
		this.user_mail=user_mail;
	}

	public String getUser_mail(){
		return user_mail;
	}

	public void setReal_name(String real_name){
		this.real_name=real_name;
	}

	public String getReal_name(){
		return real_name;
	}

	public void setUser_sex(int user_sex){
		this.user_sex=user_sex;
	}

	public int getUser_sex(){
		return user_sex;
	}

	public void setReg_date(String reg_date){
	this.reg_date=reg_date;
	}

	public String getReg_date(){
		return reg_date;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public int getUser_credit() {
	return user_credit;
	}

	public void setUser_credit(int user_credit) {
		this.user_credit = user_credit;
	}

	public int getMember_type_id() {
	return member_type_id;
	}

	public void setMember_type_id(int member_type_id) {
//		this.member_type_id = member_type_id;
	}

	public String getMember_type_name() {
		return member_type_name;
	}

	public void setMember_type_name(String member_type_name) {
		this.member_type_name = member_type_name;
	}

	public double getMember_discard() {
		return member_discard;
	}

	public void setMember_discard(double member_discard) {
		this.member_discard = member_discard;
	}

	public String getUser_passOld() {
		return user_passOld;
	}

	public void setUser_passOld(String user_passOld) {
		this.user_passOld = user_passOld;
	}

}
