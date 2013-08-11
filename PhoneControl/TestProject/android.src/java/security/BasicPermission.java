/*   */ package java.security;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public abstract class BasicPermission extends Permission
/*   */   implements Serializable
/*   */ {
/*   */   public BasicPermission(String name)
/*   */   {
/* 6 */     super((String)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public BasicPermission(String name, String action) { super((String)null); throw new RuntimeException("Stub!"); } 
/* 8 */   public String getActions() { throw new RuntimeException("Stub!"); } 
/* 9 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.BasicPermission
 * JD-Core Version:    0.6.2
 */