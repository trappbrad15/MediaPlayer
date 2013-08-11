/*    */ package android.location;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ 
/*    */ public class Location
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int FORMAT_DEGREES = 0;
/*    */   public static final int FORMAT_MINUTES = 1;
/*    */   public static final int FORMAT_SECONDS = 2;
/* 51 */   public static final Parcelable.Creator<Location> CREATOR = null;
/*    */ 
/*    */   public Location(String provider)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Location(Location l) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void set(Location l) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*  9 */   public static String convert(double coordinate, int outputType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static double convert(String coordinate) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static void distanceBetween(double startLatitude, double startLongitude, double endLatitude, double endLongitude, float[] results) { throw new RuntimeException("Stub!"); } 
/* 12 */   public float distanceTo(Location dest) { throw new RuntimeException("Stub!"); } 
/* 13 */   public float bearingTo(Location dest) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getProvider() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setProvider(String provider) { throw new RuntimeException("Stub!"); } 
/* 16 */   public long getTime() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setTime(long time) { throw new RuntimeException("Stub!"); } 
/* 18 */   public long getElapsedRealtimeNanos() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setElapsedRealtimeNanos(long time) { throw new RuntimeException("Stub!"); } 
/* 20 */   public double getLatitude() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setLatitude(double latitude) { throw new RuntimeException("Stub!"); } 
/* 22 */   public double getLongitude() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setLongitude(double longitude) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean hasAltitude() { throw new RuntimeException("Stub!"); } 
/* 25 */   public double getAltitude() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setAltitude(double altitude) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void removeAltitude() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean hasSpeed() { throw new RuntimeException("Stub!"); } 
/* 29 */   public float getSpeed() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setSpeed(float speed) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void removeSpeed() { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean hasBearing() { throw new RuntimeException("Stub!"); } 
/* 33 */   public float getBearing() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setBearing(float bearing) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void removeBearing() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean hasAccuracy() { throw new RuntimeException("Stub!"); } 
/* 37 */   public float getAccuracy() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setAccuracy(float accuracy) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void removeAccuracy() { throw new RuntimeException("Stub!"); } 
/* 40 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 45 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean isFromMockProvider() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.location.Location
 * JD-Core Version:    0.6.2
 */