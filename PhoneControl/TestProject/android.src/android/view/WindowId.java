/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class WindowId
/*    */   implements Parcelable
/*    */ {
/* 21 */   public static final Parcelable.Creator<WindowId> CREATOR = null;
/*    */ 
/*    */   WindowId()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isFocused() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void registerFocusObserver(FocusObserver observer) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void unregisterFocusObserver(FocusObserver observer) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 18 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract class FocusObserver
/*    */   {
/*    */     public FocusObserver()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */     public abstract void onFocusGained(WindowId paramWindowId);
/*    */ 
/*    */     public abstract void onFocusLost(WindowId paramWindowId);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.WindowId
 * JD-Core Version:    0.6.2
 */