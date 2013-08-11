/*   */ package java.security;
/*   */ 
/*   */ import java.nio.ByteBuffer;
/*   */ 
/*   */ public class SecureClassLoader extends ClassLoader
/*   */ {
/*   */   protected SecureClassLoader()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected SecureClassLoader(ClassLoader parent) { throw new RuntimeException("Stub!"); } 
/* 7 */   protected PermissionCollection getPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected final Class<?> defineClass(String name, byte[] b, int off, int len, CodeSource cs) { throw new RuntimeException("Stub!"); } 
/* 9 */   protected final Class<?> defineClass(String name, ByteBuffer b, CodeSource cs) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.SecureClassLoader
 * JD-Core Version:    0.6.2
 */