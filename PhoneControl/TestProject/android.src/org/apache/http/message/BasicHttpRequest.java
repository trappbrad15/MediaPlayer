/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ 
/*    */ public class BasicHttpRequest extends AbstractHttpMessage
/*    */   implements HttpRequest
/*    */ {
/*    */   public BasicHttpRequest(String method, String uri)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BasicHttpRequest(String method, String uri, ProtocolVersion ver) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BasicHttpRequest(RequestLine requestline) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); } 
/* 10 */   public RequestLine getRequestLine() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.message.BasicHttpRequest
 * JD-Core Version:    0.6.2
 */