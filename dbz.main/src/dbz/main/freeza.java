/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbz.main;

/**
 *
 * @author dbezerra
 */
 class freeza extends raca {
    private int crueldade; //  aumenta em 0.1 a 0.9 os atts//
    private String transformacao;// ao se trasnformar  freeza  dobra seus stts//
    public freeza(int vida, int ki, String tecnica,int crueldade,String transformacao) {
        super(vida, ki, tecnica);
        this.crueldade = crueldade;
        this.transformacao = transformacao;
    }

    /**
     * @return the crueldade
     */
    public int getCrueldade() {
        return crueldade;
    }

    /**
     * @param crueldade the crueldade to set
     */
    public void setCrueldade(int crueldade) {
        this.crueldade = crueldade;
    }

    /**
     * @return the transformacao
     */
    public String getTransformacao() {
        return transformacao;
    }

    /**
     * @param transformacao the transformacao to set
     */
    public void setTransformacao(String transformacao) {
        this.transformacao = transformacao;
    }
    
}
