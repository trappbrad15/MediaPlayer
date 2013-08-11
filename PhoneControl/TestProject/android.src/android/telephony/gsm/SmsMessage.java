/*    */ package android.telephony.gsm;
/*    */ 
/*    */ @Deprecated
/*    */ public class SmsMessage
/*    */ {
/*    */ 
/*    */   @Deprecated
/*    */   public static final int ENCODING_UNKNOWN = 0;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int ENCODING_7BIT = 1;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int ENCODING_8BIT = 2;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int ENCODING_16BIT = 3;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MAX_USER_DATA_BYTES = 140;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MAX_USER_DATA_SEPTETS = 160;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
/*    */ 
/*    */   @Deprecated
/*    */   public SmsMessage()
/*    */   {
/* 27 */     throw new RuntimeException("Stub!"); } 
/* 29 */   @Deprecated
/*    */   public static SmsMessage createFromPdu(byte[] pdu) { throw new RuntimeException("Stub!"); } 
/* 31 */   @Deprecated
/*    */   public static int getTPLayerLengthForPDU(String pdu) { throw new RuntimeException("Stub!"); } 
/* 33 */   @Deprecated
/*    */   public static int[] calculateLength(CharSequence messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); } 
/* 35 */   @Deprecated
/*    */   public static int[] calculateLength(String messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); } 
/* 37 */   @Deprecated
/*    */   public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, String message, boolean statusReportRequested) { throw new RuntimeException("Stub!"); } 
/* 39 */   @Deprecated
/*    */   public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, short destinationPort, byte[] data, boolean statusReportRequested) { throw new RuntimeException("Stub!"); } 
/* 41 */   @Deprecated
/*    */   public String getServiceCenterAddress() { throw new RuntimeException("Stub!"); } 
/* 43 */   @Deprecated
/*    */   public String getOriginatingAddress() { throw new RuntimeException("Stub!"); } 
/* 45 */   @Deprecated
/*    */   public String getDisplayOriginatingAddress() { throw new RuntimeException("Stub!"); } 
/* 47 */   @Deprecated
/*    */   public String getMessageBody() { throw new RuntimeException("Stub!"); } 
/* 49 */   @Deprecated
/*    */   public MessageClass getMessageClass() { throw new RuntimeException("Stub!"); } 
/* 51 */   @Deprecated
/*    */   public String getDisplayMessageBody() { throw new RuntimeException("Stub!"); } 
/* 53 */   @Deprecated
/*    */   public String getPseudoSubject() { throw new RuntimeException("Stub!"); } 
/* 55 */   @Deprecated
/*    */   public long getTimestampMillis() { throw new RuntimeException("Stub!"); } 
/* 57 */   @Deprecated
/*    */   public boolean isEmail() { throw new RuntimeException("Stub!"); } 
/* 59 */   @Deprecated
/*    */   public String getEmailBody() { throw new RuntimeException("Stub!"); } 
/* 61 */   @Deprecated
/*    */   public String getEmailFrom() { throw new RuntimeException("Stub!"); } 
/* 63 */   @Deprecated
/*    */   public int getProtocolIdentifier() { throw new RuntimeException("Stub!"); } 
/* 65 */   @Deprecated
/*    */   public boolean isReplace() { throw new RuntimeException("Stub!"); } 
/* 67 */   @Deprecated
/*    */   public boolean isCphsMwiMessage() { throw new RuntimeException("Stub!"); } 
/* 69 */   @Deprecated
/*    */   public boolean isMWIClearMessage() { throw new RuntimeException("Stub!"); } 
/* 71 */   @Deprecated
/*    */   public boolean isMWISetMessage() { throw new RuntimeException("Stub!"); } 
/* 73 */   @Deprecated
/*    */   public boolean isMwiDontStore() { throw new RuntimeException("Stub!"); } 
/* 75 */   @Deprecated
/*    */   public byte[] getUserData() { throw new RuntimeException("Stub!"); } 
/* 77 */   @Deprecated
/*    */   public byte[] getPdu() { throw new RuntimeException("Stub!"); } 
/* 79 */   @Deprecated
/*    */   public int getStatusOnSim() { throw new RuntimeException("Stub!"); } 
/* 81 */   @Deprecated
/*    */   public int getIndexOnSim() { throw new RuntimeException("Stub!"); } 
/* 83 */   @Deprecated
/*    */   public int getStatus() { throw new RuntimeException("Stub!"); } 
/* 85 */   @Deprecated
/*    */   public boolean isStatusReportMessage() { throw new RuntimeException("Stub!"); } 
/* 87 */   @Deprecated
/*    */   public boolean isReplyPathPresent() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   @Deprecated
/*    */   public static class SubmitPdu
/*    */   {
/*    */ 
/*    */     @Deprecated
/* 21 */     public byte[] encodedScAddress = null;
/*    */ 
/*    */     @Deprecated
/* 23 */     public byte[] encodedMessage = null;
/*    */ 
/*    */     @Deprecated
/*    */     public SubmitPdu()
/*    */     {
/* 18 */       throw new RuntimeException("Stub!"); } 
/* 20 */     @Deprecated
/*    */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public static enum MessageClass
/*    */   {
/*  8 */     CLASS_0, 
/*  9 */     CLASS_1, 
/* 10 */     CLASS_2, 
/* 11 */     CLASS_3, 
/* 12 */     UNKNOWN;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.telephony.gsm.SmsMessage
 * JD-Core Version:    0.6.2
 */