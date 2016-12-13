package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Tienda {

	private static ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
	private static File doc = new File("Articulos.obj");
	
	private static Tienda instancia  = null;
	
	private Tienda (){
		cargarArticulos();
	}
	public static Tienda getInstance(){
		if (instancia == null)
			instancia = new Tienda();
		return instancia;
	}
	public void cargarArticulos(){
		try{
			FileInputStream fispet  = new FileInputStream(doc);
			ObjectInputStream oisLector = new ObjectInputStream(fispet);
			Articulo a = (Articulo) oisLector.readObject();
			while(a != null){
				listaArticulos.add(a);
				a = (Articulo) oisLector.readObject();
			}
			try{
				oisLector.close();
			}catch(IOException e1){
				e1.printStackTrace();
			}
		}catch(Exception  ex ){
			ex.printStackTrace();
		}
	}
	
	public boolean introMascota(long codigo , String descripcion , int existencias, int diaNac,int mesNac,int anyoNac ){
		if(buscarArticulo(codigo) == null){
			Fecha fechaNac = new Fecha(diaNac,mesNac, anyoNac);
			Mascotas masc = new Mascotas(codigo, descripcion, existencias, fechaNac);
			listaArticulos.add(masc);
			return true;
		}else{
			return false;
		}
	}
	public boolean introComplemento (long codigo , String descripcion,  int existencias, int diaCad , int mesCad, int anyoCad ){
		if(buscarArticulo(codigo) == null){
			Fecha fechaCad = new Fecha(diaCad,mesCad, anyoCad);
			Complementos comple = new Complementos(codigo, descripcion, existencias, fechaCad);
			listaArticulos.add(comple);
			return true;
		}else{
			return false;
		}
	}
	public String mostrarArticulos(){
		String articulos = "";
		for(Articulo art:listaArticulos ){
			articulos = articulos+"\n" + art;
		}
		return articulos;
	}
	
	public Articulo buscarArticulo(long codigo){
		
		for (Articulo art : listaArticulos) {
			if(codigo == art.getCodigo()){
				return art;
			}
		}
		return null;
	}
	public boolean borrarArticulo(long codigo){
		Articulo art = buscarArticulo(codigo);
		
		if(art != null){
			listaArticulos.remove(art);
			return true;
		}else{
			return false;
		}
	}
	public int modificarArticulo(long codigo, String descripcion , int existencias, int dia,int mes,int anyo){
		Articulo art =  buscarArticulo(codigo);
		 if(art != null){
			 art.setDescripcion(descripcion);
			 art.setExistencias(existencias);
			 if(art instanceof Mascotas){
				 ((Mascotas)art).setFechaNacimiento(new Fecha(dia,mes,anyo));
			 }else{
				 ((Complementos)art).setFechaCaducidad(new Fecha(dia,mes,anyo));
			 }
			 return 1;
		 }
		 return -1;
	}
	public void guardarArticulos(){
		try{
			FileOutputStream fisArticulos = new FileOutputStream(doc);
			ObjectOutputStream fic = new ObjectOutputStream(fisArticulos);
			try{
				for (Articulo a : listaArticulos) {
					fic.writeObject(a);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			fic.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

