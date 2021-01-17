package GUI;

public class linkNode {
    private String data;
    private linkNode next; // pointer holding the addr
    private linkNode prev; // of a similar node
    
    public linkNode (String d) {
        //this (d,null);
       data = d;
       next = null;
       prev = null;
    }
    
    public linkNode (String d, linkNode nxt){
        data = d;
        next = nxt;
        prev = null;
    }
    
    public String getData (){
        return data;
    }
    
    public linkNode getNext ()  {
        return next;
    }
    
    public linkNode getPrev () {
        return prev;
    }
    
    public void setData (String d){
        data = d;
    }
    
    public void setNext (linkNode ptr){
        next = ptr;
    }
    
    public void setPrev (linkNode ptr) {
        prev = ptr;
    }
}


