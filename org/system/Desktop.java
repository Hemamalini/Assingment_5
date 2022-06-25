package org.system;
//single inheritance
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size is 32inch");
	}
	public static void main(String[] args) {
		Desktop desktopObject = new Desktop();
		desktopObject.desktopSize();
		desktopObject.computerModel();
		
	}
}
