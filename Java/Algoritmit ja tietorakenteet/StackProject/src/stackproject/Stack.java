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
public class Stack {
    private ListItem mTop;
    private int mSize;
    
    public Stack() {
        mTop = null;
        mSize = 0;
    }
    
    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData) {
        ListItem currentItem = new ListItem();
        currentItem.setData(aData);
        currentItem.setNext(mTop);
        mTop = currentItem;
        mSize++;
    }
    
    // poista alkio pinon huipulta - jos pinossa ei alkioita, palauta null
    public ListItem pop() {
        if (mSize == 0) {
            return null;
        }
        else {
            ListItem apu = mTop;
            mTop = mTop.getNext();
            mSize--;
            return apu;
        }
    }
    
    // listataan pinon sisältö
    public void printItems() {
        ListItem apu = mTop;
        for (int i = 0; i < mSize; i++) {
            System.out.println(apu.getData());
            apu = apu.getNext();
        }
    }
    
    public int getSize() {
        return mSize;
    }
}
