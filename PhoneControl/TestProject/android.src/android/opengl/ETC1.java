/*   */ package android.opengl;
/*   */ 
/*   */ import java.nio.Buffer;
/*   */ 
/*   */ public class ETC1
/*   */ {
/*   */   public static final int ENCODED_BLOCK_SIZE = 8;
/*   */   public static final int DECODED_BLOCK_SIZE = 48;
/*   */   public static final int ETC_PKM_HEADER_SIZE = 16;
/*   */   public static final int ETC1_RGB8_OES = 36196;
/*   */ 
/*   */   public ETC1()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public static native void encodeBlock(Buffer paramBuffer1, int paramInt, Buffer paramBuffer2);
/*   */ 
/*   */   public static native void decodeBlock(Buffer paramBuffer1, Buffer paramBuffer2);
/*   */ 
/*   */   public static native int getEncodedDataSize(int paramInt1, int paramInt2);
/*   */ 
/*   */   public static native void encodeImage(Buffer paramBuffer1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Buffer paramBuffer2);
/*   */ 
/*   */   public static native void decodeImage(Buffer paramBuffer1, Buffer paramBuffer2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*   */ 
/*   */   public static native void formatHeader(Buffer paramBuffer, int paramInt1, int paramInt2);
/*   */ 
/*   */   public static native boolean isValid(Buffer paramBuffer);
/*   */ 
/*   */   public static native int getWidth(Buffer paramBuffer);
/*   */ 
/*   */   public static native int getHeight(Buffer paramBuffer);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.opengl.ETC1
 * JD-Core Version:    0.6.2
 */