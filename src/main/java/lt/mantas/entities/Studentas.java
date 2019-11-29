package lt.mantas.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "studentai")
public class Studentas {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "vardas")
    private String vardas;

    @Column(name = "pavarde")
    private String pavarde;

    @Column(name = "el_pastas")
    private String elPastas;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "studentas_id")
    public List<Pazymiai> pazymiai;

    public Studentas() {
    }

    public Studentas(String vardas, String pavarde, String elPastas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.elPastas = elPastas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getElPastas() {
        return elPastas;
    }

    public void setElPastas(String elPastas) {
        this.elPastas = elPastas;
    }

    @Override
    public String toString() {
        return "Studentas{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", elPastas='" + elPastas + '\'' +
                ", pazymiai=" + pazymiai +
                '}';
    }
}
