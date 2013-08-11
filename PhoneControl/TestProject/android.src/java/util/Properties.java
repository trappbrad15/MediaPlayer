/*    */ package java.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.Reader;
/*    */ import java.io.Writer;
/*    */ 
/*    */ public class Properties extends Hashtable<Object, Object>
/*    */ {
/*    */   protected Properties defaults;
/*    */ 
/*    */   public Properties()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Properties(Properties properties) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getProperty(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getProperty(String name, String defaultValue) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void list(PrintStream out) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void list(PrintWriter out) { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void load(InputStream in) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public synchronized void load(Reader in) throws IOException {
/* 13 */     throw new RuntimeException("Stub!"); } 
/* 14 */   public Enumeration<?> propertyNames() { throw new RuntimeException("Stub!"); } 
/* 15 */   public Set<String> stringPropertyNames() { throw new RuntimeException("Stub!"); } 
/* 17 */   @Deprecated
/*    */   public void save(OutputStream out, String comment) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Object setProperty(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void store(OutputStream out, String comment) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public synchronized void store(Writer writer, String comment) throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void storeToXML(OutputStream os, String comment) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public synchronized void storeToXML(OutputStream os, String comment, String encoding) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.Properties
 * JD-Core Version:    0.6.2
 */