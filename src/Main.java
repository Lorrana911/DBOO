import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb");
        EntityManager em = emf.createEntityManager();


        try {

            em.getTransaction().begin();

            Livros livro1 = new Livros();
            livro1.setTitulo("O Fundador da Cultivação Demoniaca");
            livro1.setGenero("Romance");
            livro1.setId(1L);
            System.out.println("Criando o objeto: " + livro1);

            em.persist(livro1);
            System.out.println("Objeto persistido. Aguardando commit...");


            em.getTransaction().commit();
            System.out.println("Commit realizado! O livro foi salvo no banco.");

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