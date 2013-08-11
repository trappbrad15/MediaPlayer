/*    */ package java.security.cert;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.util.Date;
/*    */ import javax.security.auth.x500.X500Principal;
/*    */ 
/*    */ public abstract class X509CRLEntry
/*    */   implements X509Extension
/*    */ {
/*    */   public X509CRLEntry()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract byte[] getEncoded() throws CRLException;
/*    */ 
/*    */   public abstract BigInteger getSerialNumber();
/*    */ 
/* 10 */   public X500Principal getCertificateIssuer() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public abstract Date getRevocationDate();
/*    */ 
/*    */   public abstract boolean hasExtensions();
/*    */ 
/*    */   public abstract String toString();
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.X509CRLEntry
 * JD-Core Version:    0.6.2
 */