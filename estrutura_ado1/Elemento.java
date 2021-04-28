package estrutura_ado1;

public class Elemento {
    
    private Elemento ant;
    private Object objeto;

    public Elemento() {
    }

    public Elemento(Elemento ant, Object objeto) {
        this.ant = ant;
        this.objeto = objeto;
    }

    public Elemento getAnt() {
        return ant;
    }

    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    public Object getObject() {
        return objeto;
    }

    public void setObject(Object objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return " " + objeto;
    }
    
    
}
