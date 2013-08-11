/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ 
/*   */ public class HttpRetryException extends IOException
/*   */ {
/*   */   public HttpRetryException(String detail, int code)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpRetryException(String detail, int code, String location) { throw new RuntimeException("Stub!"); } 
/* 7 */   public String getLocation() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getReason() { throw new RuntimeException("Stub!"); } 
/* 9 */   public int responseCode() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.HttpRetryException
 * JD-Core Version:    0.6.2
 */