package visao;

import java.awt.event.*;
import javax.swing.*;
import visao.Tela;

public class Menu extends JFrame implements ActionListener {
                            
   private JMenuBar jmPrincipal = new JMenuBar();

   private JMenu jmCadastro = new JMenu("Cadastros");
   private JMenu jmRelatorio = new JMenu("Relat�rio");

   private JMenuItem jmCadGenerico = new JMenuItem("Ve�culo gen�rico");
   private JMenuItem jmCadEsportivo = new JMenuItem("Ve�culo esportivo");
   private JMenuItem jmCadUtilitario = new JMenuItem("Ve�culo utilit�rio");

   public  JDesktopPane jdPane = new JDesktopPane();

   Tela telaCadGenerico, telaCadEsportivo, telaCadUtilitario;
   
   public Menu() {

	   getContentPane().add(jdPane);

	   jmPrincipal.add(jmCadastro);
	   jmPrincipal.add(jmRelatorio);

	   jmCadastro.add(jmCadGenerico);
	   jmCadastro.add(jmCadEsportivo);
	   jmCadastro.add(jmCadUtilitario);

	   setJMenuBar(jmPrincipal);

	   jmCadGenerico.addActionListener(this);
	   jmCadEsportivo.addActionListener(this);
	   jmCadUtilitario.addActionListener(this);
	   jmRelatorio.addActionListener(this);
	   
	   setSize(800,600);
	   setVisible(true);
	}


   public static void main(String args[]) {
      Menu menu = new Menu();
   }

   public void actionPerformed(ActionEvent evt) {
	   if (evt.getSource() == jmCadGenerico) {
	      //se n�o for null, a tela j� est� vis�vel, tendo apenas que ser "levada pra frente"
	      if (telaCadGenerico == null){
	         telaCadGenerico = new Tela("Cadastro gen�rico de ve�culos ", this);
	      }
	      jdPane.moveToFront(telaCadGenerico);
	   }

	   if (evt.getSource() == jmCadEsportivo) {
	      if (telaCadEsportivo == null){
	         telaCadEsportivo = new Tela("Cadastro de ve�culos esportivos", this);
	      }
	      jdPane.moveToFront(telaCadEsportivo);
	   }	
	
	   if (evt.getSource() == jmCadUtilitario) {
		  if (telaCadUtilitario == null){
			  telaCadUtilitario = new Tela("Cadastro de ve�culos utilit�rios", this);
		  }
		  jdPane.moveToFront(telaCadUtilitario);
	   }
	   
   }
}