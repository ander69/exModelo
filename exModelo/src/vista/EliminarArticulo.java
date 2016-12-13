package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Control;
import modelo.Articulo;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	Control control = Control.getInstace();
	private JTextField tfCodigo;
	private JTextField tfArticulo;



	/**
	 * Create the dialog.
	 */
	public EliminarArticulo() {
		setBounds(100, 100, 645, 431);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEliminarArticulo = new JLabel("ELIMINAR ARTICULO");
			lblEliminarArticulo.setBounds(243, 13, 148, 16);
			contentPanel.add(lblEliminarArticulo);
		}
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(243, 44, 116, 22);
		contentPanel.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lblCodigoArticulo = new JLabel("Codigo Articulo:");
		lblCodigoArticulo.setBounds(132, 47, 99, 16);
		contentPanel.add(lblCodigoArticulo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Articulo ar1 = control.buscarArt(tfCodigo.getText());
				if (ar1 != null){
					tfArticulo.setText("Descripcion: "+ar1.getDescripcion()+" Cantidad: "+ar1.getExistencias()+" "+ar1.toString());
					
				}
			}
		});
		btnBuscar.setBounds(396, 42, 97, 25);
		contentPanel.add(btnBuscar);
		{
			tfArticulo = new JTextField();
			tfArticulo.setBounds(12, 84, 603, 252);
			contentPanel.add(tfArticulo);
			tfArticulo.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Eliminar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 control.eliminarArt(tfCodigo.getText());
						 tfCodigo.setText("");
						 tfArticulo.setText("");
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
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
