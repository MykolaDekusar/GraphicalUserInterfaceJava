import javax.swing.JOptionPane;

public class GraphicalUserInterface {

	public static void main(String[] args) {
		// Basic GUI
					 //JOptionPane.showInputDialog permette di far apparire una GUI con input
		String nome = JOptionPane.showInputDialog("Inserisci il tuo nome");
		System.out.println(nome);
		//JOptionPane.showMessageDialog mostra una GUI con i dati che vogliamo
		JOptionPane.showMessageDialog(null, "Il tuo nome è: "+nome);
	}

}
