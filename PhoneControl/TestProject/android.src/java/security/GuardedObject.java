/*   */ package java.security;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public class GuardedObject
/*   */   implements Serializable
/*   */ {
/*   */   public GuardedObject(Object object, Guard guard)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Object getObject() throws SecurityException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.GuardedObject
 * JD-Core Version:    0.6.2
 */