import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Livros {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String genero;

    public Livros() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo='" + titulo + '\'' + ", genero='" + genero + '\'' + '}';
    }
}

