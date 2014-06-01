package proy;
import javax.swing.*;
public class CadenaCaracteres 
{
	// Metodo Principal
	public static void main(String []args)
	{
		// Variables

		String vocales="AEIOU",encriptar="",en="";
		String datos="", con="",inversa="";                            
		int e=0,i,j,a=0,contL=0,contm=0,contM=0,contD=0,contE=0,espacios=0;
		int p=0,vocal=0,consonante=0,palabras=1,contPV=0,contPC=0;
		con=JOptionPane.showInputDialog(null,"La Frase es: ");
		encriptar=JOptionPane.showInputDialog(null, "Frase Para Encriptar");
		// Checa si la contraseña es correcta
		//if(con.equals("contraseña"))
		  //datos+="La Contraseña es Correcta";
		//else
		  //datos+="La Contraseña es Incorrecta";
		
		for(i=0;i<con.length();i++)
		{  // Digitos
		     if(Character.isDigit(con.charAt(i))== true)
		         {contD++;}
		     else
		    	 // Letras
			   if(Character.isLetter(con.charAt(i))==true)
			    { contL++;
			    // Mayusculas
			      if(Character.isUpperCase(con.charAt(i))==true)
				     contM++;
			      else 
				     contm++;     
			      for(j=0;j<vocales.length();j++)
			          // Vocales
			    	  if(con.charAt(i)==vocales.charAt(j))
			          { vocal++;
			            a=1;
			          }
			      // Consonantes
			      if(a!=1)
			    	  consonante++;
			      a=0;
			    }
		     // Cuantos Espacios
			  if(Character.isSpace(con.charAt(i))==true)
				espacios++;
			  // Caracteres Especiales
				  contE=con.length()-(contL+contD+espacios);
		}  
	// Encriptar Frase
		for(i=0;i<con.length();i++)
		 {e=0;
			for(j=0;j<encriptar.length()&& e!=1;j++)
		   { if(con.charAt(i)==encriptar.charAt(j))
		    	 {if(j%2==0)
		    	   {en+=encriptar.charAt(j+1);
		    	    e=1;
		    	   }
		    	else
		    		{en+=encriptar.charAt(j-1);
		    		e=1;
		    		}
		    	 }
		    }
		 if(e==0)
		  en+=con.charAt(i);
		 }
		// Cadena A La Inversa
		j=0;
		for(i=con.length()-1;i>=0;i--)
			inversa+=con.charAt(i);
		palabras+=espacios;
		
		for(j=0;j<vocales.length();j++)
				if(con.charAt(0)== vocales.charAt(j))
					{contPV++;
					 p=1;
					}
		          if(p!=1)
					contPC++;
				
				// Palabras Que Empiezan Con Vocales
		     for(i=0;i<con.length();i++)		
		       {p=0;
			      if( Character.isSpace(con.charAt(i))==true)
					{for(j=0;j<vocales.length();j++)
				        {
						if(con.charAt(i+1)==vocales.charAt(j))
				    	  {contPV++;
				    	   p=1;
				    	  }
				        }
				      if(p!=1 && Character.isLetter(con.charAt(i+1))==true)
				    	  contPC++;
					}  
				}
	
		// Cadena Original
		datos+="\n Cadena Original: " + con;
		// Encriptar
		datos+="\n Frase Para Encriptar: "+encriptar;
		// La Cadena en Minusculas
		datos+="\n La Cadena en Minusculas: " + con.toLowerCase();
		// La Cadena en Mayusculas
		datos+="\n La Cadena en Mayusculas: " + con.toUpperCase();
		// La Longitud de la Cadena
		datos+="\n La Longitud es:" + con.length();
		//La Posicion de N en la cadena
		datos+="\n La letra N esta en la posicion:" + con.indexOf('n',0);
		// Numero de Letras Mayusculas
		datos+="\n Mayusculas: " + contM;
		// Numero de Letras Minusculas
		datos+="\n Minusculas: " + contm;
		// Numero de Digitos
		datos+="\n Digitos: " + contD;
		// Numero de Letras
		datos+="\n Letras: " + contL;
		// Numero de Simbolos Especiales
		datos+="\n Caracteres Especiales: " + contE;
		// Espacios en la Frase
		datos+="\n Espacios: " + espacios;
		// Consonantes
		datos+="\n Consonantes: " + consonante;
		// Vocales
		datos+="\n Vocales: " + vocal;
		// Palabras
		datos+="\n Palabras: " + palabras;
		// Frase Encriptada
		datos+="\n Frase Encriptada: "+ en;
		// Cadena A La Inversa
		datos+="\n Cadena A La Inversa: " + inversa;
		// Palabras Vocales
		datos+="\n Palabras Que Empiezan con Vocales: " + contPV;
		// Palabras Consonantes
		datos+="\n Palabras Que Empiezan con Consonantes: " + contPC;
		JOptionPane.showMessageDialog(null,datos);
	}

}