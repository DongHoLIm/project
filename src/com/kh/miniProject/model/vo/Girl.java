package com.kh.miniProject.model.vo;

public class Girl {
	private String name;  //�̸�
	private int age;   	//����
	private char gender;  //����
	private String charactor;  //����
	private String signature;  //Ư¡
	private String image;  //�̹������� ���
	private int glovePer;  //������ ������
	private int mylovePer; //���� ������
	
	
	public Girl() {}

	public Girl(String name, int age, char gender, String charactor, String signature,String image,int glovePer, int mylovePer) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.charactor = charactor;
		this.signature = signature;
		this.image = image;
		this.glovePer = glovePer;
		this.mylovePer = mylovePer;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCharactor() {
		return charactor;
	}

	public void setCharactor(String charactor) {
		this.charactor = charactor;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public int getGlovePer() {
		return glovePer;
	}

	public void setGlovePer(int glovePer) {
		this.glovePer = glovePer;
	}

	public int getMylovePer() {
		return mylovePer;
	}

	public void setMylovePer(int mylovePer) {
		this.mylovePer = mylovePer;
	}
	

	

}
