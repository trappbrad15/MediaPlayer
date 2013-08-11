/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public final class Entity
/*    */ {
/*    */   public Entity(ContentValues values)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public ContentValues getEntityValues() { throw new RuntimeException("Stub!"); } 
/* 12 */   public ArrayList<NamedContentValues> getSubValues() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void addSubValue(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class NamedContentValues
/*    */   {
/*    */     public final Uri uri;
/*    */     public final ContentValues values;
/*    */ 
/*    */     public NamedContentValues(Uri uri, ContentValues values)
/*    */     {
/*  6 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.Entity
 * JD-Core Version:    0.6.2
 */