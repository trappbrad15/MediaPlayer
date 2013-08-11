/*   */ package android.drm;
/*   */ 
/*   */ public class DrmInfoStatus
/*   */ {
/*   */   public static final int STATUS_OK = 1;
/*   */   public static final int STATUS_ERROR = 2;
/*   */   public final int statusCode;
/*   */   public final int infoType;
/*   */   public final String mimeType;
/*   */   public final ProcessedData data;
/*   */ 
/*   */   public DrmInfoStatus(int statusCode, int infoType, ProcessedData data, String mimeType)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.drm.DrmInfoStatus
 * JD-Core Version:    0.6.2
 */