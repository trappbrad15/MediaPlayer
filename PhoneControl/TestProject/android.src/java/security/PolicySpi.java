/*   */ package java.security;
/*   */ 
/*   */ public abstract class PolicySpi
/*   */ {
/*   */   public PolicySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   protected abstract boolean engineImplies(ProtectionDomain paramProtectionDomain, Permission paramPermission);
/*   */ 
/* 6 */   protected void engineRefresh() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected PermissionCollection engineGetPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected PermissionCollection engineGetPermissions(ProtectionDomain domain) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.PolicySpi
 * JD-Core Version:    0.6.2
 */