/*    */ package android.util;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class AtomicFile
/*    */ {
/*    */   public AtomicFile(File baseName)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public File getBaseFile() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void delete() { throw new RuntimeException("Stub!"); } 
/*  7 */   public FileOutputStream startWrite() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void finishWrite(FileOutputStream str) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void failWrite(FileOutputStream str) { throw new RuntimeException("Stub!"); } 
/* 10 */   public FileInputStream openRead() throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 11 */   public byte[] readFully() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.util.AtomicFile
 * JD-Core Version:    0.6.2
 */