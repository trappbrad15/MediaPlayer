/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.jar.Attributes;
/*    */ import java.util.jar.JarEntry;
/*    */ import java.util.jar.JarFile;
/*    */ import java.util.jar.Manifest;
/*    */ 
/*    */ public abstract class JarURLConnection extends URLConnection
/*    */ {
/*    */   protected URLConnection jarFileURLConnection;
/*    */ 
/*    */   protected JarURLConnection(URL url)
/*    */     throws MalformedURLException
/*    */   {
/*  5 */     super((URL)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public Attributes getAttributes() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Certificate[] getCertificates() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getEntryName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public JarEntry getJarEntry() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Manifest getManifest() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract JarFile getJarFile() throws IOException;
/*    */ 
/* 12 */   public URL getJarFileURL() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Attributes getMainAttributes() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.JarURLConnection
 * JD-Core Version:    0.6.2
 */