package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:05
 */
//命令的真正接受者
public class TVReceiver {

    public void on(){
        System.out.println("TVReceiver ... 打开 ... ");
    }

    public void off(){
        System.out.println("TVReceiver ... 关闭 ... ");
    }

}
