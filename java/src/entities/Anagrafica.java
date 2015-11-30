
package entities;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Giandomenico
 */
public class Anagrafica {
    
    public final static int PROPRIETARIO = 1;
    public final static int DIRIGENTE = 2;
    public final static int PORTINAIO = 3;
    
    private String codicefiscale;
    private String nome;
    private String cognome;
    private long datanascita;
    private String indirizzo;
    private String nazionalita;
    private String numerodocumento;
    private int tipodocumento;
    private String telefono;
    private String cellulare;
    private String email;
    private int tipoMansione;

    public Anagrafica() {
    }
    
    public String getCodicefiscale() {
        return codicefiscale;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public long getDatanascita() {
        return datanascita;
    }

    public void setDatanascita(long datanascita) {
        this.datanascita = datanascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public int getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(int tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoMansione() {
        return tipoMansione;
    }

    public void setTipoMansione(int tipoMansione) {
        this.tipoMansione = tipoMansione;
    }
    
    public int getEta() {
        int now = new GregorianCalendar().getTime().getYear();
        int nascita = new Date(datanascita).getYear();
        return now - nascita;
    }

}
