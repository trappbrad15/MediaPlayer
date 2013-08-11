/*   */ package java.security.cert;
/*   */ 
/*   */ public abstract class CRL
/*   */ {
/*   */   protected CRL(String type)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public final String getType() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract boolean isRevoked(Certificate paramCertificate);
/*   */ 
/*   */   public abstract String toString();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.CRL
 * JD-Core Version:    0.6.2
 */