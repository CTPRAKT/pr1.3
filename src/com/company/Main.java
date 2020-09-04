package com.company;

public class Main {

    public static void main(String[] args) {
	ball n1=new ball("rubber",5);
    ball n2=new ball("cloth",7);
    ball n3=new ball("leather",8);
        System.out.println(n1.getMaterial()+"   "+n1.getRadius()+"\n"+n2.getMaterial()+"   "+n2.getRadius()+"\n"+n3.getMaterial()+"   "+n3.getRadius());
    }
}
