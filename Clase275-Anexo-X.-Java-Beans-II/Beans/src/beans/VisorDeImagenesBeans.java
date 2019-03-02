package beans;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class VisorDeImagenesBeans extends JLabel {

	public VisorDeImagenesBeans() {

		setBorder(BorderFactory.createEtchedBorder());

	}

	public void setEScogeImagen(String elegirImagen) {

		try {

			archivo = new File(elegirImagen);

			setIcon(new ImageIcon(ImageIO.read(archivo)));

		} catch (IOException e) {

			archivo = null;

			setIcon(null);

		}

	}

	public String getEscogeImagen() {

		if (archivo == null)
			return null;
		else
			return archivo.getAbsolutePath();

	}

	public Dimension getPreferredSize() {

		return new Dimension(600, 400);

	}

	private File archivo = null;

}
