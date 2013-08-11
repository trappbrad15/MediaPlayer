/*    */ package javax.crypto.spec;
/*    */ 
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class OAEPParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/* 11 */   public static final OAEPParameterSpec DEFAULT = null;
/*    */ 
/*    */   public OAEPParameterSpec(String mdName, String mgfName, AlgorithmParameterSpec mgfSpec, PSource pSrc)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getDigestAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getMGFAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  8 */   public AlgorithmParameterSpec getMGFParameters() { throw new RuntimeException("Stub!"); } 
/*  9 */   public PSource getPSource() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.spec.OAEPParameterSpec
 * JD-Core Version:    0.6.2
 */