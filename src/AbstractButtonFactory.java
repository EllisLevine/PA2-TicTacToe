import java.awt.Color;

import javax.swing.JButton;

public abstract class AbstractButtonFactory {
	
	public static JButton getButtonFactory(ButtonType bt) {
		JButton btnFact = null;
		switch (bt) {
		case WINTER:
			btnFact = new JButton();
			btnFact.setBackground(new Color(59,89,182));
			btnFact.setForeground(Color.WHITE);
			btnFact.setFocusPainted(false);
			break;
		case SUMMER: 
			btnFact = new JButton();
			btnFact = new JButton();
			btnFact.setBackground(new Color(50,205,50));
			btnFact.setForeground(Color.WHITE);
			btnFact.setFocusPainted(false);
		default:
			System.out.println("ERROR");
		}
		System.out.println("returned");
		return btnFact;
	}

}
