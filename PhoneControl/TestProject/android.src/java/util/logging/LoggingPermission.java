/*   */ package java.util.logging;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.security.BasicPermission;
/*   */ import java.security.Guard;
/*   */ import java.security.Permission;
/*   */ 
/*   */ public final class LoggingPermission extends BasicPermission
/*   */   implements Guard, Serializable
/*   */ {
/*   */   public LoggingPermission(String name, String actions)
/*   */   {
/* 6 */     super((String)null, (String)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public String getActions() { throw new RuntimeException("Stub!"); } 
/* 8 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.logging.LoggingPermission
 * JD-Core Version:    0.6.2
 */