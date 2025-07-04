package corsoBackEnd.entities;

import jakarta.persistence.*;

@Entity
public class Prestito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private  Utente utente;
}
