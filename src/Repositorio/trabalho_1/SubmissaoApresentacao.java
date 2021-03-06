/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio.trabalho_1;

import java.util.List;

/**
 *
 * @author leona_000
 */
public abstract class SubmissaoApresentacao extends Submissao {

    protected String resumo;
    protected String abstrac;
    protected int duracao;

    public SubmissaoApresentacao(String resumo, String abstrac, int duracao, String tituloSubmissao, Situacao situacaoSubmissao, List<String> autores, int MAX_AUTORES) {
        super(tituloSubmissao, situacaoSubmissao, autores, MAX_AUTORES);
        this.resumo = resumo;
        this.abstrac = abstrac;
        this.duracao = duracao;
    }

    /**
     * @return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * @return the abstrac
     */
    public String getAbstrac() {
        return abstrac;
    }

    /**
     * @param abstrac the abstrac to set
     */
    public void setAbstrac(String abstrac) {
        this.abstrac = abstrac;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * Metodo que trasnforma o atributo duração da submissao, em uma String no
     * formato HH:MM
     *
     * @return String da duração da submissao, no formato HH:MM
     */
    private String duracaoToString() {
        int h, m;

        h = this.duracao / 60;
        m = this.duracao % 60;

        return h + ":" + m;
    }

    /**
     * Metodo que transforma os dados da submissao em String
     * @return String dos dadosf
     */
    @Override
    public String toString() {
        String string = "";
        string = super.toString()
                + "\n4- Resumo: " + getResumo()
                + "\n5- Abstract: " + getAbstrac()
                + "\n6- Duração: " + duracaoToString() + " horas";
        return string;
    }

}
