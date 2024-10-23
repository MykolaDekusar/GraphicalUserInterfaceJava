import javax.swing.JOptionPane;

public class GraphicalUserInterface {

	public static void main(String[] args) {
		// Basic GUI
					 //JOptionPane.showInputDialog permette di far apparire una GUI con input
		String nome = JOptionPane.showInputDialog("Inserisci il tuo nome");
		System.out.println(nome);
		//JOptionPane.showMessageDialog mostra una GUI con i dati che vogliamo
		JOptionPane.showMessageDialog(null, "Il tuo nome è: "+nome);
		//proviamo con un numero intero
		//int eta = JOptionPane.showInputDialog("Inserisci la tua età");
		//il problema è che JOptionPane.showInputDialog ci ritorna una stringa
		//per trasformarla in intero dobbiamo avvalerci del metodo Integer.parseInt
		int eta= Integer.parseInt(JOptionPane.showInputDialog("Inseisci la tua età"));
		System.out.println(eta);
		JOptionPane.showMessageDialog(null,"Hai: "+ eta+ " anni");
	}	

}
