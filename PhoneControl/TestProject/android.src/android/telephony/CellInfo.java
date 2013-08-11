/*    */ package android.telephony;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public abstract class CellInfo
/*    */   implements Parcelable
/*    */ {
/* 14 */   public static final Parcelable.Creator<CellInfo> CREATOR = null;
/*    */ 
/*    */   CellInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isRegistered() { throw new RuntimeException("Stub!"); } 
/*  7 */   public long getTimeStamp() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public abstract void writeToParcel(Parcel paramParcel, int paramInt);
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.telephony.CellInfo
 * JD-Core Version:    0.6.2
 */