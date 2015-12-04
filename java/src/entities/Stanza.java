
package entities;


public class Stanza {
    
    private String numero;
    private String nomeStruttura;
    private int tipo;
    private String descrizione;
    private float mq;
    private int agibile;
    private int libera;

    public Stanza() {
        agibile = 1;
        libera = 1;
    }

    public String getNomeStruttura() {
        return nomeStruttura;
    }

    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
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

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getMq() {
        return mq;
    }

    public void setMq(float mq) {
        this.mq = mq;
    }

    public int getAgibile() {
        return agibile;
    }

    public void setAgibile(int agibile) {
        this.agibile = agibile;
    }

    public int getLibera() {
        return libera;
    }

    public void setLibera(int libera) {
        this.libera = libera;
    }

}
