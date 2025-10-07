import javax.persistence.Entity;
@Entity
public class LivroImpresso extends Livros{
    private int etiqueta;

    public int getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }
}
