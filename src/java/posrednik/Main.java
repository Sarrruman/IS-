package posrednik;

import beans.Adresa;
import beans.Apartman;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

     public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("PosrednikPU");
          EntityManager em = emf.createEntityManager();
          
          
          em.getTransaction().begin();
          
          Apartman apartman = new Apartman();
          apartman.setIme("apartman1");
          Adresa adr= new Adresa();
          adr.setBroj(4);
          adr.setDrzava("Meksiko");
          adr.setUlica("Pozarevacka");
          adr.setGrad("Pozarevac");
          adr.setOpis("...");
          
          apartman.setAdresa(adr);
          
          em.persist(apartman);
          em.getTransaction().commit();
     }
}
