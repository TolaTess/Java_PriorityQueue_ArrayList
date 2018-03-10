/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpq;

import java.util.*;

/**
 *
 * @author tolaotesanya
 */
public class AList implements ALInterface {
    
    ArrayList<PQElem> PQlist;
    String[] PQres;
    
    public AList(){
        PQlist = new ArrayList<PQElem>();
        PQres = new String[PQlist.size()]; 
    }    
    
    public int findInsertPosition(int priKey)
        {
         boolean found = false; //declare a boolean to check if position of the priority key entered
         int position = 0; //declare and initialse position to 0
         PQElem elem; //declare PQElem object 'elem'
         while(position<PQlist.size() && !found){
             elem = PQlist.get(position); //get position of PQlist and pass to elem class;
             if(elem.getTKey()< priKey){ //check if priorty key is less than new prorityKey. > for higher number priority
                 position++;
             }
             else
             {
                 found = true; 
             }
         }
         return position;
        }//if position is less than PQlist size and not found then it should continue
    
    public void enqueue(int currKey, Object newObj){
           int index = findInsertPosition(currKey); //pass currKey throw findInsertPosition method ans save in index
           PQElem elem = new PQElem(currKey, newObj); //declare and create elem from class PQElem with parameters from contructor
           if(index > PQlist.size()){
               PQlist.add(elem);//add the element if index is higher just save the element
           }
           else
           {
            PQlist.add(index, elem);//add the element in the right index if it is less than size
           }
       
    }
    public Object dequeue(){
        return PQlist.remove(0);
    }
    public Object front(){
        PQElem item = PQlist.get(0);
        String TElement = item.getTElement().toString();
        return TElement;
    }
    public int size(){
        return PQlist.size();
    }
    public boolean isEmpty(){
        PQlist.isEmpty();
        return true;
    }
    
    public String displayList(){
        String[] PQres; // declare an array variable to store input from the Queue
        PQres = new String[PQlist.size()]; // create the array and intialise how many rows
        for(int j = 0; j < PQlist.size(); j++){ 
            PQElem item = PQlist.get(j); // save element in j in item (variable type of PQElem)
            PQres[j] = item.getTElement().toString();
    }
        return Arrays.toString(PQres); // return the array
            
    }
     
}
