package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PetShop extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetShop frame = new PetShop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PetShop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btIntroducirMas = new JButton("Introducir Mascota");
		btIntroducirMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new IntroducirMascota().setVisible(true);
			}
		});
		btIntroducirMas.setBounds(58, 82, 171, 25);
		contentPane.add(btIntroducirMas);
		
		JButton btBuscarArt = new JButton("Buscar Articulo");
		btBuscarArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuscarArticulo().setVisible(true);
			}
		});
		btBuscarArt.setBounds(436, 82, 151, 25);
		contentPane.add(btBuscarArt);
		
		JButton btIntroducirCom = new JButton("Introducir Complemento");
		btIntroducirCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new IntroducirComplemento().setVisible(true);
			}
		});
		btIntroducirCom.setBounds(58, 151, 171, 25);
		contentPane.add(btIntroducirCom);
		
		JButton btModificarArt = new JButton("Modificar Articulo");
		btModificarArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModificarArticulo().setVisible(true);
			}
		});
		btModificarArt.setBounds(436, 151, 151, 25);
		contentPane.add(btModificarArt);
		
		JButton btMostrarArt = new JButton("Mostrar Articulos");
		btMostrarArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MostrarArticulos().setVisible(true);
			}
		});
		btMostrarArt.setBounds(58, 228, 171, 25);
		contentPane.add(btMostrarArt);
		
		JButton btEliminarArt = new JButton("Eliminar Articulo");
		btEliminarArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EliminarArticulo().setVisible(true);
			}
		});
		btEliminarArt.setBounds(436, 228, 151, 25);
		contentPane.add(btEliminarArt);
		
		JButton btSalir = new JButton("Salir");
		btSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btSalir.setBounds(281, 298, 97, 25);
		contentPane.add(btSalir);
		
		JLabel lblGestionPetShop = new JLabel("GESTION PET SHOP");
		lblGestionPetShop.setBounds(263, 13, 143, 16);
		contentPane.add(lblGestionPetShop);
	}
}
