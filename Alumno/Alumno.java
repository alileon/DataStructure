package proy;
public class Alumno 
{
	// Atributos 
	private int matricula,calificacion1,calificacion2,calificacion3;
	private String nombre;
	private double promedio;
	
	//Constructor
	public Alumno (int mat, String nom)
	{ matricula=mat;
	  nombre=nom;
	  calificacion1=-1;
	  calificacion2=-1;
	  calificacion3=-1;
	  promedio=-1;
	}
	
	// Metodos Getters
	public int getMatricula()
	{return matricula;}
	
	public String getNombre()
	{return nombre;}
	
	public int getCalificacion1()
	{return calificacion1;}
	
	public int getCalificacion2()
	{return calificacion2;}
	
	public int getCalificacion3()
	{return calificacion3;}
	
	public double getPromedio()
	{return promedio;}
	
	// Metodos Setters
	public void setMatricula(int nuevaMatricula)
	{matricula=nuevaMatricula;}
	
	public void setNombre(String nuevoNombre)
	{nombre=nuevoNombre;}
	
	public void setCalificacion1(int nuevaCal1)
	{calificacion1=nuevaCal1;}
	
	public void setCalificacion2(int nuevaCal2)
	{calificacion2=nuevaCal2;}
	
	public void setCalificacion3(int nuevaCal3)
	{calificacion3=nuevaCal3;}
	
	public void setPromedio(double nuevoProm)
	{promedio=nuevoProm;}
	
	// Metodo de Instancia
	
	public void calcularPromedio()
	{// Variables
		double suma=0, cont=0;
		
		// Calcular Promedio
		if(calificacion1>=0 && calificacion1<=100)
		{suma+=calificacion1;
		 cont++;
		}
		
		if(calificacion2>=0 && calificacion1<=100)
		{suma+=calificacion2;
		 cont++;
		}
		
		if(calificacion3>=0 && calificacion1<=100)
		{suma+=calificacion3;
		 cont++;
		}
		if(cont>0)
			promedio=suma/cont;
		}
	
	//Metodo to String
	
	public String toString()
	{// Variables
		String datos="";
		
		datos+="Datos del Alumno\n\n";
		datos+="Matricula: "+ matricula+ "\n";
		datos+="Nombre: " + nombre +"\n";
		datos+="Calificacion1: ";
		      if(calificacion1==-1)
		    	  datos+="No disponible";
		      else
		    	  datos+=calificacion1;
		      datos+="\n";
	   datos+="Calificacion2: ";
	          if(calificacion2==-1)
	        	  datos+="No disponible";
	          else
	        	  datos+=calificacion2;
	          datos+="\n";
	          
	   datos+="Calificacion3: ";
	          if(calificacion3==-1)
	        	  datos+="No disponible";
	          else
	        	  datos+=calificacion3;
	          datos+="\n";
	   datos+="Promedio: ";
	          if(promedio==-1)
	        	  datos+="No disponible";
	          else
	        	  datos+=promedio;
	          datos+="\n";     
	          
	          return datos;
	 }
}