/*    */ package android.provider;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class CallLog
/*    */ {
/*    */   public static final String AUTHORITY = "call_log";
/* 33 */   public static final Uri CONTENT_URI = null;
/*    */ 
/*    */   public CallLog()
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Calls
/*    */     implements BaseColumns
/*    */   {
/* 28 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*    */     public static final String LIMIT_PARAM_KEY = "limit";
/*    */     public static final String OFFSET_PARAM_KEY = "offset";
/*    */     public static final String DEFAULT_SORT_ORDER = "date DESC";
/*    */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/calls";
/*    */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/calls";
/*    */     public static final String TYPE = "type";
/*    */     public static final int INCOMING_TYPE = 1;
/*    */     public static final int OUTGOING_TYPE = 2;
/*    */     public static final int MISSED_TYPE = 3;
/*    */     public static final String NUMBER = "number";
/*    */     public static final String DATE = "date";
/*    */     public static final String DURATION = "duration";
/*    */     public static final String NEW = "new";
/*    */     public static final String CACHED_NAME = "name";
/*    */     public static final String CACHED_NUMBER_TYPE = "numbertype";
/*    */     public static final String CACHED_NUMBER_LABEL = "numberlabel";
/*    */     public static final String IS_READ = "is_read";
/*    */ 
/*    */     public Calls()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public static String getLastOutgoingCall(Context context) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.provider.CallLog
 * JD-Core Version:    0.6.2
 */