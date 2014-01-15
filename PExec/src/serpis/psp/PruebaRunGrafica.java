package serpis.psp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaRunGrafica {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaRunGrafica window = new PruebaRunGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PruebaRunGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTerminal = new JButton("Terminal");
		btnTerminal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				try{
					
					Runtime  aplicacion = Runtime.getRuntime(); 
					Process process = aplicacion.exec("/usr/bin/gnome-terminal");
										
					process.waitFor();
				}
		        catch(Exception e){}
					
					System.out.println("La aplicacion se ha cerrado");
											
			}
		});
		btnTerminal.setBounds(51, 75, 117, 25);
		frame.getContentPane().add(btnTerminal);
		
		JButton btnEditor = new JButton("Editor");
		btnEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					Runtime  aplicacion = Runtime.getRuntime(); 
					Process process = aplicacion.exec("/usr/bin/gnome-text-editor");
												
					process.waitFor();
				}
		        catch(Exception ex){}
					
					System.out.println("La aplicacion se ha cerrado");
				
			}
		});
		btnEditor.setBounds(206, 75, 117, 25);
		frame.getContentPane().add(btnEditor);
		
		JButton btnCalculadora = new JButton("Calculadora");
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					Runtime  aplicacion = Runtime.getRuntime(); 
					Process process = aplicacion.exec("/usr/bin/gnome-calculator");
										
					process.waitFor();
				}
		        catch(Exception exc){}
					
					System.out.println("La aplicacion se ha cerrado");
			}
		});
		btnCalculadora.setBounds(218, 164, 138, 25);
		frame.getContentPane().add(btnCalculadora);
		
		JButton btnNavegador = new JButton("Navegador");
		btnNavegador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					Runtime  aplicacion = Runtime.getRuntime(); 
					Process process = aplicacion.exec("/usr/bin/chromium-browser");
										
					process.waitFor();
				}
		        catch(Exception exce){}
					
					System.out.println("La aplicacion se ha cerrado");
				
			}
		});
		btnNavegador.setBounds(51, 164, 117, 25);
		frame.getContentPane().add(btnNavegador);
	}
}
