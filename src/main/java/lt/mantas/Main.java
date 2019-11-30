package lt.mantas;

import lt.mantas.entities.Pazymiai;
import lt.mantas.entities.Studentas;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        grazintiDuomenis();
        kursoVidurkis();

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

            List<Studentas> list = em.createQuery("from Studentas ORDER BY pavarde, vardas ASC").getResultList();
            System.out.println(list);

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void kursoVidurkis(){
        int x = 0;
        EntityManager em = HibernateUtils.getEntityManager();
        try {
            em.getTransaction().begin();

            List<Pazymiai> list = em.createQuery("from Pazymiai").getResultList();
            double z = 0;
            for (Pazymiai p : list){
                double y = p.getPazymys();
                z += y;
            }
            double vidurkis = z / list.size();
            System.out.println(z);
            System.out.println(vidurkis);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
