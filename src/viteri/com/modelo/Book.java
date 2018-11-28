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
public class Book {
    private int id;
    private String  title;
    private Date editionDate;
    private String editorial;
    private String authore[];
    private short isbn;
    private boolean readed;
    private int timereaded;

    public Book() {
    }

    public Book(int id, String title, Date editionDate, String editorial, String[] authore, short isbn, boolean readed, int timereaded) {
        this.id = id;
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authore = authore;
        this.isbn = isbn;
        this.readed = readed;
        this.timereaded = timereaded;
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

    /**
     * @return the isbn
     */
    public short getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(short isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the readed
     */
    public boolean isReaded() {
        return readed;
    }

    /**
     * @param readed the readed to set
     */
    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    /**
     * @return the timereaded
     */
    public int getTimereaded() {
        return timereaded;
    }

    /**
     * @param timereaded the timereaded to set
     */
    public void setTimereaded(int timereaded) {
        this.timereaded = timereaded;
    }
    
}
