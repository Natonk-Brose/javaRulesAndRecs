package AneelRecs;

public class MET53 {
  /**
   * Compliant Code
   **/
  class Test implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
      /**
       * Super class is called on line 8 in order to clone
       **/
    }
  }

  /**
   * Class that is being copied
   **/
  class Derived extends Test {
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
      /**
       * This will work because the super class was called before
       **/
    }
  }
}
