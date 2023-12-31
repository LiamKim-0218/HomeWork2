package c230904;


//class Apple{}
//class Pencil{}
//
//class Goods<T extends Fruit>{ //extends 키워드는 상속을 하라는 의미가 아니라 최상위클래스 인터페이스를 지정해주는 것,즉 범위를 지정해준다. 여기까지만! 느낌
//   
//}

//class A{}
//class B extends A{}
//class C extends B{}
//class D <T extends B>{
//   
//   private T t;
//   
//   public T get() {
//      return t;
//   }
//   public void Set(T t) {
//      this.t = t;
//   }
//}


//제네릭 클래스의 타입제한!
//접근 지정자 class 클래스명<T extends 최상위클래스 / 인터페이스명>{}

//제네릭 메서드 타입제한
//접근 지정가<T extends 최상위 클래스/인터페이스> T 메서드(T t){}

//class GenericMethod01{
//   public <T> void test(T t) {
//      char c = t.charAt(0);
//   }
//   public <T extends String> void method2(T t) {
//      char c = t.charAt(0);
//   }
//}

class GenericMethod01{
   public <T extends Number> void Method1(T t) {
      System.out.println(t.intValue());
   }
}
interface MyInterface{
   public abstract void print();
}
class B{
   public <T extends MyInterface> void Method01(T t) {
      t.print();
   }
}


public class Generic02 {
   
   public static void main(String[] args) {
      
//      D<A> d1=new D<>();
//      D<B> d2=new D<>();
//      D<C> d3=new D<>();
      
      GenericMethod01 g = new GenericMethod01();
      g.Method1(5.5);
      
      B b = new B();
      b.Method01(new MyInterface() {
         
         @Override
         public void print() {
            System.out.println("print()구현");
         }
   
      });
   }
}