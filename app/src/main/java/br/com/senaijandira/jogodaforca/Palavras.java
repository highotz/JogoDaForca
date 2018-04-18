package br.com.senaijandira.jogodaforca;

/**
 * Created by 17170095 on 18/04/2018.
 */

public class Palavras {

    private String palavra;
    private String dica;


    public Palavras(String palavra, String dica){
        this.palavra = palavra;
        this.dica = dica;
    }


    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String descricao) {
        this.dica = dica;
    }
}
