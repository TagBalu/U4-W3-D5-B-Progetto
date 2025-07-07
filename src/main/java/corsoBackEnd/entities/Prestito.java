package corsoBackEnd.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private  Utente utente;



    private  Catalogo elemntoPrestato;

    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    public Prestito(){}


    public Long getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public Catalogo getElemntoPrestato() {
        return elemntoPrestato;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }
}
