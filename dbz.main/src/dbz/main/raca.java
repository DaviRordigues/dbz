
        package dbz.main;


        public abstract class raca {
            private int vida;
            private int ki;
            private String tecnica;

         public raca(int vida,int ki,String tecnica){
               this.ki = ki;
               this.tecnica = tecnica;
               this.vida = vida;
            }
            public void setVida(int vida) {
                this.vida = vida;
            }
            public int getKi() {
                return ki;
            }

            public void setKi(int ki) {
                this.ki = ki;
            }
            public String getTecnica() {
                return tecnica;
            }

            public void setTecnica(String tecnica) {
                this.tecnica = tecnica;
            }

    int atacar() {
                return 0;
    }

    int getVida() {
                return 0;
    }

        }
