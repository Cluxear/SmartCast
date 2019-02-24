/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCast.model;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Walid
 */
class Question {
	private int number;
	private String question;

	public Question(int number, String question) {
		this.number = number;
		this.question = question;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
