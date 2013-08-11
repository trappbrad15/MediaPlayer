/*   */ package java.lang.reflect;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public class Proxy
/*   */   implements Serializable
/*   */ {
/*   */   protected InvocationHandler h;
/*   */ 
/*   */   protected Proxy(InvocationHandler h)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static Class<?> getProxyClass(ClassLoader loader, Class<?>[] interfaces) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 7 */   public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 8 */   public static boolean isProxyClass(Class<?> cl) { throw new RuntimeException("Stub!"); } 
/* 9 */   public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.reflect.Proxy
 * JD-Core Version:    0.6.2
 */