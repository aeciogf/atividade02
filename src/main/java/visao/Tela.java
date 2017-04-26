package visao;

import javax.swing.JInternalFrame;

class Tela extends JInternalFrame {

	   private Menu telaPrincipal;

	   public Tela(String titulo, Menu telaPrincipal) {
	
		  super(titulo,true,true,true,true);

	      setSize(760,520);
	      setVisible(true);

	      this.telaPrincipal = telaPrincipal;

	      telaPrincipal.jdPane.add(this);
	   }

	}