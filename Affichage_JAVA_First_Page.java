package methodo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Affichage_JAVA_First_Page {

	private JFrame frame;
	private JTextField txtFSaisie;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affichage_JAVA_First_Page window = new Affichage_JAVA_First_Page();
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
	public Affichage_JAVA_First_Page() {
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
		
		txtFSaisie = new JTextField();
		txtFSaisie.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		txtFSaisie.setBounds(369, 51, 86, 20);
		frame.getContentPane().add(txtFSaisie);
		txtFSaisie.setColumns(10);
		
		JButton btnSquare = new JButton("Carr\u00E9 parfait");
		btnSquare.setAction(action);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSquare.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		btnSquare.setBounds(45, 128, 198, 87);
		frame.getContentPane().add(btnSquare);
		
		JButton btnPremier = new JButton("Nombre premier");
		btnPremier.setAction(action_1);
		btnPremier.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		btnPremier.setBounds(370, 128, 198, 87);
		frame.getContentPane().add(btnPremier);
		
		JLabel lblExplications = new JLabel("Choisir la quantin\u00E9 N premier d\u00E9sir\u00E9 :");
		lblExplications.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblExplications.setBounds(98, 46, 253, 28);
		frame.getContentPane().add(lblExplications);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Carré parfait");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			/*Code carré parfait*/
		}
		
	}
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Nombre premier");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			/*Code nombre premier*/
		}
		
	}
}
