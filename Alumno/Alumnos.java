package proy;
import javax.swing.JOptionPane;

public class Alumnos 
{
	// Metodo Principal 
	public static void main(String[]args)
	{
		// Variables 
            int numeroAlumnos;
            int cal,n,i;
            int posicion=0;
            String r="",datos="";
// Ingresamos el tamaño del vecto
numeroAlumnos=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos Alumnos?"));
// Le damos el tamaño al vector
            int vectorAlumnos[]= new int[numeroAlumnos];
// Ingresamos las calificaciones
do
		{// Calificacion a Ingresar
			cal=Integer.parseInt(JOptionPane.showInputDialog(null,"Calificacion del Alumno:"+posicion));
			//Guardamos la calificacion
                        if(cal>=5 && cal<=10)
                          {vectorAlumnos[posicion]= cal;
                           posicion++;}
			             else
                            JOptionPane.showMessageDialog(null,"LAS CALIFICACIONES DEBEN SER ENTRE 5 Y 10");
            r+="\n ¿DESEA INGRESAR MAS CALIFICACIONES?";
			r+="\n 1.-SI";
			r+="\n 2.-NO";
			n=Integer.parseInt(JOptionPane.showInputDialog(null,r));
			r="";
		}while(n!=2 && posicion<vectorAlumnos.length);


      datos="\n Calificaciones de Alumnos";
       for(i=0;i<vectorAlumnos.length;i++)
         datos+="\n Alumno" +i+"="+ vectorAlumnos[i];
       JOptionPane.showMessageDialog(null,datos);}
}