package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfCodigo;



	/**
	 * Create the dialog.
	 */
	public BuscarArticulo() {
		setBounds(100, 100, 588, 353);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			tfCodigo = new JTextField();
			tfCodigo.setBounds(245, 47, 116, 22);
			contentPanel.add(tfCodigo);
			tfCodigo.setColumns(10);
		}
		{
			JLabel lblCodigoArticulo = new JLabel("Codigo Articulo:");
			lblCodigoArticulo.setBounds(98, 50, 105, 16);
			contentPanel.add(lblCodigoArticulo);
		}
		{
			JTextPane textPane = new JTextPane();
			textPane.setBounds(12, 84, 546, 159);
			contentPanel.add(textPane);
		}
		{
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(417, 46, 97, 25);
			contentPanel.add(btnBuscar);
		}
		{
			JLabel lblBuscarArticulos = new JLabel("BUSCAR ARTICULOS");
			lblBuscarArticulos.setBounds(245, 13, 146, 16);
			contentPanel.add(lblBuscarArticulos);
		}
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
