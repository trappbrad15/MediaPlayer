/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.HttpEntity;
/*    */ import org.apache.http.HttpEntityEnclosingRequest;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ 
/*    */ public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest
/*    */   implements HttpEntityEnclosingRequest
/*    */ {
/*    */   public BasicHttpEntityEnclosingRequest(String method, String uri)
/*    */   {
/*  6 */     super((RequestLine)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public BasicHttpEntityEnclosingRequest(String method, String uri, ProtocolVersion ver) { super((RequestLine)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public BasicHttpEntityEnclosingRequest(RequestLine requestline) { super((RequestLine)null); throw new RuntimeException("Stub!"); } 
/*  9 */   public HttpEntity getEntity() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setEntity(HttpEntity entity) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean expectContinue() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.message.BasicHttpEntityEnclosingRequest
 * JD-Core Version:    0.6.2
 */