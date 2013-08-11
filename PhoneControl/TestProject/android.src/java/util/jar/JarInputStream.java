/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipInputStream;
/*    */ 
/*    */ public class JarInputStream extends ZipInputStream
/*    */ {
/*    */   public JarInputStream(InputStream stream, boolean verify)
/*    */     throws IOException
/*    */   {
/*  5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public JarInputStream(InputStream stream) throws IOException { super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public Manifest getManifest() { throw new RuntimeException("Stub!"); } 
/*  8 */   public JarEntry getNextJarEntry() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public ZipEntry getNextEntry() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected ZipEntry createZipEntry(String name) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.jar.JarInputStream
 * JD-Core Version:    0.6.2
 */