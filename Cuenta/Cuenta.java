package proy;
import javax.swing.JOptionPane;
public class Cuenta 
{
	// Atributos
	private  int numeroCuenta;
	private String nombreCliente;
	private double saldo;
	
	// Constructor
	public Cuenta(int numCuenta, String nombreCliente, double depositoInicial)
	{numeroCuenta=numCuenta;
	 this. nombreCliente= nombreCliente;
	 saldo=depositoInicial;
	}
	// Metodos Getters
	public int getNumeroCuenta()
	{return numeroCuenta;}
    
	public String getNombreCliente()
	{return nombreCliente;}
	
	public double getSaldo()
	{ return saldo;}
	
	// Metodos Setters 
	public void setNumeroCuenta(int nuevoNumero)
	{numeroCuenta=nuevoNumero;}
	public void setNombreCliente(String nuevoNombre)
	{nombreCliente=nuevoNombre;}
	public void setSaldo(double nuevoSaldo)
	{saldo=nuevoSaldo;}
	
	// Metodo de Instancia
	public void depositar(double cantidad)
	{if(cantidad>0)
		saldo+=cantidad;
	else 
		JOptionPane.showMessageDialog(null, "Error: cantidad Invalida");
	
	}
	
	public void retirar(double cantidad)
	{if(cantidad>0)
		if(cantidad<=saldo)
			saldo-=cantidad;
		else
			JOptionPane.showMessageDialog(null, "Error: Saldo Insuficiente");
	else
		JOptionPane.showMessageDialog(null, "Error: cantidad Invalida");
	}
	
	// Metodo String 
	
	public String toString()
	{String datos="";
	 
	datos+="Informacion de la Cuenta \n";
	datos+="Numero de Cuenta: "+ numeroCuenta+"\n";
	datos+="Nombre del Cliente: "+nombreCliente+"\n";
	datos+="Saldo Actual: "+saldo+"\n";
	
	return datos;
	}
}
