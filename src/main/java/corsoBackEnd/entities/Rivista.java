package corsoBackEnd.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Rivista extends Catalogo {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista(){}

    public Rivista(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                '}';
    }
}
