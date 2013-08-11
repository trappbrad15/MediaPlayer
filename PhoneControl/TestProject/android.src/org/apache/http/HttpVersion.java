/*    */ package org.apache.http;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class HttpVersion extends ProtocolVersion
/*    */   implements Serializable
/*    */ {
/*    */   public static final String HTTP = "HTTP";
/* 12 */   public static final HttpVersion HTTP_0_9 = null; public static final HttpVersion HTTP_1_0 = null; public static final HttpVersion HTTP_1_1 = null;
/*    */ 
/*    */   public HttpVersion(int major, int minor)
/*    */   {
/*  6 */     super((String)null, 0, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public ProtocolVersion forVersion(int major, int minor) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HttpVersion
 * JD-Core Version:    0.6.2
 */