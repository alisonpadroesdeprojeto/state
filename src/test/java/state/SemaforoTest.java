package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemaforoTest {

    Semaforo semaforo;

    @BeforeEach
    public void setUp() {
        semaforo = new Semaforo();
    }

    // Semaforo Verde
    @Test
    public void naoDeveFicarVerdeSemaforoVerde() {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        assertFalse(semaforo.ficarVerde());
    }

    @Test
    public void deveFicarAmareloSemaforoVerde() {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        assertTrue(semaforo.ficarAmarelo());
        assertEquals(SemaforoEstadoAmarelo.getInstance(), semaforo.getEstado());
    }

    @Test
    public void naoDeveFicarVermelhoSemaforoVerde() {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        assertFalse(semaforo.ficarVermelho());
    }

    // Semaforo Amarelo
    @Test
    public void deveFicarVerdeSemaforoAmarelo() {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        assertTrue(semaforo.ficarVerde());
        assertEquals(SemaforoEstadoVerde.getInstance(), semaforo.getEstado());
    }

    @Test
    public void naoDeveFicarAmareloSemaforoAmarelo() {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        assertFalse(semaforo.ficarAmarelo());
    }

    @Test
    public void deveFicarVermelhoSemaforoAmarelo() {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        assertTrue(semaforo.ficarVermelho());
        assertEquals(SemaforoEstadoVermelho.getInstance(), semaforo.getEstado());
    }

    // Semaforo Vermelho
    @Test
    public void naoDeveFicarVerdeSemaforoVermelho() {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        assertFalse(semaforo.ficarVerde());
    }

    @Test
    public void deveFicarAmareloSemaforoVermelho() {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        assertTrue(semaforo.ficarAmarelo());
        assertEquals(SemaforoEstadoAmarelo.getInstance(), semaforo.getEstado());
    }

    @Test
    public void naoDeveFicarVermelhoSemaforoVermelho() {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        assertFalse(semaforo.ficarVermelho());
    }
}