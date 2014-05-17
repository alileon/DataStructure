package proy;
import javax.swing.JOptionPane;

public class ArbolBiDeCaracteres 
{//Atributos
	private NodoCaracteres raiz;
	private int numeroHijos;
	private String In="",Post="",Pre="";

	// Constructor
	public ArbolBiDeCaracteres()
	{ raiz=null; }
	
	// Insertar en el Arbol
	public void InsertarDato(String d)
	{
		if(raiz==null)
			raiz= new NodoCaracteres(d);
		else 
			raiz.Insertar(d);
	}
	  //Recorrido en Inorder
	public void Inorder(NodoCaracteres r)
	{ String c="BORRADO";
	  if(r==null)
		  return;
	  else
	  { Inorder(r.getHijoIzq());
	     if(r.getDatoBorrado().equalsIgnoreCase(c) ==false)  
	      In+=r.getDato();
		Inorder(r.getHijoDer());  
	  }
	}
	  // Recorrido en Postorder
	public void Postorder(NodoCaracteres r)
	{ String c="BORRADO";
		if(r==null)
			return;
		else
		   {Postorder(r.getHijoIzq());
		    Postorder(r.getHijoDer());
		    if(r.getDatoBorrado().equalsIgnoreCase(c)== false) 
		    Post+=r.getDato();
		   }
	}
	  // Recorrido en Preorder
	public void Preorder(NodoCaracteres r)
	{ String c="BORRADO";
		if(r==null)
			return;
		else
		{ if(r.getDatoBorrado().equalsIgnoreCase(c)== false)
			Pre+=r.getDato();
		  Preorder(r.getHijoIzq());
		  Preorder(r.getHijoDer());
		}
	}
	
	// Número de Nodos que tiene el Árbol
	public int  NumHijos(NodoCaracteres num)
	{String c="BORRADO";
		if(num.getHijoIzq()!= null && num.getDatoBorrado().equalsIgnoreCase(c)== false)
			{NumHijos(num.getHijoIzq());
		     numeroHijos++;}
		
		if(num.getHijoDer()!= null && num.getDatoBorrado().equalsIgnoreCase(c)== false)
		    {NumHijos(num.getHijoDer());
	         numeroHijos++;}
		
		if(num.getHijoIzq()== null && num.getHijoDer()== null && num.getDatoBorrado().equalsIgnoreCase(c)== false)
			numeroHijos++;
		
		if(num.getHijoIzq()!= null && num.getHijoDer()!= null && num.getDatoBorrado().equalsIgnoreCase(c)== false)
			numeroHijos--;
		return numeroHijos;
	}
	
	// Profundidad en el Arbol
	public int Profundidad(NodoCaracteres Nodo)
	{ int p=0;
	    
	     if(Nodo.getHijoIzq()==null && Nodo.getHijoDer()==null)
	    	 return 1;
	     else 
	        { if(Nodo.getHijoIzq()!= null)
		        p+=Profundidad(Nodo.getHijoIzq());
	    	  else
	    		p+=Profundidad(Nodo.getHijoDer());
	        }
	    	 return p+1;
	}
	
	// Buscar un Dato en el Arbol
	public String Buscar(String d)
	{NodoCaracteres r;
	 int a;
	 String datos="";
	  r=raiz;
		if(r!=null)
    		{ while((r!=null) && (r.getDato().equalsIgnoreCase(d)== false))
	    	   {a=d.compareTo(r.getDato()); 
    			if(a<0)
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
	public void Eliminar(String d)
	{NodoCaracteres r;
	 String b="BORRADO";
	 int a;
		r=raiz;
		if(r!=null)
		{ while((r!=null) && (r.getDato().equalsIgnoreCase(d)== false))
		    {a=d.compareTo(r.getDato());  
			if(a<0)
		    	r=r.getHijoIzq();
		       else
			    r=r.getHijoDer();
		    }
		if(r!=null && r.getDato().equalsIgnoreCase(d)== true)
		  r.setDatoBorrado(b);
		else
			JOptionPane.showMessageDialog(null,"Dato No Existe" );
		}
	}
	 // Metodos Getters
	public String getP()
	{return In;}
	
	public void setP(String d)
	{In=d;}
	public NodoCaracteres getRaiz()
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
    
	public void setNumeroHijos(int d)
	{numeroHijos=d;	}

}