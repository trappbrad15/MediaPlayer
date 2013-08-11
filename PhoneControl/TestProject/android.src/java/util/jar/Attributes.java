/*    */ package java.util.jar;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Attributes
/*    */   implements Cloneable, Map<Object, Object>
/*    */ {
/*    */   protected Map<Object, Object> map;
/*    */ 
/*    */   public Attributes()
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/* 32 */   public Attributes(Attributes attrib) { throw new RuntimeException("Stub!"); } 
/* 33 */   public Attributes(int size) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); } 
/* 37 */   public Set<Map.Entry<Object, Object>> entrySet() { throw new RuntimeException("Stub!"); } 
/* 38 */   public Object get(Object key) { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 40 */   public Set<Object> keySet() { throw new RuntimeException("Stub!"); } 
/*    */   public Object put(Object key, Object value) {
/* 42 */     throw new RuntimeException("Stub!"); } 
/* 43 */   public void putAll(Map<?, ?> attrib) { throw new RuntimeException("Stub!"); } 
/* 44 */   public Object remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 45 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 46 */   public Collection<Object> values() { throw new RuntimeException("Stub!"); } 
/*    */   public Object clone() {
/* 48 */     throw new RuntimeException("Stub!"); } 
/* 49 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 51 */   public String getValue(Name name) { throw new RuntimeException("Stub!"); } 
/* 52 */   public String getValue(String name) { throw new RuntimeException("Stub!"); } 
/* 53 */   public String putValue(String name, String val) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class Name
/*    */   {
/* 28 */     public static final Name CLASS_PATH = null; public static final Name MANIFEST_VERSION = null; public static final Name MAIN_CLASS = null; public static final Name SIGNATURE_VERSION = null; public static final Name CONTENT_TYPE = null; public static final Name SEALED = null; public static final Name IMPLEMENTATION_TITLE = null; public static final Name IMPLEMENTATION_VERSION = null; public static final Name IMPLEMENTATION_VENDOR = null; public static final Name SPECIFICATION_TITLE = null; public static final Name SPECIFICATION_VERSION = null; public static final Name SPECIFICATION_VENDOR = null; public static final Name EXTENSION_LIST = null; public static final Name EXTENSION_NAME = null; public static final Name EXTENSION_INSTALLATION = null; public static final Name IMPLEMENTATION_VENDOR_ID = null; public static final Name IMPLEMENTATION_URL = null;
/*    */ 
/*    */     public Name(String name)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/*  9 */     public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 10 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.jar.Attributes
 * JD-Core Version:    0.6.2
 */