/*   */ package java.security;
/*   */ 
/*   */ public final class AccessControlContext
/*   */ {
/*   */   public AccessControlContext(AccessControlContext acc, DomainCombiner combiner)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public AccessControlContext(ProtectionDomain[] context) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void checkPermission(Permission perm) throws AccessControlException { throw new RuntimeException("Stub!"); } 
/* 7 */   public DomainCombiner getDomainCombiner() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.AccessControlContext
 * JD-Core Version:    0.6.2
 */