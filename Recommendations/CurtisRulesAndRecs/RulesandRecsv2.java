//Curtis Bryant Rules and Recs
// Project 1

/* START OF RULES */

// ENV00-J: Do not sign code that performs only unprivleged operations
/** 
* Unprivileged class
*/ 
public class Unprivileged {
    public static void main(String[] args) {
      /**
       * Perform only unprivileged operations 
       */ 
      System.out.println("Hello world!");
    }
  }

/**
 * Privileged class
 */
public class Privileged {
    public static void main(String[] args) {
        /**
         * Perform privileged operations
         */
        System.setProperty("java.home", "/tmp");
        System.out.println(System.getProperty("java.home"));
    }
}

/* ------------------------------------------------------------- */

// ENV01-J: Place all security-sensitive code in a single JAR file and seal it
/**
 * Security-sensitive class
 */
package trusted;

public class Sensitive {
    public static void doPrivilegedAction() {
        /**
         * Perform privileged action
         */
        System.setProperty("java.home", "/tmp");
        System.out.println(System.getProperty("java.home"));
    }
}

/**
 * Trusted class
 */
package trusted;

public class Trusted {
    public static void main(String[] args) {
      /**
       * Invoke security-sensitive class
       */ 
      Sensitive.doPrivilegedAction();
    }
  }

/**
 * The following is added to the Manitfest File
 */

Name:trusted/Sealed:true

/* ------------------------------------------------------------- */

// ENV03-J: Do not grant dangerous combinations of permissions
/**
 * Compliant Code Example (PermissionCollection)
 * This compliant solution shows an overridden getPermissions() method,
 * defined in a custom class loader. It grants java.lang.RuntimePermission
 * with target setSecurityManager only to classes that it loads from a
 * trusted location.
 */

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;

public class CustomClassLoader extends URLClassLoader {
      private final URL trustedLocation;
  
      public CustomClassLoader(URL[] urls) {
          super(urls);
          /**
           * Trusted location is first element of array urls
           */
          trustedLocation = urls[0];
      }
  
      @Override
      protected PermissionCollection getPermissions(CodeSource codesource) {
          PermissionCollection perms = super.getPermissions(codesource);
          if (codesource.getLocation().equals(trustedLocation)) {
              /**
               * Grant permission to set security manager for classes from trusted location
               */ 
              perms.add(new RuntimePermission("setSecurityManager"));
          }
          return perms;
      }}
  
      /* ------------------------------------------------------------- */
  
      // ENV04-J: Do not disable bytecode verification
      /**
       * Noncompliant Code Example
       * The -Xverify:none flag on the JVM command line suppresses
       * the verification process
       */ 
      java-Xverify:
  
      none MyClass
  
      /**
       * Compliant Solution
       */ 
      java MyClass
  
      /* ------------------------------------------------------------- */
  
      // ENV05-J: Do not deploy an application that can be remotely monitored
      /**
       * Noncompliant Code Example
       * The -Dcom.sun.management.jmxremote.port=9999 flag on
       * the JVM command line enables remote monitoring via JMX
       * java-Dcom.sun.management.jmxremote.port=9999
       */ 
      MyApp
  
      /**
       * Compliant Solution
       */ 
      java MyApp
  
      /* ------------------------------------------------------------- */
  
      /* START OF RECOMMENDATIONS */

      // OBJ50-J: Never confuse the immutability of a reference with that of a referenced object
      /**
       * Noncompliant Code Example
       */ 
      public class Foo {
          private final int[] array = new int[10];
  
          public int[] getArray() {
              return array;
          }
      }
  
      /**
       * Compliant Solution
       */ 
      public class Foo {
          private final int[] array = new int[10];
  
          public int[] getArray() {
              return Arrays.copyOf(array, array.length);
          }
      }
  
      /* ------------------------------------------------------------- */
  
      // OBJ51-J: Minimize that accessibility of classes and their memebers
      /**
       * Compliant Solution
       */ 
      public class Foo {
          private int x; // Private field
  
          public int getX() { // Public getter method
              return x;
          }
  
          public void setX(int x) { // Public setter method
              this.x = x;
          }
  
          private void bar() { // Private method
              // ...
          }
      }
  
      /* ------------------------------------------------------------- */
  
      // OBJ52-J: Write garbage-collection-friendly code
      /**
       * Noncompliant Code Example
       */ 
      public class Foo {
          private static final List<String> list = new ArrayList<>();
  
          public void add(String s) {
              list.add(s);
          }
      }
  
      /**
       * Compliant Solution
       */ 
      public class Foo {
          private static final Map<String, Boolean> map = new WeakHashMap<>();
  
          public void add(String s) {
              map.put(s, Boolean.TRUE);
          }
      }
  
      /* ------------------------------------------------------------- */
  
      // OBJ54-J: Do not attempt to help the garbage collector by setting local reference variables to null
      /**
       * Noncompliant Code Example
       */ 
        public class Foo {
            public void bar() {
              // Do something with obj
              Object obj = new Object();
              // Setting obj = null does not help the garbage collector
              obj = null;
          }
      }
  
      /**
       * Compliant Solution
       */ 
        public class Foo {
            public void bar() {
              // Do something with obj
            Object obj = new Object();
              // No need to set obj = null here
        }
     }