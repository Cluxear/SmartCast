/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCast.services;

import SmartCast.services.SmartCastEnums.TestType;
import smartcast.model.Test;

/**
 *
 * @author Walid
 */
public class ServiceImpl {
	
	public static void main(String[] args){
		TestServices t = new TestServices();
		System.out.println(TestType.QCM);
		t.add(new Test("0", "java", "50","2",TestType.QCM ));
		
	}
}
