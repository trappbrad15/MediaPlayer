/*    */ package java.lang;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class Runtime
/*    */ {
/*    */   Runtime()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Process exec(String[] progArray) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public Process exec(String[] progArray, String[] envp) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Process exec(String[] progArray, String[] envp, File directory) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Process exec(String prog) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Process exec(String prog, String[] envp) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Process exec(String prog, String[] envp, File directory) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void exit(int code) { throw new RuntimeException("Stub!"); } 
/*    */   public native void gc();
/*    */ 
/* 13 */   public static Runtime getRuntime() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void load(String pathName) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void loadLibrary(String libName) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void runFinalization() { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public static void runFinalizersOnExit(boolean run) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void traceInstructions(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void traceMethodCalls(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 22 */   @Deprecated
/*    */   public InputStream getLocalizedInputStream(InputStream stream) { throw new RuntimeException("Stub!"); } 
/* 24 */   @Deprecated
/*    */   public OutputStream getLocalizedOutputStream(OutputStream stream) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void addShutdownHook(Thread hook) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean removeShutdownHook(Thread hook) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void halt(int code) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int availableProcessors() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public native long freeMemory();
/*    */ 
/*    */   public native long totalMemory();
/*    */ 
/*    */   public native long maxMemory();
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.Runtime
 * JD-Core Version:    0.6.2
 */