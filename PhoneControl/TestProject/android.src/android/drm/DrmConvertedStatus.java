/*   */ package android.drm;
/*   */ 
/*   */ public class DrmConvertedStatus
/*   */ {
/*   */   public static final int STATUS_OK = 1;
/*   */   public static final int STATUS_INPUTDATA_ERROR = 2;
/*   */   public static final int STATUS_ERROR = 3;
/*   */   public final int statusCode;
/* 9 */   public final byte[] convertedData = null;
/*   */   public final int offset;
/*   */ 
/*   */   public DrmConvertedStatus(int statusCode, byte[] convertedData, int offset)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.drm.DrmConvertedStatus
 * JD-Core Version:    0.6.2
 */