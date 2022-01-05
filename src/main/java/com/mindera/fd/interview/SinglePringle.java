package com.mindera.fd.interview;

public class SinglePringle {

	public static int Instances = 0;
	private int count = 0;

	public SinglePringle() {
		SinglePringle.Instances++;
	}

	public int getCount() {
		return count;
	}

	public void incrementCount() {
		count++;
	}
}
