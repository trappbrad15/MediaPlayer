/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpResponse;
/*   */ 
/*   */ public class TunnelRefusedException extends HttpException
/*   */ {
/*   */   public TunnelRefusedException(String message, HttpResponse response)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpResponse getResponse() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.client.TunnelRefusedException
 * JD-Core Version:    0.6.2
 */