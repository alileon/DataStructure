package proy;
import javax.swing.JOptionPane;

public class ArbolBinario 
{
	//Atributos
	private Nodo raiz;
	private int numeroHijos;
	private String In="",Post="",Pre="";
	// Constructor
	public ArbolBinario()
	{ raiz=null; }
	
	// Insertar en el Arbol
	public void InsertarDato(int d)
	{
		if(raiz==null)
			raiz= new Nodo(d);
		else 
			raiz.Insertar(d);
	}
	  //Recorrido en Inorder
	public void Inorder(Nodo r)
	{ 
	  if(r==null)
		  return;
	  else
	  { Inorder(r.getHijoIzq());
	     if(r.getDatoBorrado()!=1)  
	      In+=r.getDato()+" ";
		Inorder(r.getHijoDer());  
	  }
	}
	  // Recorrido en Postorder
	public void Postorder(Nodo r)
	{ 
		if(r==null)
			return;
		else
		   {Postorder(r.getHijoIzq());
		    Postorder(r.getHijoDer());
		    if(r.getDatoBorrado()!=1) 
		    Post+=r.getDato()+ " ";
		   }
	}
	  // Recorrido en Preorder
	public void Preorder(Nodo r)
	{ 
		if(r==null)
			return;
		else
		{ if(r.getDatoBorrado()!=1)
			Pre+=r.getDato()+ " ";
		  Preorder(r.getHijoIzq());
		  Preorder(r.getHijoDer());
		}
	}
	
	// Número de Nodos que tiene el Árbol
	public void  NumHijos(int num)
	{int hijos=2,cont=2,i;
	
	  for(i=1;i<num;i++)   
		  hijos*=cont;
	     hijos--;
	     numeroHijos=hijos;
	}
	
	// Profundidad en el Arbol
	public int Profundidad(Nodo Nodo)
	{ int p=0;
	    
	     if(Nodo.getHijoIzq()==null)
	    	 return 1;
	     else 
		     p+=Profundidad(Nodo.getHijoIzq());
	    	 return p+1;
	}
	
	// Buscar un Dato en el Arbol
	public String Buscar(int d)
	{Nodo r;
	 String datos="";
	  r=raiz;
		if(r!=null)
    		{ while((r!=null) && (r.getDato()!=d))
	    	   { if(d<r.getDato())
		    	   r=r.getHijoIzq();
	   	         else
			       r=r.getHijoDer();
		       }
		       if(r!=null)
		         datos+="\n El Dato Buscado es: " + r.getDato();
		      else
			     datos+="\n El Dato Buscado No Existe en el Arbol";  
		    }
		else 
			datos+="\n El Arbol No Tiene Datos";
		
	   return datos;
	}
	  // Metodo Eliminar
	public void Eliminar(int d)
	{Nodo r;
	 int borrado=1;
		r=raiz;
		if(r!=null)
		{ while((r!=null) && (r.getDato()!=d))
		    {  if(d<r.getDato())
		    	r=r.getHijoIzq();
		       else
			    r=r.getHijoDer();
		    }
		if(r!=null && r.getDato()==d)
			  r.setDatoBorrado(borrado);
			else
				JOptionPane.showMessageDialog(null,"Dato No Existe" );
		}
	}
	 // Metodos Getters
	public String getP()
	{return In;}
	
	public void setP(String d)
	{In=d;}
	public Nodo getRaiz()
	{return raiz;}
	
	public String getPost()
	{return Post;}
	
	public void setPost(String d)
	{Post=d;}
	public String getPre()
	{return Pre;}
	
	public void setPre(String d)
	{Pre=d;}
	public int getNumeroHijos()
	{return numeroHijos;}
}