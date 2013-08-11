/*    */ package android.telephony.gsm;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ @Deprecated
/*    */ public final class SmsManager
/*    */ {
/*    */ 
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_FREE = 0;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_READ = 1;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_UNREAD = 3;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_SENT = 5;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_UNSENT = 7;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_RADIO_OFF = 2;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_NULL_PDU = 3;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_NO_SERVICE = 4;
/*    */ 
/*    */   SmsManager()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  7 */   @Deprecated
/*    */   public static final SmsManager getDefault() { throw new RuntimeException("Stub!"); } 
/*  9 */   @Deprecated
/*    */   public final void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); } 
/* 11 */   @Deprecated
/*    */   public final ArrayList<String> divideMessage(String text) { throw new RuntimeException("Stub!"); } 
/* 13 */   @Deprecated
/*    */   public final void sendMultipartTextMessage(String destinationAddress, String scAddress, ArrayList<String> parts, ArrayList<PendingIntent> sentIntents, ArrayList<PendingIntent> deliveryIntents) { throw new RuntimeException("Stub!"); } 
/* 15 */   @Deprecated
/*    */   public final void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.telephony.gsm.SmsManager
 * JD-Core Version:    0.6.2
 */