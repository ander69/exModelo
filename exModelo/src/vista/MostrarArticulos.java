package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Control;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;

public class MostrarArticulos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	Control control = Control.getInstace();

	/**
	 * Create the dialog.
	 */
	public MostrarArticulos() {

		setBounds(100, 100, 653, 443);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMostrarArticulos = new JLabel("MOSTRAR ARTICULOS");
		lblMostrarArticulos.setBounds(253, 13, 159, 16);
		contentPanel.add(lblMostrarArticulos);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(32, 45, 553, 293);
		contentPanel.add(textArea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				JButton btnCargar = new JButton("cargar");
				btnCargar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						textArea.setText(control.listaArt());
						
					}
				});
				buttonPane.add(btnCargar);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
