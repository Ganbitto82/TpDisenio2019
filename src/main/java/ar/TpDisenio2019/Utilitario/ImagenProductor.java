package ar.TpDisenio2019.Utilitario;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImagenProductor extends javax.swing.JPanel {

	/**
	* 
	*/
	private static final long serialVersionUID = 000004;

	public ImagenProductor() {
		this.setSize(774, 574);
	}

	public void paint(Graphics grafico) {
		Dimension height = getSize();
		ImageIcon Img = new ImageIcon(getClass().getResource("/Utilitario/Imagenes/caricatura.png"));

		grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

		setOpaque(false);
		super.paintComponent(grafico);
	}
}
