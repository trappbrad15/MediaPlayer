/*   */ package javax.xml.validation;
/*   */ 
/*   */ public abstract class Schema
/*   */ {
/*   */   protected Schema()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Validator newValidator();
/*   */ 
/*   */   public abstract ValidatorHandler newValidatorHandler();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.validation.Schema
 * JD-Core Version:    0.6.2
 */