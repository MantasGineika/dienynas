package lt.mantas;

import lt.mantas.entities.Pazymiai;
import lt.mantas.entities.Studentas;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        grazintiDuomenis();
//        kursoVidurkis();
//        grazintiStudenta(1);

    }


    public static void grazintiDuomenis() {
        EntityManager em = HibernateUtils.getEntityManager();
        try {
            em.getTransaction().begin();

//            List<Studentas> list = new ArrayList<>();
//            Studentas std = em.find(Studentas.class,2);
//            Studentas std1 = em.find(Studentas.class,1);
//            list.add(std);
//            list.add(std1);

            List<Studentas> list = em.createQuery("from Studentas s").getResultList();
            list.stream()
                    .filter(studentas -> studentas.getId() == 1)
                    .forEach(studentas -> System.out.println(studentas.getVardas() + " " + studentas.getPazymiai()));


            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void kursoVidurkis() {
        EntityManager em = HibernateUtils.getEntityManager();
        try {
            em.getTransaction().begin();

            List<Pazymiai> list = em.createQuery("from Pazymiai").getResultList();
            //pabandyti su collection streamu
            double z = 0;
            for (Pazymiai p : list) {
                double y = p.getPazymys();
                z += y;
            }
            double vidurkis = z / list.size();
            System.out.println("Kurso vidurkis yra: " + vidurkis);

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void grazintiStudenta(int id) {
        EntityManager em = HibernateUtils.getEntityManager();
        try {
            em.getTransaction().begin();

            List<Studentas> list = new ArrayList<>();
            Studentas std = em.find(Studentas.class, id);
            list.add(std);

            System.out.println(std);

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
