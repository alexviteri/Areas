/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viteri.com.modelo;

/**
 *
 * @author USER
 */
public class Chapter {
    private int id;
    private int duracion;
    private String  title;
    private short year;
    private boolean viewed;
    private int timeViewer;
    private int sessionNumber;

    public Chapter() {
    }

    public Chapter(int id, int duracion, String title, short year, boolean viewed, int timeViewer, int sessionNumber) {
        this.id = id;
        this.duracion = duracion;
        this.title = title;
        this.year = year;
        this.viewed = viewed;
        this.timeViewer = timeViewer;
        this.sessionNumber = sessionNumber;
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
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the timeViewer
     */
    public int getTimeViewer() {
        return timeViewer;
    }

    /**
     * @param timeViewer the timeViewer to set
     */
    public void setTimeViewer(int timeViewer) {
        this.timeViewer = timeViewer;
    }

    /**
     * @return the sessionNumber
     */
    public int getSessionNumber() {
        return sessionNumber;
    }

    /**
     * @param sessionNumber the sessionNumber to set
     */
    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    
}
