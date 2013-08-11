/*    */ package android.media;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public final class MediaDrm
/*    */ {
/*    */   public static final int EVENT_PROVISION_REQUIRED = 1;
/*    */   public static final int EVENT_KEY_REQUIRED = 2;
/*    */   public static final int EVENT_KEY_EXPIRED = 3;
/*    */   public static final int EVENT_VENDOR_DEFINED = 4;
/*    */   public static final int KEY_TYPE_STREAMING = 1;
/*    */   public static final int KEY_TYPE_OFFLINE = 2;
/*    */   public static final int KEY_TYPE_RELEASE = 3;
/*    */   public static final String PROPERTY_VENDOR = "vendor";
/*    */   public static final String PROPERTY_VERSION = "version";
/*    */   public static final String PROPERTY_DESCRIPTION = "description";
/*    */   public static final String PROPERTY_ALGORITHMS = "algorithms";
/*    */   public static final String PROPERTY_DEVICE_UNIQUE_ID = "deviceUniqueId";
/*    */ 
/*    */   public MediaDrm(UUID uuid)
/*    */     throws UnsupportedSchemeException
/*    */   {
/* 28 */     throw new RuntimeException("Stub!"); } 
/* 29 */   public static final boolean isCryptoSchemeSupported(UUID uuid) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setOnEventListener(OnEventListener listener) { throw new RuntimeException("Stub!"); } 
/*    */   public native byte[] openSession() throws NotProvisionedException;
/*    */ 
/*    */   public native void closeSession(byte[] paramArrayOfByte);
/*    */ 
/*    */   public native KeyRequest getKeyRequest(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString, int paramInt, HashMap<String, String> paramHashMap) throws NotProvisionedException;
/*    */ 
/*    */   public native byte[] provideKeyResponse(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) throws NotProvisionedException, DeniedByServerException;
/*    */ 
/*    */   public native void restoreKeys(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
/*    */ 
/*    */   public native void removeKeys(byte[] paramArrayOfByte);
/*    */ 
/*    */   public native HashMap<String, String> queryKeyStatus(byte[] paramArrayOfByte);
/*    */ 
/*    */   public native ProvisionRequest getProvisionRequest();
/*    */ 
/*    */   public native void provideProvisionResponse(byte[] paramArrayOfByte) throws DeniedByServerException;
/*    */ 
/*    */   public native List<byte[]> getSecureStops();
/*    */ 
/*    */   public native void releaseSecureStops(byte[] paramArrayOfByte);
/*    */ 
/*    */   public native String getPropertyString(String paramString);
/*    */ 
/*    */   public native byte[] getPropertyByteArray(String paramString);
/*    */ 
/*    */   public native void setPropertyString(String paramString1, String paramString2);
/*    */ 
/*    */   public native void setPropertyByteArray(String paramString, byte[] paramArrayOfByte);
/*    */ 
/* 46 */   public CryptoSession getCryptoSession(byte[] sessionId, String cipherAlgorithm, String macAlgorithm) { throw new RuntimeException("Stub!"); } 
/* 47 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public final native void release();
/*    */ 
/*    */   public final class CryptoSession
/*    */   {
/*    */     CryptoSession()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!"); } 
/* 23 */     public byte[] encrypt(byte[] keyid, byte[] input, byte[] iv) { throw new RuntimeException("Stub!"); } 
/* 24 */     public byte[] decrypt(byte[] keyid, byte[] input, byte[] iv) { throw new RuntimeException("Stub!"); } 
/* 25 */     public byte[] sign(byte[] keyid, byte[] message) { throw new RuntimeException("Stub!"); } 
/* 26 */     public boolean verify(byte[] keyid, byte[] message, byte[] signature) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static final class ProvisionRequest
/*    */   {
/*    */     ProvisionRequest()
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public byte[] getData() { throw new RuntimeException("Stub!"); } 
/* 18 */     public String getDefaultUrl() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static final class KeyRequest
/*    */   {
/*    */     KeyRequest()
/*    */     {
/* 10 */       throw new RuntimeException("Stub!"); } 
/* 11 */     public byte[] getData() { throw new RuntimeException("Stub!"); } 
/* 12 */     public String getDefaultUrl() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static abstract interface OnEventListener
/*    */   {
/*    */     public abstract void onEvent(MediaDrm paramMediaDrm, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaDrm
 * JD-Core Version:    0.6.2
 */