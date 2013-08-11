/*   */ package android.media;
/*   */ 
/*   */ public class CamcorderProfile
/*   */ {
/*   */   public static final int QUALITY_LOW = 0;
/*   */   public static final int QUALITY_HIGH = 1;
/*   */   public static final int QUALITY_QCIF = 2;
/*   */   public static final int QUALITY_CIF = 3;
/*   */   public static final int QUALITY_480P = 4;
/*   */   public static final int QUALITY_720P = 5;
/*   */   public static final int QUALITY_1080P = 6;
/*   */   public static final int QUALITY_QVGA = 7;
/*   */   public static final int QUALITY_TIME_LAPSE_LOW = 1000;
/*   */   public static final int QUALITY_TIME_LAPSE_HIGH = 1001;
/*   */   public static final int QUALITY_TIME_LAPSE_QCIF = 1002;
/*   */   public static final int QUALITY_TIME_LAPSE_CIF = 1003;
/*   */   public static final int QUALITY_TIME_LAPSE_480P = 1004;
/*   */   public static final int QUALITY_TIME_LAPSE_720P = 1005;
/*   */   public static final int QUALITY_TIME_LAPSE_1080P = 1006;
/*   */   public static final int QUALITY_TIME_LAPSE_QVGA = 1007;
/*   */   public int duration;
/*   */   public int quality;
/*   */   public int fileFormat;
/*   */   public int videoCodec;
/*   */   public int videoBitRate;
/*   */   public int videoFrameRate;
/*   */   public int videoFrameWidth;
/*   */   public int videoFrameHeight;
/*   */   public int audioCodec;
/*   */   public int audioBitRate;
/*   */   public int audioSampleRate;
/*   */   public int audioChannels;
/*   */ 
/*   */   CamcorderProfile()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static CamcorderProfile get(int quality) { throw new RuntimeException("Stub!"); } 
/* 6 */   public static CamcorderProfile get(int cameraId, int quality) { throw new RuntimeException("Stub!"); } 
/* 7 */   public static boolean hasProfile(int quality) { throw new RuntimeException("Stub!"); } 
/* 8 */   public static boolean hasProfile(int cameraId, int quality) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.CamcorderProfile
 * JD-Core Version:    0.6.2
 */