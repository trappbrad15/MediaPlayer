/*   */ package org.apache.http.impl.entity;
/*   */ 
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.entity.ContentLengthStrategy;
/*   */ 
/*   */ public class LaxContentLengthStrategy
/*   */   implements ContentLengthStrategy
/*   */ {
/*   */   public LaxContentLengthStrategy()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public long determineLength(HttpMessage message) throws HttpException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.entity.LaxContentLengthStrategy
 * JD-Core Version:    0.6.2
 */