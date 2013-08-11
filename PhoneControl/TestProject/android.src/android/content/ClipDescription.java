/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ClipDescription
/*    */   implements Parcelable
/*    */ {
/*    */   public static final String MIMETYPE_TEXT_PLAIN = "text/plain";
/*    */   public static final String MIMETYPE_TEXT_HTML = "text/html";
/*    */   public static final String MIMETYPE_TEXT_URILIST = "text/uri-list";
/*    */   public static final String MIMETYPE_TEXT_INTENT = "text/vnd.android.intent";
/* 21 */   public static final Parcelable.Creator<ClipDescription> CREATOR = null;
/*    */ 
/*    */   public ClipDescription(CharSequence label, String[] mimeTypes)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ClipDescription(ClipDescription o) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static boolean compareMimeTypes(String concreteType, String desiredType) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean hasMimeType(String mimeType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String[] filterMimeTypes(String mimeType) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getMimeTypeCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getMimeType(int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ClipDescription
 * JD-Core Version:    0.6.2
 */