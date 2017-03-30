package test;

import java.io.*;

public class TestaEntrada {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Digite sua mensagem:");
        String linha = br.readLine(); // primeira linha

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}