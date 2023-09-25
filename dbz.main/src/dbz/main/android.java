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
 class android extends raca{
    private String infinito;// max em ki//
    public android(int vida, int ki, String tecnica,String infinito) {
        super(vida, ki, tecnica);
        this.infinito = infinito;
        
    }

    /**
     * @return the infinito
     */
    public String getInfinito() {
        return infinito;
    }

    /**
     * @param infinito the infinito to set
     */
    public void setInfinito(String infinito) {
        this.infinito = infinito;
    }
    
}
