package proy;
import javax.swing.JOptionPane;
public class ArbolBiDeCaracteresTets 
{
	// Metodo Principal 
	public static void main(String[]args)
	{
		// Variables 
		int n,k,opcion,a=0;
		String r="",t="",cadena="",menu="",dato;
		// Crear el Objeto
		ArbolBiDeCaracteres d= new ArbolBiDeCaracteres();
		do
		{// Dato a Ingresar al Arbol
			dato=JOptionPane.showInputDialog(null,"Dato a Ingresar: ");
			d.InsertarDato(dato);
			r+="\n ¿DESEA INSERTAR MAS DATOS AL ARBOL?";
			r+="\n 1.-SI";
			r+="\n 2.-NO";
			n=Integer.parseInt(JOptionPane.showInputDialog(null,r));
			r="";
		}while(n!=2);
  		
		   
         // Preparando el menu
         menu+="\n *** Menu de Opciones ***\n ";
         menu+="\n 0.-Terminar";
         menu+="\n 1.-Mostrar Raiz";
         menu+="\n 2.-Profundidad del Arbol";
         menu+="\n 3.-Numero de Nodos del Arbol";
         menu+="\n 4.-Recorrido en Inorder";
         menu+="\n 5.-Recorrido en Postorder";
         menu+="\n 6.-Recorrido en Preorder";
         menu+="\n 7.-Buscar un Dato";
         menu+="\n 8.-Borrar un Dato";
		  
         do{
        	 opcion=Integer.parseInt(JOptionPane.showInputDialog(null,menu ));
        	 
        	 switch(opcion)
        	 {case 1: JOptionPane.showMessageDialog(null,"La Raiz es: " + d.getRaiz().getDato());
        	     break;
        	 case 2: // Profundidad en el Arbol
                         k=d.Profundidad(d.getRaiz());
                          JOptionPane.showMessageDialog(null,"Profundidad del Arbol: " + k);
        	     break;
        	 case 3: // Numero de Hijos 
                         n=d.NumHijos(d.getRaiz());
                          JOptionPane.showMessageDialog(null,"Nodos en el Arbol: " + n);
                          d.setNumeroHijos(a);
        	     break;
        	 case 4: // Recorrido en Inorder
		         d.Inorder(d.getRaiz());
                         JOptionPane.showMessageDialog(null,"\n Recorrido en Inorder: "+ d.getP());
                         r="";
                         d.setP(r);
        	     break;
        	 case 5: // Recorrido en Postorder
		         d.Postorder(d.getRaiz());
                         JOptionPane.showMessageDialog(null,"\n Recorrido en Postorder: "+ d.getPost());
                         r="";
                         d.setPost(r);
        	     break;
        	 case 6: // Recorrido en Preorder
		         d.Preorder(d.getRaiz());
                         JOptionPane.showMessageDialog(null,"\n Recorrido en Preorder: "+ d.getPre());
                         r="";
                         d.setPre(r);
        	     break;
             case 7: // Dato a Buscar
		         dato=JOptionPane.showInputDialog(null,"Dato a Buscar: ");
		         t=d.Buscar(dato);
		         JOptionPane.showMessageDialog(null,t);
                         t="";
                 break;
             case 8: // Dato a Borrar
		         dato=JOptionPane.showInputDialog(null,"Dato a Borrar: ");
		         d.Eliminar(dato);
		         r="";
		         d.setP(r);
		         d.setPost(r);
		         d.setPre(r); 
	             break;
        	 }
         }while(opcion!=0);
          
	}
}