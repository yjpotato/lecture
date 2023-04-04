package chap20_lambda;

import chap20_lambda.clazz.UpperCaseInter;

import java.util.ArrayList;
import java.util.List;

public class _06_referParamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(String :: toUpperCase);

	}
	List<String> a = new ArrayList<>();
	
	public static void action(UpperCaseInter uci) {
		String result = 
				uci.allUpperCase("bit");//toUpperCase 하나만 가능
		
		System.out.println(result);
	}

	public static void abc(String str) {
		String result =
				str.toUpperCase();

		str.toUpperCase();
	}

}

