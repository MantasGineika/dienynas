package lt.mantas.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pazymiai")
public class Pazymiai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pazymys")
    private int pazymys;

    @Column(name = "studentas_id")
    private int studentas_id;

    @Column(name = "data")
    private LocalDate data;

    public Pazymiai() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPazymys() {
        return pazymys;
    }

    public void setPazymys(int pazymys) {
        this.pazymys = pazymys;
    }

    public int getStudentas_id() {
        return studentas_id;
    }

    public void setStudentas_id(int studentas_id) {
        this.studentas_id = studentas_id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pazymiai{" +
                "id=" + id +
                ", pazymys=" + pazymys +
                ", studentas_id=" + studentas_id +
                ", data=" + data +
                '}';
    }
}
