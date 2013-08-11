/*    */ package java.security;
/*    */ 
/*    */ public class ProtectionDomain
/*    */ {
/*    */   public ProtectionDomain(CodeSource cs, PermissionCollection permissions)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public ProtectionDomain(CodeSource cs, PermissionCollection permissions, ClassLoader cl, Principal[] principals) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final CodeSource getCodeSource() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final PermissionCollection getPermissions() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Principal[] getPrincipals() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.ProtectionDomain
 * JD-Core Version:    0.6.2
 */