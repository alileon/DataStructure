package proy;

import javax.swing.JOptionPane;
public class CuentaTest 
{
	// Metodo Principal 
	public static void main(String[]args)
	{ // Variables
		int numCta;
		String nomCte;
		double saldo, cantidad;
		
		//Entrada de Datos
		numCta=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la Cuenta:"));
		nomCte=JOptionPane.showInputDialog(null,"Nombre del Cliente:");
		saldo=Double.parseDouble(JOptionPane.showInputDialog(null,"Saldo:"));
		
		// Crear el objeto de cuenta1
		Cuenta cuenta1=new Cuenta(numCta,nomCte,saldo);
		
		// Entrada de Datos
		numCta=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la Cuenta:"));
		nomCte=JOptionPane.showInputDialog(null,"Nombre del Cliente:");
		saldo=Double.parseDouble(JOptionPane.showInputDialog(null,"Saldo:"));
		
		// Crear el objeto cuenta2
		Cuenta cuenta2=new Cuenta(numCta,nomCte,saldo);
		
		// Leer el deposito para la cuenta1
		cantidad=Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad a depositar para la cuenta1:"));
		
		cuenta1.depositar(cantidad);
		
		// Mostrar la cuenta1
		JOptionPane.showMessageDialog(null, cuenta1.toString());
		
		// Mostrar la suam de los dos saldos 
		JOptionPane.showMessageDialog(null, "La Suma de los dos saldos es:"+(cuenta1.getSaldo()+ cuenta2.getSaldo()));
	}


}