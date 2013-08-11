/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ 
/*   */ public abstract class ContentHandler
/*   */ {
/*   */   public ContentHandler()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract Object getContent(URLConnection paramURLConnection) throws IOException;
/*   */ 
/* 7 */   public Object getContent(URLConnection uConn, Class[] types) throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.ContentHandler
 * JD-Core Version:    0.6.2
 */