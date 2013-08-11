/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import org.apache.http.HttpEntity;
/*    */ import org.apache.http.HttpEntityEnclosingRequest;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.ProtocolException;
/*    */ 
/*    */ public class EntityEnclosingRequestWrapper extends RequestWrapper
/*    */   implements HttpEntityEnclosingRequest
/*    */ {
/*    */   public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest request)
/*    */     throws ProtocolException
/*    */   {
/*  6 */     super((HttpRequest)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public HttpEntity getEntity() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setEntity(HttpEntity entity) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean expectContinue() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.client.EntityEnclosingRequestWrapper
 * JD-Core Version:    0.6.2
 */