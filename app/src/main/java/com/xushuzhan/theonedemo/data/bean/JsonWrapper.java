package com.xushuzhan.theonedemo.data.bean;

/**
 * Created by xushuzhan on 2017/11/27.
 */

public class JsonWrapper<T> {
    private int res;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
