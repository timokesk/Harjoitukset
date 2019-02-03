package stackproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timok
 */
public class ListItem {
    private String mData;
    private ListItem mNext;
    
    public ListItem() {
        mNext = null;
    }

    public String getData() {
        return mData;
    }

    public void setData(String mData) {
        this.mData = mData;
    }

    public ListItem getNext() {
        return mNext;
    }

    public void setNext(ListItem mNext) {
        this.mNext = mNext;
    }
    
}
