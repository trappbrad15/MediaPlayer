/*    */ package android.net;
/*    */ 
/*    */ public class ConnectivityManager
/*    */ {
/*    */   public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
/*    */ 
/*    */   @Deprecated
/*    */   public static final String EXTRA_NETWORK_INFO = "networkInfo";
/*    */   public static final String EXTRA_NETWORK_TYPE = "networkType";
/*    */   public static final String EXTRA_IS_FAILOVER = "isFailover";
/*    */   public static final String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
/*    */   public static final String EXTRA_NO_CONNECTIVITY = "noConnectivity";
/*    */   public static final String EXTRA_REASON = "reason";
/*    */   public static final String EXTRA_EXTRA_INFO = "extraInfo";
/*    */ 
/*    */   @Deprecated
/*    */   public static final String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
/*    */   public static final int TYPE_MOBILE = 0;
/*    */   public static final int TYPE_WIFI = 1;
/*    */   public static final int TYPE_MOBILE_MMS = 2;
/*    */   public static final int TYPE_MOBILE_SUPL = 3;
/*    */   public static final int TYPE_MOBILE_DUN = 4;
/*    */   public static final int TYPE_MOBILE_HIPRI = 5;
/*    */   public static final int TYPE_WIMAX = 6;
/*    */   public static final int TYPE_BLUETOOTH = 7;
/*    */   public static final int TYPE_DUMMY = 8;
/*    */   public static final int TYPE_ETHERNET = 9;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int DEFAULT_NETWORK_PREFERENCE = 1;
/*    */ 
/*    */   ConnectivityManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static boolean isNetworkTypeValid(int networkType) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void setNetworkPreference(int preference) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getNetworkPreference() { throw new RuntimeException("Stub!"); } 
/*  8 */   public NetworkInfo getActiveNetworkInfo() { throw new RuntimeException("Stub!"); } 
/*  9 */   public NetworkInfo getNetworkInfo(int networkType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public NetworkInfo[] getAllNetworkInfo() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int startUsingNetworkFeature(int networkType, String feature) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int stopUsingNetworkFeature(int networkType, String feature) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean requestRouteToHost(int networkType, int hostAddress) { throw new RuntimeException("Stub!"); } 
/* 15 */   @Deprecated
/*    */   public boolean getBackgroundDataSetting() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isActiveNetworkMetered() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.ConnectivityManager
 * JD-Core Version:    0.6.2
 */