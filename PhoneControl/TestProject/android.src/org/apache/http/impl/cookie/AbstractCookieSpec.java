/*   */ package org.apache.http.impl.cookie;
/*   */ 
/*   */ import java.util.Collection;
/*   */ import org.apache.http.cookie.CookieAttributeHandler;
/*   */ import org.apache.http.cookie.CookieSpec;
/*   */ 
/*   */ public abstract class AbstractCookieSpec
/*   */   implements CookieSpec
/*   */ {
/*   */   public AbstractCookieSpec()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void registerAttribHandler(String name, CookieAttributeHandler handler) { throw new RuntimeException("Stub!"); } 
/* 7 */   protected CookieAttributeHandler findAttribHandler(String name) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected CookieAttributeHandler getAttribHandler(String name) { throw new RuntimeException("Stub!"); } 
/* 9 */   protected Collection<CookieAttributeHandler> getAttribHandlers() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.AbstractCookieSpec
 * JD-Core Version:    0.6.2
 */