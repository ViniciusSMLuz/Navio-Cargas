import static javax.swing.JOptionPane.*;
import java.util.Map;
import java.util.TreeMap;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Menu {

	Map<String, Mercadoria> Barco = new TreeMap<>();
	double PesoBarco = 10000;

	public void menu() {

		int menu;

		do {

			menu = parseInt(showInputDialog(
					"1. Registrar Carga \n2.Pesquisar Carga \n3. Imprimir Cargas \n4.Excluir Cargas \n5.Finalizar"));
			switch (menu) {
			case 1:
				Mercadoria mercadoria = new Mercadoria();
				mercadoria.setNome(showInputDialog("Informe o nome da empresa"));

				mercadoria.setCnpj(showInputDialog("Informe o CNPJ da empresa"));

				mercadoria.setDestino(showInputDialog("Informe o destino"));

				mercadoria.setPeso(parseDouble((showInputDialog("Informe o peso da mercadoria"))));

				if ((PesoBarco - mercadoria.getPeso()) > 0) {
					PesoBarco -= mercadoria.getPeso();

					Barco.put(mercadoria.cnpj, mercadoria);

					showMessageDialog(null, "Carga Cadastrada!");

				} else {
					showMessageDialog(null, "O barco não suporta tanto peso!");

				}
				break;
			case 2:

				Mercadoria mercadoria2 = new Mercadoria();
				mercadoria2.setCnpj(showInputDialog("Digite o CNPJ da Mercadoria"));

				if (Barco.containsKey(mercadoria2.cnpj) == true) {

					showMessageDialog(null, Barco.get(mercadoria2.cnpj));
				} else {
					showMessageDialog(null, "Mercadoria não encontrada");
				}
				break;
			case 3:
				if (Barco.size() == 0) {
					showMessageDialog(null, " Não há mercadorias cadastradas");
				} else {
					String aux = "";
					for (Map.Entry<String,Mercadoria> mercadoria4 : Barco.entrySet()) {
						Mercadoria value = mercadoria4.getValue();
						aux += value.toString();
					}
					showMessageDialog(null, aux);
				}
				break;
			case 4:
				Mercadoria mercadoria3 = new Mercadoria();
				mercadoria3.setCnpj(showInputDialog("Digite o CNPJ da Mercadoria"));

				if (Barco.containsKey(mercadoria3.cnpj) == true) {
					showMessageDialog(null, "Excluindo Mercadoria...");
					PesoBarco += Barco.get(mercadoria3.cnpj).getPeso();
					Barco.remove(mercadoria3.cnpj);
				} else {
					showMessageDialog(null, "Mercadoria não encontrada");
				}
				break;
			}

		} while (menu != 5);
	}

}
