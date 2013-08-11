/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Console;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.nio.channels.Channel;
/*    */ import java.util.Map;
/*    */ import java.util.Properties;
/*    */ 
/*    */ public final class System
/*    */ {
/* 36 */   public static final InputStream in = null; public static final PrintStream out = null; public static final PrintStream err = null;
/*    */ 
/*    */   System()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static void setIn(InputStream newIn) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static void setOut(PrintStream newOut) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static void setErr(PrintStream newErr) { throw new RuntimeException("Stub!"); } 
/*    */   public static native void arraycopy(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, int paramInt3);
/*    */ 
/*    */   public static native long currentTimeMillis();
/*    */ 
/*    */   public static native long nanoTime();
/*    */ 
/* 11 */   public static void exit(int code) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static void gc() { throw new RuntimeException("Stub!"); } 
/* 13 */   public static String getenv(String name) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static Map<String, String> getenv() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static Channel inheritedChannel() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public static Properties getProperties() { throw new RuntimeException("Stub!"); } 
/* 17 */   public static String getProperty(String propertyName) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static String getProperty(String name, String defaultValue) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static String setProperty(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static String clearProperty(String name) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static Console console() { throw new RuntimeException("Stub!"); } 
/* 22 */   public static SecurityManager getSecurityManager() { throw new RuntimeException("Stub!"); } 
/*    */   public static native int identityHashCode(Object paramObject);
/*    */ 
/* 24 */   public static void load(String pathName) { throw new RuntimeException("Stub!"); } 
/* 25 */   public static void loadLibrary(String libName) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static void runFinalization() { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   public static void runFinalizersOnExit(boolean flag) {
/* 29 */     throw new RuntimeException("Stub!"); } 
/* 30 */   public static void setProperties(Properties p) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static void setSecurityManager(SecurityManager sm) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static native String mapLibraryName(String paramString);
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.System
 * JD-Core Version:    0.6.2
 */