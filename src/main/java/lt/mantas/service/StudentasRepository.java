package lt.mantas.service;

import lt.mantas.entities.Studentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentasRepository extends JpaRepository<Studentas, Integer> {
}
