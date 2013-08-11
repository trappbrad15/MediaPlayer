/*    */ package android.text;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public final class BidiFormatter
/*    */ {
/*    */   BidiFormatter()
/*    */   {
/* 13 */     throw new RuntimeException("Stub!"); } 
/* 14 */   public static BidiFormatter getInstance() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static BidiFormatter getInstance(boolean rtlContext) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static BidiFormatter getInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isRtlContext() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean getStereoReset() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isRtl(String str) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String unicodeWrap(String str, TextDirectionHeuristic heuristic, boolean isolate) { throw new RuntimeException("Stub!"); } 
/* 21 */   public String unicodeWrap(String str, TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); } 
/* 22 */   public String unicodeWrap(String str, boolean isolate) { throw new RuntimeException("Stub!"); } 
/* 23 */   public String unicodeWrap(String str) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public Builder(boolean rtlContext) { throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder(Locale locale) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder stereoReset(boolean stereoReset) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder setTextDirectionHeuristic(TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); } 
/* 11 */     public BidiFormatter build() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.BidiFormatter
 * JD-Core Version:    0.6.2
 */