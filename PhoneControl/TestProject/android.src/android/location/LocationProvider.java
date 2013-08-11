/*    */ package android.location;
/*    */ 
/*    */ public class LocationProvider
/*    */ {
/*    */   public static final int OUT_OF_SERVICE = 0;
/*    */   public static final int TEMPORARILY_UNAVAILABLE = 1;
/*    */   public static final int AVAILABLE = 2;
/*    */ 
/*    */   LocationProvider()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean meetsCriteria(Criteria criteria) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean requiresNetwork() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean requiresSatellite() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean requiresCell() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean hasMonetaryCost() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean supportsAltitude() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean supportsSpeed() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean supportsBearing() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getPowerRequirement() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getAccuracy() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.location.LocationProvider
 * JD-Core Version:    0.6.2
 */