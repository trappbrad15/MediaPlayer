/*   */ package java.security;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public abstract class Permission
/*   */   implements Guard, Serializable
/*   */ {
/*   */   public Permission(String name)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public final String getName() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void checkGuard(Object obj) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 8 */   public PermissionCollection newPermissionCollection() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract String getActions();
/*   */ 
/*   */   public abstract boolean implies(Permission paramPermission);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.Permission
 * JD-Core Version:    0.6.2
 */