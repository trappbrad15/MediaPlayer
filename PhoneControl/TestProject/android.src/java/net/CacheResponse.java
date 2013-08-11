/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.InputStream;
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ 
/*   */ public abstract class CacheResponse
/*   */ {
/*   */   public CacheResponse()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract InputStream getBody()
/*   */     throws IOException;
/*   */ 
/*   */   public abstract Map<String, List<String>> getHeaders()
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.CacheResponse
 * JD-Core Version:    0.6.2
 */