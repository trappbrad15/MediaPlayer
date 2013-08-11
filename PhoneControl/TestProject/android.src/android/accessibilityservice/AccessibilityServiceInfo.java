/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class AccessibilityServiceInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
/*    */   public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
/*    */   public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
/*    */   public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = 8;
/*    */   public static final int FEEDBACK_SPOKEN = 1;
/*    */   public static final int FEEDBACK_HAPTIC = 2;
/*    */   public static final int FEEDBACK_AUDIBLE = 4;
/*    */   public static final int FEEDBACK_VISUAL = 8;
/*    */   public static final int FEEDBACK_GENERIC = 16;
/*    */   public static final int FEEDBACK_BRAILLE = 32;
/*    */   public static final int FEEDBACK_ALL_MASK = -1;
/*    */   public static final int DEFAULT = 1;
/*    */   public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
/*    */   public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
/*    */   public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
/*    */   public static final int FLAG_REPORT_VIEW_IDS = 16;
/*    */   public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
/*    */   public int eventTypes;
/* 41 */   public String[] packageNames = null;
/*    */   public int feedbackType;
/*    */   public long notificationTimeout;
/*    */   public int flags;
/* 46 */   public static final Parcelable.Creator<AccessibilityServiceInfo> CREATOR = null;
/*    */ 
/*    */   public AccessibilityServiceInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getId() { throw new RuntimeException("Stub!"); } 
/*  7 */   public ResolveInfo getResolveInfo() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getSettingsActivityName() { throw new RuntimeException("Stub!"); } 
/* 10 */   @Deprecated
/*    */   public boolean getCanRetrieveWindowContent() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getCapabilities() { throw new RuntimeException("Stub!"); } 
/* 13 */   @Deprecated
/*    */   public String getDescription() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String loadDescription(PackageManager packageManager) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void writeToParcel(Parcel parcel, int flagz) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 20 */   public static String feedbackTypeToString(int feedbackType) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static String flagToString(int flag) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static String capabilityToString(int capability) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.accessibilityservice.AccessibilityServiceInfo
 * JD-Core Version:    0.6.2
 */