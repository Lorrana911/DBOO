import javax.persistence.Entity;
@Entity

public class LivroDigital extends Livros{
    private String formato;
    private String plataforma;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
