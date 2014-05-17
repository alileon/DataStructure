package proy;
import javax.swing.JOptionPane;

public class ArbolBinarioTest 
{
	// Metodo Principal 
	public static void main(String[]args)
	{
		// Variables 
		int n,dato,k;
		String r="",t="";
		// Crear el Objeto
		ArbolBinario d= new ArbolBinario();
		do
		{// Dato a Ingresar al Arbol
			dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Dato a Ingresar: "));
			d.InsertarDato(dato);
			r+="\n ¿DESEA INSERTAR MAS DATOS AL ARBOL?";
			r+="\n 1.-SI";
			r+="\n 2.-NO";
			n=Integer.parseInt(JOptionPane.showInputDialog(null,r));
			r="";
		}while(n!=2);
  		// Recorrido en Inorder
		 d.Inorder(d.getRaiz());
		   // Recorrido en Postorder
		 d.Postorder(d.getRaiz());
		   // Recorrido en Preorder
		 d.Preorder(d.getRaiz());
		// Profundidad en el Arbol
         k=d.Profundidad(d.getRaiz());
         // Numero de Hijos 
         d.NumHijos(k);
         n=d.getNumeroHijos();
		  // Imprimiendo Todo
         t+="\n *** DATOS DEL ARBOL ***";
		 t+="\n La Raiz es :" + d.getRaiz().getDato();
		 t+="\n La Profundidad del Arbol es: " + k;
		 t+="\n El Numero de Nodos del Arbol es: " + n;
		 t+="\n El Recorrido en Inorder es :" + d.getP();
		 t+="\n El Recorrido en Postorder es:" + d.getPost();
		 t+="\n El Recorrido en Preorder es: " + d.getPre();
		 JOptionPane.showMessageDialog(null,t);
		 // Dato a Buscar
		 dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Dato a Buscar: "));
		 t=d.Buscar(dato);
		 JOptionPane.showMessageDialog(null,t);
		 // Dato a Borrar
		 dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Dato a Borrar: "));
		 d.Eliminar(dato);
		 t="";
		 n--;
		 r="";
		 d.setP(r);
		 d.setPost(r);
		 d.setPre(r);
		// Recorrido en Inorder
		 d.Inorder(d.getRaiz());
		   // Recorrido en Postorder
		 d.Postorder(d.getRaiz());
		   // Recorrido en Preorder
		 d.Preorder(d.getRaiz());

		 // Imprimiendo Todo
         t+="\n *** DATOS DEL ARBOL ***";
		 t+="\n La Raiz es :" + d.getRaiz().getDato();
		 t+="\n La Profundidad del Arbol es: " + k;
		 t+="\n El Numero de Nodos del Arbol es: " + n;
		 t+="\n El Recorrido en Inorder es :" + d.getP();
		 t+="\n El Recorrido en Postorder es:" + d.getPost();
		 t+="\n El Recorrido en Preorder es: " + d.getPre();
		 JOptionPane.showMessageDialog(null,t);
	}
}