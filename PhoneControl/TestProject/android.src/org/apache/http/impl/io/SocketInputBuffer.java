/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.Socket;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public class SocketInputBuffer extends AbstractSessionInputBuffer
/*   */ {
/*   */   public SocketInputBuffer(Socket socket, int buffersize, HttpParams params)
/*   */     throws IOException
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean isDataAvailable(int timeout) throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.io.SocketInputBuffer
 * JD-Core Version:    0.6.2
 */