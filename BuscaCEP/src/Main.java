import javax.swing.*;

import static javax.swing.JOptionPane.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ConsultaCep consultaCep =  new ConsultaCep();

        var cep = showInputDialog("Digite um CEP para a busca");

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.cirarJson(endereco);
            showMessageDialog(null, "Arquivo contendo as informações gerado com sucesso!");
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            showMessageDialog(null, "Finalizando o Programa");
        }
    }
}
