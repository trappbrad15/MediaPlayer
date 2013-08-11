/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public abstract class SignatureSpi
/*    */ {
/*    */   protected SecureRandom appRandom;
/*    */ 
/*    */   public SignatureSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException;
/*    */ 
/*    */   protected abstract void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException;
/*    */ 
/*  7 */   protected void engineInitSign(PrivateKey privateKey, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineUpdate(byte paramByte) throws SignatureException;
/*    */ 
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws SignatureException;
/*    */ 
/* 10 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract byte[] engineSign() throws SignatureException;
/*    */ 
/* 12 */   protected int engineSign(byte[] outbuf, int offset, int len) throws SignatureException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract boolean engineVerify(byte[] paramArrayOfByte) throws SignatureException;
/*    */ 
/* 14 */   protected boolean engineVerify(byte[] sigBytes, int offset, int length) throws SignatureException { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   protected abstract void engineSetParameter(String paramString, Object paramObject) throws InvalidParameterException;
/*    */ 
/* 17 */   protected void engineSetParameter(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 18 */   protected AlgorithmParameters engineGetParameters() { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   protected abstract Object engineGetParameter(String paramString) throws InvalidParameterException;
/*    */ 
/* 21 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.SignatureSpi
 * JD-Core Version:    0.6.2
 */