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
 class namek extends raca {
    private String maxregen;//  se regenera caso perca uma batalha e receber stts apos a batalha//
    public namek(int vida, int ki, String tecnica,String maxregen) {
        super(vida, ki, tecnica);
        this.maxregen = maxregen;
    }

    /**
     * @return the maxregen
     */
    public String getMaxregen() {
        return maxregen;
    }

    /**
     * @param maxregen the maxregen to set
     */
    public void setMaxregen(String maxregen) {
        this.maxregen = maxregen;
    }
    
}
