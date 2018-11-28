/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viteri.com.modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Magazine {
    private int id;
    private String  title;
    private Date editionDate;
    private String editorial;
    private String authore[];

    public Magazine() {
    }

    public Magazine(int id, String title, Date editionDate, String editorial, String[] authore) {
        this.id = id;
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authore = authore;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the editionDate
     */
    public Date getEditionDate() {
        return editionDate;
    }

    /**
     * @param editionDate the editionDate to set
     */
    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the authore
     */
    public String[] getAuthore() {
        return authore;
    }

    /**
     * @param authore the authore to set
     */
    public void setAuthore(String[] authore) {
        this.authore = authore;
    }
    
}
