/*    */ package android.view;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
/*    */ import java.lang.annotation.Target;
/*    */ 
/*    */ public class ViewDebug
/*    */ {
/*    */ 
/*    */   @Deprecated
/*    */   public static final boolean TRACE_HIERARCHY = false;
/*    */ 
/*    */   @Deprecated
/*    */   public static final boolean TRACE_RECYCLER = false;
/*    */ 
/*    */   public ViewDebug()
/*    */   {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/* 63 */   @Deprecated
/*    */   public static void trace(View view, RecyclerTraceType type, int[] parameters) { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   public static void startRecyclerTracing(String prefix, View view) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/* 69 */   @Deprecated
/*    */   public static void stopRecyclerTracing() { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   public static void trace(View view, HierarchyTraceType type) {
/* 72 */     throw new RuntimeException("Stub!");
/*    */   }
/* 75 */   @Deprecated
/*    */   public static void startHierarchyTracing(String prefix, View view) { throw new RuntimeException("Stub!"); } 
/* 77 */   @Deprecated
/*    */   public static void stopHierarchyTracing() { throw new RuntimeException("Stub!"); } 
/* 78 */   public static void dumpCapturedView(String tag, Object view) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   @Deprecated
/*    */   public static enum RecyclerTraceType
/*    */   {
/* 53 */     BIND_VIEW, 
/* 54 */     MOVE_FROM_ACTIVE_TO_SCRAP_HEAP, 
/* 55 */     MOVE_TO_SCRAP_HEAP, 
/* 56 */     NEW_VIEW, 
/* 57 */     RECYCLE_FROM_ACTIVE_HEAP, 
/* 58 */     RECYCLE_FROM_SCRAP_HEAP;
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public static enum HierarchyTraceType
/*    */   {
/* 41 */     BUILD_CACHE, 
/* 42 */     DRAW, 
/* 43 */     INVALIDATE, 
/* 44 */     INVALIDATE_CHILD, 
/* 45 */     INVALIDATE_CHILD_IN_PARENT, 
/* 46 */     ON_LAYOUT, 
/* 47 */     ON_MEASURE, 
/* 48 */     REQUEST_LAYOUT;
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface CapturedViewProperty
/*    */   {
/*    */     public abstract boolean retrieveReturn();
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.TYPE})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface FlagToString
/*    */   {
/*    */     public abstract int mask();
/*    */ 
/*    */     public abstract int equals();
/*    */ 
/*    */     public abstract String name();
/*    */ 
/*    */     public abstract boolean outputIf();
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.TYPE})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface IntToString
/*    */   {
/*    */     public abstract int from();
/*    */ 
/*    */     public abstract String to();
/*    */   }
/*    */ 
/*    */   @Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface ExportedProperty
/*    */   {
/*    */     public abstract boolean resolveId();
/*    */ 
/*    */     public abstract ViewDebug.IntToString[] mapping();
/*    */ 
/*    */     public abstract ViewDebug.IntToString[] indexMapping();
/*    */ 
/*    */     public abstract ViewDebug.FlagToString[] flagMapping();
/*    */ 
/*    */     public abstract boolean deepExport();
/*    */ 
/*    */     public abstract String prefix();
/*    */ 
/*    */     public abstract String category();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.ViewDebug
 * JD-Core Version:    0.6.2
 */