package lt.mantas;

import lt.mantas.entities.Pazymiai;
import lt.mantas.entities.Studentas;

import javax.persistence.EntityManager;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        grazintiDuomenis();
        kursoVidurkis();
//        grazintiStudenta(1);

    }


    public static void grazintiDuomenis() {
        EntityManager em = HibernateUtils.getEntityManager();
        try {
            em.getTransaction().begin();


            List<Studentas> list = em.createQuery("from Studentas s").getResultList();
            List<Studentas> sorted = list.stream()
                    .sorted(Comparator.comparing(Studentas::getPavarde).thenComparing(Studentas::getVardas))
                    .collect(Collectors.toList());

            sorted.forEach(studentas -> System.out.println( studentas.getVardas() + " " + studentas.getPavarde()));



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

            OptionalDouble vidurkis = list.stream()
                    .filter(pazymiai -> pazymiai.getPazymys() != null)
                    .mapToDouble(Pazymiai::getPazymys)
                    .average();



            System.out.println(vidurkis);

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
