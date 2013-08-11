/*    */ package android.security;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import java.security.Principal;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ public final class KeyChain
/*    */ {
/*    */   public static final String EXTRA_NAME = "name";
/*    */   public static final String EXTRA_CERTIFICATE = "CERT";
/*    */   public static final String EXTRA_PKCS12 = "PKCS12";
/*    */   public static final String ACTION_STORAGE_CHANGED = "android.security.STORAGE_CHANGED";
/*    */ 
/*    */   public KeyChain()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static Intent createInstallIntent() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static void choosePrivateKeyAlias(Activity activity, KeyChainAliasCallback response, String[] keyTypes, Principal[] issuers, String host, int port, String alias) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static PrivateKey getPrivateKey(Context context, String alias) throws KeyChainException, InterruptedException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static X509Certificate[] getCertificateChain(Context context, String alias) throws KeyChainException, InterruptedException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static boolean isKeyAlgorithmSupported(String algorithm) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static boolean isBoundKeyAlgorithm(String algorithm) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.security.KeyChain
 * JD-Core Version:    0.6.2
 */