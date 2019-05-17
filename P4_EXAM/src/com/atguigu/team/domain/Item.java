package com.atguigu.team.domain;

public class Item {

	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private char answer;

	public Item() {
		super();
	}

	public Item(String question, String optionA, String optionB, String optionC, String optionD, char answer) {
		super();
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return question + "\n" + optionA + "\n" + optionB + "\n" + optionC + "\n" + optionD;
	}

}
