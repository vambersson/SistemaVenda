package util;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aparencia {
	
	
	public static void setAparencia(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

}
