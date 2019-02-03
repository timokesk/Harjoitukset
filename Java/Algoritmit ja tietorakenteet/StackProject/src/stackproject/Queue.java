/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

/**
 *
 * @author timok
 */
public class Queue {
    private ListItem head;
    private ListItem tail;
    private int size;
    
    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public void push(String aData) {
        ListItem currentItem = new ListItem();
        currentItem.setData(aData);
        currentItem.setNext(tail);
        tail = currentItem;
        if (size == 0) {
            head = currentItem;
        }
        size++;
    }
    
    public ListItem pop() {
        if (size == 0) {
            return null;
        }
        else {
            ListItem apu = head;
            size--;
            ListItem apu2 = tail;
            for (int i = 0; i < size-1; i++) {
                apu2 = apu2.getNext();
            }
            head = apu2;
            return apu;
        }
    }
    
    public void printItems() {
        ListItem apu = tail;
        for (int i = 0; i < size; i++) {
            System.out.println(apu.getData());
            apu = apu.getNext();
        }
    }
    
    public int getSize() {
        return size;
    }
}
