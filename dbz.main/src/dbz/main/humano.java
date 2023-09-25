
package dbz.main;

 class humano extends raca {
    
  private String agilidade; //termina o treinamento em 4 missoes//

    public humano(int vida, int ki, String tecnica,String agilidade) {
        super(vida, ki, tecnica);
        this.agilidade = agilidade;
    }

    public String getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(String agilidade) {
        this.agilidade = agilidade;
    }
     
   
}
