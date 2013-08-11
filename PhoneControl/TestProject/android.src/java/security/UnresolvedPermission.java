/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.cert.Certificate;
/*    */ 
/*    */ public final class UnresolvedPermission extends Permission
/*    */   implements Serializable
/*    */ {
/*    */   public UnresolvedPermission(String type, String name, String actions, Certificate[] certs)
/*    */   {
/*  6 */     super((String)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public String getUnresolvedName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getUnresolvedActions() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getUnresolvedType() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Certificate[] getUnresolvedCerts() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getActions() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.UnresolvedPermission
 * JD-Core Version:    0.6.2
 */