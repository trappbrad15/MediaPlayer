/*   */ package android.drm;
/*   */ 
/*   */ import java.util.HashMap;
/*   */ 
/*   */ public class DrmEvent
/*   */ {
/*   */   public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
/*   */   public static final int TYPE_DRM_INFO_PROCESSED = 1002;
/*   */   public static final String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
/*   */   public static final String DRM_INFO_OBJECT = "drm_info_object";
/*   */ 
/*   */   protected DrmEvent(int uniqueId, int type, String message, HashMap<String, Object> attributes)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   protected DrmEvent(int uniqueId, int type, String message) { throw new RuntimeException("Stub!"); } 
/* 6 */   public int getUniqueId() { throw new RuntimeException("Stub!"); } 
/* 7 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getMessage() { throw new RuntimeException("Stub!"); } 
/* 9 */   public Object getAttribute(String key) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.drm.DrmEvent
 * JD-Core Version:    0.6.2
 */