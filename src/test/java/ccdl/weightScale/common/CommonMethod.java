package ccdl.weightScale.common;

import ccdl.weightScale.drivers.BaseDriver;

public class CommonMethod extends BaseDriver {
	public static void timeout() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
}
}
