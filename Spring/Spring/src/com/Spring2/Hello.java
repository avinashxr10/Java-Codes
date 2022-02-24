package com.Spring2;

public class Hello {
    private A aobj;
    private B bobj;

    public void setAobj(A aobj){
        this.aobj = aobj;
    }

    public void setBobj(B bobj){
        this.bobj = bobj;
    }

    public void show(){
        aobj.ShowA();
        bobj.showB();
    }
}
