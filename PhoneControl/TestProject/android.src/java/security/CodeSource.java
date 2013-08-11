/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.net.URL;
/*    */ import java.security.cert.Certificate;
/*    */ 
/*    */ public class CodeSource
/*    */   implements Serializable
/*    */ {
/*    */   public CodeSource(URL location, Certificate[] certs)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CodeSource(URL location, CodeSigner[] signers) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final Certificate[] getCertificates() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final CodeSigner[] getCodeSigners() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final URL getLocation() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean implies(CodeSource cs) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.CodeSource
 * JD-Core Version:    0.6.2
 */