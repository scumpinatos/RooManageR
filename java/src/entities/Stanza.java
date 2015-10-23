
package entities;

/**
 *
 * @author Giandomenico
 */
public class Stanza {
    
    private int idstruttura;
    private String numero;
    private int tipo;

    public Stanza() {
    }

    public int getIdstruttura() {
        return idstruttura;
    }

    public void setIdstruttura(int idstruttura) {
        this.idstruttura = idstruttura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
