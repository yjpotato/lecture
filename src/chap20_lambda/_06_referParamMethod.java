package chap20_lambda;

import chap20_lambda.clazz.UpperCaseInter;

public class _06_referParamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(String :: toUpperCase);
	}
	
	public static void action(UpperCaseInter uci) {
		String result = 
				uci.allUpperCase("bit");//toUpperCase 하나만 가능
		
		System.out.println(result);
	}
}

