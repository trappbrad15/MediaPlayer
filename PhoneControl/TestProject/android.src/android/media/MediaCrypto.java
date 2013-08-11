/*   */ package android.media;
/*   */ 
/*   */ import java.util.UUID;
/*   */ 
/*   */ public final class MediaCrypto
/*   */ {
/*   */   public MediaCrypto(UUID uuid, byte[] initData)
/*   */     throws MediaCryptoException
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static final boolean isCryptoSchemeSupported(UUID uuid) { throw new RuntimeException("Stub!"); } 
/*   */   public final native boolean requiresSecureDecoderComponent(String paramString);
/*   */ 
/* 7 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public final native void release();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaCrypto
 * JD-Core Version:    0.6.2
 */