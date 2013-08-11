/*   */ package java.util.jar;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ import java.util.zip.ZipEntry;
/*   */ import java.util.zip.ZipOutputStream;
/*   */ 
/*   */ public class JarOutputStream extends ZipOutputStream
/*   */ {
/*   */   public JarOutputStream(OutputStream os, Manifest manifest)
/*   */     throws IOException
/*   */   {
/* 5 */     super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public JarOutputStream(OutputStream os) throws IOException { super((OutputStream)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public void putNextEntry(ZipEntry ze) throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.jar.JarOutputStream
 * JD-Core Version:    0.6.2
 */