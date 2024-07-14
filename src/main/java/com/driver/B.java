package com.driver;


public class B extends A {
     @Override
     public String meth(){
         return "Method is overridden in Extended class B";
     }
     public static void main(String[] args) {
          A a = new A();
          B b = new B();
     }
}

