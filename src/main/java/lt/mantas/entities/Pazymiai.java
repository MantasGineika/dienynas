package lt.mantas.entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pazymiai")
public class Pazymiai {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "studentas_id")
    private int studentasId;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "pazymys")
    private int pazymys;

    public Pazymiai() {
    }

    public Pazymiai(int studentasId, LocalDate data, int pazymys) {
        this.studentasId = studentasId;
        this.data = data;
        this.pazymys = pazymys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentasId() {
        return studentasId;
    }

    public void setStudentasId(int studentasId) {
        this.studentasId = studentasId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getPazymys() {
        return pazymys;
    }

    public void setPazymys(int pazymys) {
        this.pazymys = pazymys;
    }

    @Override
    public String toString() {
        return "data =" + data +
                ", pazymys =" + pazymys;
    }
}
