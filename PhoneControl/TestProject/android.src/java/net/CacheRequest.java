/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ 
/*   */ public abstract class CacheRequest
/*   */ {
/*   */   public CacheRequest()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void abort();
/*   */ 
/*   */   public abstract OutputStream getBody()
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.CacheRequest
 * JD-Core Version:    0.6.2
 */