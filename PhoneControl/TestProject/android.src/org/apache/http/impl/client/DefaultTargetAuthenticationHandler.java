/*   */ package org.apache.http.impl.client;
/*   */ 
/*   */ import java.util.Map;
/*   */ import org.apache.http.Header;
/*   */ import org.apache.http.HttpResponse;
/*   */ import org.apache.http.auth.MalformedChallengeException;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultTargetAuthenticationHandler extends AbstractAuthenticationHandler
/*   */ {
/*   */   public DefaultTargetAuthenticationHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean isAuthenticationRequested(HttpResponse response, HttpContext context) { throw new RuntimeException("Stub!"); } 
/* 7 */   public Map<String, Header> getChallenges(HttpResponse response, HttpContext context) throws MalformedChallengeException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.client.DefaultTargetAuthenticationHandler
 * JD-Core Version:    0.6.2
 */