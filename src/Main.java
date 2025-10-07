import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb");
        EntityManager em = emf.createEntityManager();


        try {

            em.getTransaction().begin();

            LivroDigital livro1Digital = new LivroDigital();
            livro1Digital.setTitulo("Carry On");
            livro1Digital.setGenero("Romance");
            livro1Digital.setId(2L);
            livro1Digital.setFormato("EPUB");
            livro1Digital.setPlataforma("Amazon (Kindle Unlimited");
            em.persist(livro1Digital);

            em.getTransaction().commit();
            System.out.println("Commit realizado bb");

        } finally {
            if (em.isOpen()) {
                em.close();
            }
            if (emf.isOpen()) {
                emf.close();
            }
        }
    }
}