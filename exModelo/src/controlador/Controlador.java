package controlador;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import modelo.Articulo;
import modelo.Complementos;
import modelo.Fecha;
import modelo.Mascotas;
import modelo.Tienda;
import vista.ModificarArticulo;
import vista.PetShop;


public class Controlador {
	private Tienda modelo=Tienda.getInstance();
	private static Controlador instancia=null;
	
	private Controlador(){
	}
	
	public static Controlador getInstancia(){
		if(instancia==null)
			instancia= new Controlador();
		return instancia;
	}
	
	public Articulo buscarArt(String codigo){
		return modelo.buscarArticulo(Long.parseLong(codigo));
	}
	
	public boolean eliminarArt(String codigo){
		boolean borrado = modelo.borrarArticulo(Integer.parseInt(codigo));
		if(borrado) modelo.guardarArticulos();
		return borrado;
	}
	
	public int añadirMascota(String codigo, String nombre, String existencias, String dia, String mes, String anyo){
		long numcodigo;
		int numunid,numdia,nummes ,numanyo;
		try{
			if (codigo.equals("")){
				numcodigo = 0;
			}else{
				numcodigo = Integer.parseInt(codigo);
				return -1;
			}
		}catch (Exception e){
			return -1;
		}
		try{
			if (nombre.equals("")){
				numunid = 0;
			}else{
				numunid = Integer.parseInt(nombre);
				return -2;
			}
		}catch (Exception e){
			return -2;		}
		
		try{
			if (dia.equals("")){
				numdia = 0;
			}else{
				numdia = Integer.parseInt(dia);
				if(numdia < 0 || numdia > 31){
					return -4;
				}
			}
		}catch (Exception e){
			return -4;
		}
		
		try{
			if (mes.equals("")){
				nummes = 0;
			}else{
				nummes = Integer.parseInt(mes);
				if(nummes < 0 || nummes > 12){
					return -5;
				}
			}
		}catch (Exception e){
			return -5;
		}
		
		try{
			if (anyo.equals("")){
				numanyo = 0;
			}else{
				numanyo = Integer.parseInt(anyo);
				if(numanyo<0){
					return -6;
				}
			}
		}catch (Exception e){
			return -6;
		}
		boolean nuevo = modelo.introMascota(numcodigo, nombre, numunid, numdia, nummes, numanyo);
		if(nuevo){
			modelo.guardarArticulos();
			return 1;
		}else {
		return -1;	
		}
	
	}
}

