/*   */ package java.net;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.security.Permission;
/*   */ 
/*   */ public final class SocketPermission extends Permission
/*   */   implements Serializable
/*   */ {
/*   */   public SocketPermission(String host, String action)
/*   */   {
/* 6 */     super((String)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public String getActions() { throw new RuntimeException("Stub!"); } 
/* 8 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.SocketPermission
 * JD-Core Version:    0.6.2
 */