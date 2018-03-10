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
public interface ALInterface {
    
  public void enqueue(int currKey, Object newObj);
  public Object dequeue();
  public Object front();
  public int size();
  public boolean isEmpty();
  public String displayList();

  
    
}
