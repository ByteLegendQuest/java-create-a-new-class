public class Cat {

private String name;

public Cat(String name){

this.name=name;

}

public String show(){

return name;

}

}

package com.zw.work;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.List;

public class CatTest {

public static void main(String[] args) {

Listlist=new LinkedList();

list.add(new Cat("白猫"));

list.add(new Cat("黑猫"));

list.add(new Cat("花猫"));

for (Cat cat : list) {

System.out.println(cat.show());

}

