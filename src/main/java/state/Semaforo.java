package state;

public class Semaforo {

    private SemaforoEstado estado;

    public Semaforo() {
        this.estado = SemaforoEstadoVerde.getInstance();
    }

    public void setEstado(SemaforoEstado estado) {
        this.estado = estado;
    }

    public boolean ficarVerde() {
        return estado.ficarVerde(this);
    }

    public boolean ficarAmarelo() {
        return estado.ficarAmarelo(this);
    }

    public boolean ficarVermelho() {
        return estado.ficarVermelho(this);
    }

    public SemaforoEstado getEstado() {
        return estado;
    }
}