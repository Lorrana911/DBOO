import javax.persistence.*;
import java.util.List;

@Entity
public class Autor {
    @Id
    private int id;

    private String nome;
    private String sobrenome;

    @OneToMany(mappedBy = "autor")
    private List<Livros> livros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
