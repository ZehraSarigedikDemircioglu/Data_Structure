package com.cydeo.CarPersonExample;

public class ReferenceTypeTestApp {

    public static void main(String[] args) {

        Car car = new Car("Audi", "A4");

        System.out.println(car); // this is address of car object, Car@1d251891
        System.out.println(new Car("Audi", "A4")); // 1.class types: this reference type points to an object of a class

        int[] arr = new int[5];
        System.out.println(arr); // [I@58ceff1, this gives address of arr
        // 2.array types: this reference type points to an array

        // 3.interface types: this reference type points to an object of a class which implements an interface

        System.out.println("-----------------------------------------------------------------------");

        // a Node store the address of another object

        Person person1 = new Person("Michael", new Car("Audi", "A4"));
        System.out.println(person1); // this gives address of person obj
        Person person2 = new Person("MichaelNext", new Car("BMW", "3 Series"));
        person1.next = person2;
        System.out.println(person1.next); // Person@2133c8f8
        System.out.println(person2); // Person@2133c8f8, line 26-27 prints same
        Person current = person2;
        System.out.println(current); // all are same
    }
}
