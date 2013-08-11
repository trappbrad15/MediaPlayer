/*    */ package dalvik.system;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.net.URL;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public class BaseDexClassLoader extends ClassLoader
/*    */ {
/*    */   public BaseDexClassLoader(String dexPath, File optimizedDirectory, String libraryPath, ClassLoader parent)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Class<?> findClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/*  7 */   protected URL findResource(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected Enumeration<URL> findResources(String name) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String findLibrary(String name) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected synchronized Package getPackage(String name) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     dalvik.system.BaseDexClassLoader
 * JD-Core Version:    0.6.2
 */