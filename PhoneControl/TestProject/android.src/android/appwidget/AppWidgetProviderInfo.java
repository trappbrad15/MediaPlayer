/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class AppWidgetProviderInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int RESIZE_NONE = 0;
/*    */   public static final int RESIZE_HORIZONTAL = 1;
/*    */   public static final int RESIZE_VERTICAL = 2;
/*    */   public static final int RESIZE_BOTH = 3;
/*    */   public static final int WIDGET_CATEGORY_HOME_SCREEN = 1;
/*    */   public static final int WIDGET_CATEGORY_KEYGUARD = 2;
/*    */   public ComponentName provider;
/*    */   public int minWidth;
/*    */   public int minHeight;
/*    */   public int minResizeWidth;
/*    */   public int minResizeHeight;
/*    */   public int updatePeriodMillis;
/*    */   public int initialLayout;
/*    */   public int initialKeyguardLayout;
/*    */   public ComponentName configure;
/*    */   public String label;
/*    */   public int icon;
/*    */   public int autoAdvanceViewId;
/*    */   public int previewImage;
/*    */   public int resizeMode;
/*    */   public int widgetCategory;
/* 33 */   public static final Parcelable.Creator<AppWidgetProviderInfo> CREATOR = null;
/*    */ 
/*    */   public AppWidgetProviderInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public AppWidgetProviderInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public AppWidgetProviderInfo clone() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.appwidget.AppWidgetProviderInfo
 * JD-Core Version:    0.6.2
 */