/*   */ package java.nio.charset.spi;
/*   */ 
/*   */ import java.nio.charset.Charset;
/*   */ import java.util.Iterator;
/*   */ 
/*   */ public abstract class CharsetProvider
/*   */ {
/*   */   protected CharsetProvider()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Iterator<Charset> charsets();
/*   */ 
/*   */   public abstract Charset charsetForName(String paramString);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.nio.charset.spi.CharsetProvider
 * JD-Core Version:    0.6.2
 */