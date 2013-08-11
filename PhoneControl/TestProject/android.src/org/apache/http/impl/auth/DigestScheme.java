/*    */ package org.apache.http.impl.auth;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.auth.AuthenticationException;
/*    */ import org.apache.http.auth.Credentials;
/*    */ import org.apache.http.auth.MalformedChallengeException;
/*    */ 
/*    */ public class DigestScheme extends RFC2617Scheme
/*    */ {
/*    */   public DigestScheme()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void processChallenge(Header header) throws MalformedChallengeException { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isComplete() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getSchemeName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isConnectionBased() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void overrideParamter(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException { throw new RuntimeException("Stub!"); } 
/* 12 */   public static String createCnonce() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.auth.DigestScheme
 * JD-Core Version:    0.6.2
 */