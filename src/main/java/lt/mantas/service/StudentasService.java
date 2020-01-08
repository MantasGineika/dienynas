package lt.mantas.service;

import lt.mantas.entities.Studentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentasService {

    @Autowired
    private StudentasRepository repo;

    public List<Studentas> listAll() {
        return repo.findAll();
    }

    public void save(Studentas studentas) {
        repo.save(studentas);
    }

    public Studentas get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
