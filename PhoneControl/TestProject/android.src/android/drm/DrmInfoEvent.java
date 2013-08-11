/*   */ package android.drm;
/*   */ 
/*   */ import java.util.HashMap;
/*   */ 
/*   */ public class DrmInfoEvent extends DrmEvent
/*   */ {
/*   */   public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = 1;
/*   */   public static final int TYPE_REMOVE_RIGHTS = 2;
/*   */   public static final int TYPE_RIGHTS_INSTALLED = 3;
/*   */   public static final int TYPE_WAIT_FOR_RIGHTS = 4;
/*   */   public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = 5;
/*   */   public static final int TYPE_RIGHTS_REMOVED = 6;
/*   */ 
/*   */   public DrmInfoEvent(int uniqueId, int type, String message)
/*   */   {
/* 5 */     super(0, 0, (String)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public DrmInfoEvent(int uniqueId, int type, String message, HashMap<String, Object> attributes) { super(0, 0, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.drm.DrmInfoEvent
 * JD-Core Version:    0.6.2
 */