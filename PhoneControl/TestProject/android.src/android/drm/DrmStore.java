/*    */ package android.drm;
/*    */ 
/*    */ public class DrmStore
/*    */ {
/*    */   @Deprecated
/*    */   public DrmStore()
/*    */   {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class RightsStatus
/*    */   {
/*    */     public static final int RIGHTS_VALID = 0;
/*    */     public static final int RIGHTS_INVALID = 1;
/*    */     public static final int RIGHTS_EXPIRED = 2;
/*    */     public static final int RIGHTS_NOT_ACQUIRED = 3;
/*    */ 
/*    */     @Deprecated
/*    */     public RightsStatus()
/*    */     {
/* 47 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Action
/*    */   {
/*    */     public static final int DEFAULT = 0;
/*    */     public static final int PLAY = 1;
/*    */     public static final int RINGTONE = 2;
/*    */     public static final int TRANSFER = 3;
/*    */     public static final int OUTPUT = 4;
/*    */     public static final int PREVIEW = 5;
/*    */     public static final int EXECUTE = 6;
/*    */     public static final int DISPLAY = 7;
/*    */ 
/*    */     @Deprecated
/*    */     public Action()
/*    */     {
/* 34 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Playback
/*    */   {
/*    */     public static final int START = 0;
/*    */     public static final int STOP = 1;
/*    */     public static final int PAUSE = 2;
/*    */     public static final int RESUME = 3;
/*    */ 
/*    */     @Deprecated
/*    */     public Playback()
/*    */     {
/* 25 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class DrmObjectType
/*    */   {
/*    */     public static final int UNKNOWN = 0;
/*    */     public static final int CONTENT = 1;
/*    */     public static final int RIGHTS_OBJECT = 2;
/*    */     public static final int TRIGGER_OBJECT = 3;
/*    */ 
/*    */     @Deprecated
/*    */     public DrmObjectType()
/*    */     {
/* 16 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface ConstraintsColumns
/*    */   {
/*    */     public static final String MAX_REPEAT_COUNT = "max_repeat_count";
/*    */     public static final String REMAINING_REPEAT_COUNT = "remaining_repeat_count";
/*    */     public static final String LICENSE_START_TIME = "license_start_time";
/*    */     public static final String LICENSE_EXPIRY_TIME = "license_expiry_time";
/*    */     public static final String LICENSE_AVAILABLE_TIME = "license_available_time";
/*    */     public static final String EXTENDED_METADATA = "extended_metadata";
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.drm.DrmStore
 * JD-Core Version:    0.6.2
 */