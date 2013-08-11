/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public final class BluetoothSocket
/*    */   implements Closeable
/*    */ {
/*    */   BluetoothSocket()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public BluetoothDevice getRemoteDevice() { throw new RuntimeException("Stub!"); } 
/*  7 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void connect() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.bluetooth.BluetoothSocket
 * JD-Core Version:    0.6.2
 */