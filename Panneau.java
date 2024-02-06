package cytcy.graph.be;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	public void paintComponent(Graphics g) {
//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		//System.out.println("Je suis exécutée !");
//		g.fillOval(20, 20, 75, 75);
//		int x1 = this.getWidth()/4;
//		int y1 = this.getHeight()/4;
//		//g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
//		g.drawRect(10, 10, 50, 60);
//		g.fillRect(400, 65, 30, 40);
//		g.drawRoundRect(100, 100, 30, 50, 10, 10);
//		g.fillRoundRect(500, 500, 55, 55, 100, 100);
//		g.drawLine(0, 0, this.getWidth(), this.getHeight());
//		g.drawLine(0, this.getHeight(), this.getWidth(), 0);
//		g.drawLine(100, 100, 250, 250);
		g.setColor(new Color(255, 2, 2));
		g.fillOval(150, 150, 50, 50);
		g.fillOval(250, 150, 50, 50);
		g.fillOval(240, 110, 10, 10);
		//RED
		g.setColor(new Color(255, 2, 2));
		g.fillRoundRect(185, 105, 22, 12, 15, 10);
		//BLEU
		g.setColor(new Color(2, 2, 255));
		//g.drawArc(175, 175, 100, 10, 15, 150);
		g.drawLine(215, 185, 250, 125);
		//VERT
		g.setColor(new Color(2, 255, 2));
		g.drawLine(245, 115, 275, 175);
		//ROSE
		g.setColor(new Color(255, 2, 255));
		g.drawLine(200, 115, 215, 185);
		//CYAN
		g.setColor(new Color(2, 150, 150));
		g.drawLine(205, 135, 250, 125);
		//ROSEYY
		g.setColor(new Color(150, 2, 150));
		g.drawLine(215, 185, 175, 175);
		//ROSEYY
		g.setColor(new Color(150, 2, 150));
		g.drawLine(175, 175, 205, 135);
		

	}
}
