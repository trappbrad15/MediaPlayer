/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.client.HttpRequestRetryHandler;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultHttpRequestRetryHandler
/*   */   implements HttpRequestRetryHandler
/*   */ {
/*   */   public DefaultHttpRequestRetryHandler(int retryCount, boolean requestSentRetryEnabled)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DefaultHttpRequestRetryHandler() { throw new RuntimeException("Stub!"); } 
/* 7 */   public boolean retryRequest(IOException exception, int executionCount, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 8 */   public boolean isRequestSentRetryEnabled() { throw new RuntimeException("Stub!"); } 
/* 9 */   public int getRetryCount() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.client.DefaultHttpRequestRetryHandler
 * JD-Core Version:    0.6.2
 */