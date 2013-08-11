/*    */ package android.nfc;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.content.IntentFilter;
/*    */ import android.net.Uri;
/*    */ 
/*    */ public final class NfcAdapter
/*    */ {
/*    */   public static final String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";
/*    */   public static final String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";
/*    */   public static final String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";
/*    */   public static final String EXTRA_TAG = "android.nfc.extra.TAG";
/*    */   public static final String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";
/*    */   public static final String EXTRA_ID = "android.nfc.extra.ID";
/*    */   public static final String ACTION_ADAPTER_STATE_CHANGED = "android.nfc.action.ADAPTER_STATE_CHANGED";
/*    */   public static final String EXTRA_ADAPTER_STATE = "android.nfc.extra.ADAPTER_STATE";
/*    */   public static final int STATE_OFF = 1;
/*    */   public static final int STATE_TURNING_ON = 2;
/*    */   public static final int STATE_ON = 3;
/*    */   public static final int STATE_TURNING_OFF = 4;
/*    */ 
/*    */   NfcAdapter()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public static NfcAdapter getDefaultAdapter(Context context) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setBeamPushUris(Uri[] uris, Activity activity) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setBeamPushUrisCallback(CreateBeamUrisCallback callback, Activity activity) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setNdefPushMessage(NdefMessage message, Activity activity, Activity[] activities) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setNdefPushMessageCallback(CreateNdefMessageCallback callback, Activity activity, Activity[] activities) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setOnNdefPushCompleteCallback(OnNdefPushCompleteCallback callback, Activity activity, Activity[] activities) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void enableForegroundDispatch(Activity activity, PendingIntent intent, IntentFilter[] filters, String[][] techLists) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void disableForegroundDispatch(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 27 */   @Deprecated
/*    */   public void enableForegroundNdefPush(Activity activity, NdefMessage message) { throw new RuntimeException("Stub!"); } 
/* 29 */   @Deprecated
/*    */   public void disableForegroundNdefPush(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean isNdefPushEnabled() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface CreateBeamUrisCallback
/*    */   {
/*    */     public abstract Uri[] createBeamUris(NfcEvent paramNfcEvent);
/*    */   }
/*    */ 
/*    */   public static abstract interface CreateNdefMessageCallback
/*    */   {
/*    */     public abstract NdefMessage createNdefMessage(NfcEvent paramNfcEvent);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnNdefPushCompleteCallback
/*    */   {
/*    */     public abstract void onNdefPushComplete(NfcEvent paramNfcEvent);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.NfcAdapter
 * JD-Core Version:    0.6.2
 */