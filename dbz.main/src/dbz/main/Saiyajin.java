
    package dbz.main;
    class Saiyajin extends raca {
        private  int despertar;// em 100% dobra seus stts//
        public Saiyajin(int vida, int ki, String tecnica, int despertar) {
            super(vida, ki, tecnica);
            this.despertar = despertar;
        } 
        public int getDespertar() {
            return despertar;
        }
        public void setDespertar(int despertar) {
            this.despertar = despertar;
        }

    int getVida() {
            return 0;
    }

    int atacar() {
            return 0;
    }

    int usarTecnicaEspecial() {
            return 0;
    }

    void recuperarVida(int i) {
    }

    }
