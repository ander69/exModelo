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
import controlador.Control;

public class IntroducirMascota extends JDialog {

	private final JPanel contentPanel = new JPanel();
	Control control = Control.getInstace();
	private JTextField tfCodigo;
	private JTextField tfDescripcion;
	private JTextField tfExistencia;
	private JTextField tfDia;
	private JTextField tfMes;
	private JTextField tfAño;



	/**
	 * Create the dialog.
	 */
	public IntroducirMascota() {
		setBounds(100, 100, 685, 440);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIntroducirMascota = new JLabel("INTRODUCIR MASCOTA");
			lblIntroducirMascota.setBounds(290, 13, 145, 16);
			contentPanel.add(lblIntroducirMascota);
		}
		{
			JLabel lblNewLabel = new JLabel("Codigo");
			lblNewLabel.setBounds(26, 76, 56, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			tfCodigo = new JTextField();
			tfCodigo.setBounds(139, 73, 116, 22);
			contentPanel.add(tfCodigo);
			tfCodigo.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Descripcion");
			lblNewLabel_1.setBounds(26, 145, 80, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			tfDescripcion = new JTextField();
			tfDescripcion.setBounds(139, 142, 116, 22);
			contentPanel.add(tfDescripcion);
			tfDescripcion.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Unidades");
			lblNewLabel_2.setBounds(26, 214, 56, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			tfExistencia = new JTextField();
			tfExistencia.setBounds(139, 211, 116, 22);
			contentPanel.add(tfExistencia);
			tfExistencia.setColumns(10);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(426, 119, 205, 187);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Dia");
		lblNewLabel_3.setBounds(12, 24, 56, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mes");
		lblNewLabel_4.setBounds(12, 72, 56, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("A\u00F1o");
		lblNewLabel_5.setBounds(12, 123, 56, 16);
		panel.add(lblNewLabel_5);
		
		tfDia = new JTextField();
		tfDia.setBounds(80, 21, 116, 22);
		panel.add(tfDia);
		tfDia.setColumns(10);
		
		tfMes = new JTextField();
		tfMes.setBounds(80, 69, 116, 22);
		panel.add(tfMes);
		tfMes.setColumns(10);
		
		tfAño = new JTextField();
		tfAño.setBounds(80, 120, 116, 22);
		panel.add(tfAño);
		tfAño.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("A\u00F1adir");
				okButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
					String codigo = tfCodigo.getText();
					String descripcion = tfDescripcion.getText();
					String existencias = tfExistencia.getText();
					String dia = tfDia.getText();
					String mes = tfMes.getText();
					String anyo = tfAño.getText();
					control.añadirMascota(codigo,descripcion,existencias,dia,mes,anyo);
					tfCodigo.setText("");
					tfDescripcion.setText("");
					tfExistencia.setText("");
					tfDia.setText("");
					tfMes.setText("");
					tfAño.setText("");
					
					
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
