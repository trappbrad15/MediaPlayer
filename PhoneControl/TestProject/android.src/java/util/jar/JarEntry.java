/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.CodeSigner;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.zip.ZipEntry;
/*    */ 
/*    */ public class JarEntry extends ZipEntry
/*    */ {
/*    */   public JarEntry(String name)
/*    */   {
/*  5 */     super((ZipEntry)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public JarEntry(ZipEntry entry) { super((ZipEntry)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public JarEntry(JarEntry je) { super((ZipEntry)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public Attributes getAttributes() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Certificate[] getCertificates() { throw new RuntimeException("Stub!"); } 
/* 10 */   public CodeSigner[] getCodeSigners() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.jar.JarEntry
 * JD-Core Version:    0.6.2
 */