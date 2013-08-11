/*   */ package javax.xml.validation;
/*   */ 
/*   */ import org.w3c.dom.TypeInfo;
/*   */ 
/*   */ public abstract class TypeInfoProvider
/*   */ {
/*   */   protected TypeInfoProvider()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract TypeInfo getElementTypeInfo();
/*   */ 
/*   */   public abstract TypeInfo getAttributeTypeInfo(int paramInt);
/*   */ 
/*   */   public abstract boolean isIdAttribute(int paramInt);
/*   */ 
/*   */   public abstract boolean isSpecified(int paramInt);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.xml.validation.TypeInfoProvider
 * JD-Core Version:    0.6.2
 */