package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfCodigo;
	private JTextField tfDescripcion;
	private JTextField tfExistencias;
	private JTextField tfDia;
	private JTextField tfMes;
	private JTextField tfAño;



	/**
	 * Create the dialog.
	 */
	public ModificarArticulo() {
		setBounds(100, 100, 650, 459);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo Articulo");
		lblNewLabel.setBounds(45, 70, 103, 16);
		contentPanel.add(lblNewLabel);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(160, 67, 343, 22);
		contentPanel.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descripcion");
		lblNewLabel_1.setBounds(45, 115, 103, 16);
		contentPanel.add(lblNewLabel_1);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setBounds(160, 112, 343, 22);
		contentPanel.add(tfDescripcion);
		tfDescripcion.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Unidades");
		lblNewLabel_2.setBounds(45, 175, 56, 16);
		contentPanel.add(lblNewLabel_2);
		
		tfExistencias = new JTextField();
		tfExistencias.setBounds(160, 172, 67, 22);
		contentPanel.add(tfExistencias);
		tfExistencias.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("FECHA NACIMIENTO / CADUCIDAD");
		lblNewLabel_3.setBounds(45, 231, 219, 16);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setBounds(86, 280, 56, 16);
		contentPanel.add(lblNewLabel_4);
		
		tfDia = new JTextField();
		tfDia.setBounds(135, 277, 56, 22);
		contentPanel.add(tfDia);
		tfDia.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mes");
		lblNewLabel_5.setBounds(284, 280, 56, 16);
		contentPanel.add(lblNewLabel_5);
		
		tfMes = new JTextField();
		tfMes.setBounds(336, 277, 56, 22);
		contentPanel.add(tfMes);
		tfMes.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("A\u00F1o");
		lblNewLabel_6.setBounds(476, 280, 56, 16);
		contentPanel.add(lblNewLabel_6);
		
		tfAño = new JTextField();
		tfAño.setBounds(525, 277, 56, 22);
		contentPanel.add(tfAño);
		tfAño.setColumns(10);
		
		JLabel lblModificarArticulo = new JLabel("MODIFICAR ARTICULO");
		lblModificarArticulo.setBounds(255, 0, 194, 16);
		contentPanel.add(lblModificarArticulo);
		{
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(536, 66, 71, 25);
			contentPanel.add(btnBuscar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Modificar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
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
