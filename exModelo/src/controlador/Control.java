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


public class Control {

	private Tienda modelo = Tienda.getInstance();
	private static Control instancia = null;
	
	private Control(){
	}
	
	public static Control getInstace(){
		
		if(instancia == null )
			instancia = new Control();
		return instancia;
	}
	public String listaArt (){
	
		return modelo.mostrarArticulos();
		
	}
	
	public Articulo buscarArt (String codigo){
		return modelo.buscarArticulo(Long.parseLong(codigo));
	}
	public boolean eliminarArt (String codigo){
		boolean borrado = modelo.borrarArticulo(Long.parseLong(codigo));
		if(borrado) modelo.guardarArticulos();
		return borrado;
	}
	
	public int añadirMascota(String codigo,String nombre,String unid,String dia,String mes,String anyo){
		long numcodigo;
		int numunid,numdia,nummes ,numanyo;
		try{
			if (codigo.equals("")){
				numcodigo = 0;
			}else{
				numcodigo = Integer.parseInt(codigo);
			}
		}catch (Exception e){
			return -1;
		}
		try{
			if (unid.equals("")){
				numunid = 0;
			}else{
				numunid = Integer.parseInt(unid);
				
			}
		}catch (Exception e){
			return -2;		}
		
		try{
			if (dia.equals("")){
				numdia = 0;
			}else{
				numdia = Integer.parseInt(dia);
				if(numdia < 0 || numdia > 31){
					return -3;
				}
			}
		}catch (Exception e){
			return -3;
		}
		
		try{
			if (mes.equals("")){
				nummes = 0;
			}else{
				nummes = Integer.parseInt(mes);
				if(nummes < 0 || nummes > 12){
					return -4;
				}
			}
		}catch (Exception e){
			return -4;
		}
		
		try{
			if (anyo.equals("")){
				numanyo = 0;
			}else{
				numanyo = Integer.parseInt(anyo);
				if(numanyo<999){
					return -5;
				}
			}
		}catch (Exception e){
			return -5;
		}
		boolean nuevo =modelo.introMascota(numcodigo, nombre, numunid, numdia, nummes, numanyo);
		if(nuevo){
			modelo.guardarArticulos();
			return 1;
		}else {
		return -1;	
		}
	
	}
	
	public int añadirComplemento(String codigo,String nombre,String unid,String dia,String mes,String anyo){
		long numcodigo;
		int numunid,numdia,nummes ,numanyo;
		try{
			if (codigo.equals("")){
				numcodigo = 0;
			}else{
				numcodigo = Integer.parseInt(codigo);
				
			}
		}catch (Exception e){
			return -1;
		}
		try{
			if (unid.equals("")){
				numunid = 0;
			}else{
				numunid = Integer.parseInt(unid);
				
			}
		}catch (Exception e){
			return -2;		}
		
		try{
			if (dia.equals("")){
				numdia = 0;
			}else{
				numdia = Integer.parseInt(dia);
				if(numdia < 0 || numdia > 31){
					return -3;
				}
			}
		}catch (Exception e){
			return -3;
		}
		
		try{
			if (mes.equals("")){
				nummes = 0;
			}else{
				nummes = Integer.parseInt(mes);
				if(nummes < 0 || nummes > 12){
					return -4;
				}
			}
		}catch (Exception e){
			return -4;
		}
		
		try{
			if (anyo.equals("")){
				numanyo = 0;
			}else{
				numanyo = Integer.parseInt(anyo);
				if(numanyo<999){
					return -5;
				}
			}
		}catch (Exception e){
			return -5;
		}
		boolean nuevo =modelo.introComplemento(numcodigo, nombre, numunid, numdia, nummes, numanyo);
		if(nuevo){
			modelo.guardarArticulos();
			return 1;
		}else {
		return -1;	
		}
	
	}
	public int modificarArt(String nombre,String descripcion,String unid,String dia,String mes,String anyo){
		int numCodigo = Integer.parseInt(nombre);
		int numunid = Integer.parseInt(unid);
		int numdia=Integer.parseInt(dia);
		int nummes=Integer.parseInt(mes);
		int numanio=Integer.parseInt(anyo);
		return modelo.modificarArticulo(numCodigo, descripcion, numunid,numdia,nummes,numanio);
	}
	
}



