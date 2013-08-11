/*    */ package android.text.style;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ 
/*    */ public class EasyEditSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public static final String EXTRA_TEXT_CHANGED_TYPE = "android.text.style.EXTRA_TEXT_CHANGED_TYPE";
/*    */   public static final int TEXT_DELETED = 1;
/*    */   public static final int TEXT_MODIFIED = 2;
/*    */ 
/*    */   public EasyEditSpan()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public EasyEditSpan(PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); } 
/*  7 */   public EasyEditSpan(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.EasyEditSpan
 * JD-Core Version:    0.6.2
 */