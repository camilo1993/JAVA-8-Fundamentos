/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_procesador;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author Kmilo
 */
public class Menu_procesador {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoProcesador marco1=new MarcoProcesador();
		marco1.setVisible(true);
			
		}
	}

class MarcoProcesador extends JFrame{
	
	public MarcoProcesador(){
		
		setBounds(400,200,550,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mi procesador de texto");
		add(new LaminaProcesador());
	}
}

class LaminaProcesador extends JPanel{
	
	private JTextPane areaTexto;
	private JPanel laminaMenu;
	private JMenuBar barraMenu;
	private JMenu fuente, estilo, tamagno;
	private Font letras;
	
	public LaminaProcesador(){
		
		setLayout(new BorderLayout());
		laminaMenu = new JPanel();
		add(laminaMenu, BorderLayout.NORTH);
		areaTexto= new JTextPane();
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));
		add(areaTexto, BorderLayout.CENTER);
		
		barraMenu = new JMenuBar();
		laminaMenu.add(barraMenu);
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tamaño");
		
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tamagno);
		
		configuraMenu("Arial","fuente", 10);
		configuraMenu("Courier","fuente", 10);
		configuraMenu("Verdana","fuente", 10);
		configuraMenu("Negrita","estilo", Font.BOLD);
		configuraMenu("Cursiva","estilo", Font.ITALIC);
		configuraMenu("12","tamagno", 12);
		configuraMenu("16","tamagno", 16);
		configuraMenu("20","tamagno", 20);
		configuraMenu("24","tamagno", 24);
		
		letras = areaTexto.getFont();
	}
	
	public void configuraMenu(String rotulo, String menu, int val){
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		if(menu=="fuente"){
			fuente.add(elem_menu);
		}else if(menu=="estilo"){
			estilo.add(elem_menu);
		}else if(menu=="tamagno"){
			tamagno.add(elem_menu);
		}

		elem_menu.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(menu=="fuente"){
					
					letras = new Font(rotulo, letras.getStyle(), letras.getSize());
				}
				else if (menu=="estilo"){
					
						if((letras.getStyle()+val)>Font.BOLD+Font.ITALIC || (letras.getStyle()==val)){
							
							letras=letras.deriveFont(letras.getStyle()-val);
						}else{
							
							letras=letras.deriveFont(letras.getStyle()+val);
						}
					}
				 
				else if (menu=="tamagno"){ 
					
					float tam2 = val;
					letras=letras.deriveFont(tam2);
				}
				
				areaTexto.setFont(letras);
			}
		});
	}
} 