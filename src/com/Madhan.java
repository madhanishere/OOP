package com;

// static var,methods do not belong to an object
// cannot call a non-static method from a non–static method unless same class
//cant use this keyword inside a static method
public class Madhan {
    static void main(String[] args) {
        Madhan t1=new Madhan();
        t1.fun();
    }
  void fun(){
      main t2=new main();
      t2.display();

  }

}
