/*    */ package android.graphics;
/*    */ 
/*    */ import android.content.res.AssetManager;
/*    */ import java.io.File;
/*    */ 
/*    */ public class Typeface
/*    */ {
/* 26 */   public static final Typeface DEFAULT = null; public static final Typeface DEFAULT_BOLD = null; public static final Typeface SANS_SERIF = null; public static final Typeface SERIF = null; public static final Typeface MONOSPACE = null;
/*    */   public static final int NORMAL = 0;
/*    */   public static final int BOLD = 1;
/*    */   public static final int ITALIC = 2;
/*    */   public static final int BOLD_ITALIC = 3;
/*    */ 
/*    */   Typeface()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public int getStyle() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final boolean isBold() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final boolean isItalic() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static Typeface create(String familyName, int style) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static Typeface create(Typeface family, int style) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Typeface defaultFromStyle(int style) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Typeface createFromAsset(AssetManager mgr, String path) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Typeface createFromFile(File path) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static Typeface createFromFile(String path) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.Typeface
 * JD-Core Version:    0.6.2
 */