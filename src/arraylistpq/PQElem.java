/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpq;

/**
 *
 * @author tolaotesanya
 */
public class PQElem {
    
    private int tKey;
    private Object tElement;
    
    public PQElem(int tKey, Object tElement){
        this.tKey = tKey;
        this.tElement = tElement;
    }
    
    public void setTKey(int tKey){
        this.tKey = tKey;
    }
    
    public void setTElement(Object tElement){
        this.tElement = tElement;
    }
    public int getTKey(){
        return tKey;
    }
    
    public Object getTElement(){
        return tElement;
    }
    
}
