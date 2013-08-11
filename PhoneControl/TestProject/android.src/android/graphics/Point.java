/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class Point
/*    */   implements Parcelable
/*    */ {
/*    */   public int x;
/*    */   public int y;
/* 21 */   public static final Parcelable.Creator<Point> CREATOR = null;
/*    */ 
/*    */   public Point()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Point(int x, int y) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Point(Point src) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void set(int x, int y) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void negate() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void offset(int dx, int dy) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final boolean equals(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.Point
 * JD-Core Version:    0.6.2
 */