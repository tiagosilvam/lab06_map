package instutuicao.infraestrutura;

public class Sala {

    private String sala;

    public Sala(String sala) {
        setSala(sala);
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return getSala();
    }
}