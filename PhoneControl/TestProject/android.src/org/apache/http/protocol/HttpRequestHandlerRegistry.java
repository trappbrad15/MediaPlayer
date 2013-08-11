/*    */ package org.apache.http.protocol;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public class HttpRequestHandlerRegistry
/*    */   implements HttpRequestHandlerResolver
/*    */ {
/*    */   public HttpRequestHandlerRegistry()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void register(String pattern, HttpRequestHandler handler) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void unregister(String pattern) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setHandlers(Map map) { throw new RuntimeException("Stub!"); } 
/*  9 */   public HttpRequestHandler lookup(String requestURI) { throw new RuntimeException("Stub!"); } 
/* 11 */   @Deprecated
/*    */   protected boolean matchUriRequestPattern(String pattern, String requestUri) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpRequestHandlerRegistry
 * JD-Core Version:    0.6.2
 */