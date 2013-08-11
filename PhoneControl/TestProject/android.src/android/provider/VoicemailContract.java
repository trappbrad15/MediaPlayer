/*    */ package android.provider;
/*    */ 
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class VoicemailContract
/*    */ {
/*    */   public static final String AUTHORITY = "com.android.voicemail";
/*    */   public static final String PARAM_KEY_SOURCE_PACKAGE = "source_package";
/*    */   public static final String ACTION_NEW_VOICEMAIL = "android.intent.action.NEW_VOICEMAIL";
/*    */   public static final String ACTION_FETCH_VOICEMAIL = "android.intent.action.FETCH_VOICEMAIL";
/*    */   public static final String EXTRA_SELF_CHANGE = "com.android.voicemail.extra.SELF_CHANGE";
/*    */ 
/*    */   VoicemailContract()
/*    */   {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class Status
/*    */     implements BaseColumns
/*    */   {
/* 44 */     public static final Uri CONTENT_URI = null;
/*    */     public static final String DIR_TYPE = "vnd.android.cursor.dir/voicemail.source.status";
/*    */     public static final String ITEM_TYPE = "vnd.android.cursor.item/voicemail.source.status";
/*    */     public static final String SOURCE_PACKAGE = "source_package";
/*    */     public static final String SETTINGS_URI = "settings_uri";
/*    */     public static final String VOICEMAIL_ACCESS_URI = "voicemail_access_uri";
/*    */     public static final String CONFIGURATION_STATE = "configuration_state";
/*    */     public static final int CONFIGURATION_STATE_OK = 0;
/*    */     public static final int CONFIGURATION_STATE_NOT_CONFIGURED = 1;
/*    */     public static final int CONFIGURATION_STATE_CAN_BE_CONFIGURED = 2;
/*    */     public static final String DATA_CHANNEL_STATE = "data_channel_state";
/*    */     public static final int DATA_CHANNEL_STATE_OK = 0;
/*    */     public static final int DATA_CHANNEL_STATE_NO_CONNECTION = 1;
/*    */     public static final String NOTIFICATION_CHANNEL_STATE = "notification_channel_state";
/*    */     public static final int NOTIFICATION_CHANNEL_STATE_OK = 0;
/*    */     public static final int NOTIFICATION_CHANNEL_STATE_NO_CONNECTION = 1;
/*    */     public static final int NOTIFICATION_CHANNEL_STATE_MESSAGE_WAITING = 2;
/*    */ 
/*    */     Status()
/*    */     {
/* 25 */       throw new RuntimeException("Stub!"); } 
/* 26 */     public static Uri buildSourceUri(String packageName) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static final class Voicemails
/*    */     implements BaseColumns, OpenableColumns
/*    */   {
/* 20 */     public static final Uri CONTENT_URI = null;
/*    */     public static final String DIR_TYPE = "vnd.android.cursor.dir/voicemails";
/*    */     public static final String ITEM_TYPE = "vnd.android.cursor.item/voicemail";
/*    */     public static final String NUMBER = "number";
/*    */     public static final String DATE = "date";
/*    */     public static final String DURATION = "duration";
/*    */     public static final String IS_READ = "is_read";
/*    */     public static final String SOURCE_PACKAGE = "source_package";
/*    */     public static final String SOURCE_DATA = "source_data";
/*    */     public static final String HAS_CONTENT = "has_content";
/*    */     public static final String MIME_TYPE = "mime_type";
/*    */ 
/*    */     Voicemails()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public static Uri buildSourceUri(String packageName) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.provider.VoicemailContract
 * JD-Core Version:    0.6.2
 */