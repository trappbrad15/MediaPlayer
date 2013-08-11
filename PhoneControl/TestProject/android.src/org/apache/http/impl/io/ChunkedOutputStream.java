/*    */ package org.apache.http.impl.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ 
/*    */ public class ChunkedOutputStream extends OutputStream
/*    */ {
/*    */   public ChunkedOutputStream(SessionOutputBuffer out, int bufferSize)
/*    */     throws IOException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ChunkedOutputStream(SessionOutputBuffer out) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void flushCache() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void flushCacheWithAppend(byte[] bufferToAppend, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void writeClosingChunk() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void write(byte[] src, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.io.ChunkedOutputStream
 * JD-Core Version:    0.6.2
 */