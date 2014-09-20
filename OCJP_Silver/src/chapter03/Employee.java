package chapter03;

import java.io.Serializable;

public class Employee implements Serializable {

	private int piyo;
	private String hoge;
	public Employee(int tmp1, String tmp2) {
		piyo = tmp1;
		hoge = tmp2;
	}

	public int getPiyo(){
		return piyo;
	}

	public String getHoge(){
		return hoge;
	}
}
