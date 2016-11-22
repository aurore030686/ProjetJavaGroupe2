package methodo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Affichage_JAVA_End_Page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affichage_JAVA_End_Page window = new Affichage_JAVA_End_Page();
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
	public Affichage_JAVA_End_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblResultat = new JLabel("Les N premiers r\u00E9sultats sont:");
		lblResultat.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblResultat.setBounds(31, 64, 299, 28);
		frame.getContentPane().add(lblResultat);
		
		JTextArea txtAResultat = new JTextArea();
		txtAResultat.setEditable(false);
		txtAResultat.setBounds(350, 64, 154, 201);
		frame.getContentPane().add(txtAResultat);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setBounds(456, 300, 127, 51);
		frame.getContentPane().add(btnBack);
	}

}
