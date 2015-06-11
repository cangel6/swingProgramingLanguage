package com.swing.test;

import com.swing.interprinter.SwingInterprinter;

public class test {
	public static void main(String[] args)
	{
		String helloWorld = "이 언어는 각하의 언어를 미려하고 자연스러움과 제대로 구현하게 되고 그 마음을 알고 이제는 무엇을 해야 되는지 그 말을 다시 여기서 생각한다. "
				+ "그것이 발전하게 되었고, 더 배우게 되었고, 또 자연스럽게 사용함을 알 수 있다고 생각한다. "
				+ "새로운 언어와 그 익숙함은 우리의 발전에 더 큰 도움과 지혜로 다가오게 되고 이제는 그 언어를 이용함에 있어 이해하게 되고 좀 더 알게 되고 무언가를 다시 느낄 것이라 생각한다. "
				+ "이 언어가 언제 어떻게 되고 누가 사용될 지는 이제 생각된다. "
				+ "새로운 것은 여러 사람에게 발전되어 가고 넓어질 거라 생각한다. "
				+ "이 언어를 사용함도 아직 익숙하게 사용 못하게 되어도 앞으로는 익숙하게 누군가가 알게 된다고 생각한다. "
				+ "그것이 언제라도 가능 할 것을 믿게 되고 그 것이 우리의 목표라 생각된다. "
				+ "그것이 생각하게 되었고, 우주가 나서서 도와준다고 생각한다. "
				+ "새로운 언어를 이제 알게 되었고 매우 기쁘다고 생각한다. "
				+ "그것을 사용하여 국가에 도움이 되도록 하는 것이 프로그래머라 생각한다. "
				+ "그래서 인터프린터와 코드는 해체하게 되고 그 과정에 국민 여러분께 진심으로 죄송하다고 생각한다.";
		SwingInterprinter interPrinter = new SwingInterprinter();
		interPrinter.interPrinting(helloWorld);
	}
}
