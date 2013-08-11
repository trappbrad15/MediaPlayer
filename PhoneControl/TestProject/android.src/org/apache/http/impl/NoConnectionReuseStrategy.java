/*   */ package org.apache.http.impl;
/*   */ 
/*   */ import org.apache.http.ConnectionReuseStrategy;
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class NoConnectionReuseStrategy
/*   */   implements ConnectionReuseStrategy
/*   */ {
/*   */   public NoConnectionReuseStrategy()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean keepAlive(HttpResponse response, HttpContext context) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.NoConnectionReuseStrategy
 * JD-Core Version:    0.6.2
 */