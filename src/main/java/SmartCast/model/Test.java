/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcast.model;

import SmartCast.services.SmartCastEnums;
/**
 *
 * @author Walid
 */
public class Test {
	
	private static SmartCastEnums.TestType TEST_TYPE;
	private String test_ID;	
	private String title;
	private String passingScore;
	private String content_ID;
	//Set<Freelancer> FreelancerList = new HashSet<Freelancer>();

	public Test(String Test_ID, String Title, String content_ID, String passingScore, SmartCastEnums.TestType testType) {

		this.test_ID = Test_ID;
		this.title = Title;
		this.passingScore = passingScore;
		this.content_ID = content_ID;
		TEST_TYPE = testType;
	}
	public String getTest_ID() {
		return test_ID;
	}

	public void setTest_ID(String Test_ID) {
		this.test_ID = Test_ID;
	}

	public String getTitle() {
		return title;
	}

	public static SmartCastEnums.TestType getTEST_TYPE() {
		return TEST_TYPE;
	}

	public static void setTEST_TYPE(SmartCastEnums.TestType TEST_TYPE) {
		Test.TEST_TYPE = TEST_TYPE;
	}

	public String getContent_ID() {
		return content_ID;
	}

	public void setContent_ID(String content_ID) {
		this.content_ID = content_ID;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public String getPassingScore() {
		return passingScore;
	}

	public void setPassingScore(String passingScore) {
		this.passingScore = passingScore;
	}

	public String getContent() {
		return content_ID;
	}

	public void setContent(String content) {
		this.content_ID = content;
	}

}
