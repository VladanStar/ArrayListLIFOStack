package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
    public Main(){
        StackLista stack = new StackLista();
        Student milos = new Student(1650,"Milos","Petrovic");
        Student petar = new Student(1630,"Petar","Stankovic");
        stack.push(milos);
        stack.push(petar);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

