/*   */ package javax.security.auth;
/*   */ 
/*   */ import java.security.DomainCombiner;
/*   */ import java.security.ProtectionDomain;
/*   */ 
/*   */ public class SubjectDomainCombiner
/*   */   implements DomainCombiner
/*   */ {
/*   */   public SubjectDomainCombiner(Subject subject)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Subject getSubject() { throw new RuntimeException("Stub!"); } 
/* 7 */   public ProtectionDomain[] combine(ProtectionDomain[] currentDomains, ProtectionDomain[] assignedDomains) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.security.auth.SubjectDomainCombiner
 * JD-Core Version:    0.6.2
 */