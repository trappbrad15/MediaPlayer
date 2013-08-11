/*    */ package android.net.http;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.net.CacheRequest;
/*    */ import java.net.CacheResponse;
/*    */ import java.net.ResponseCache;
/*    */ import java.net.URI;
/*    */ import java.net.URLConnection;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public final class HttpResponseCache extends ResponseCache
/*    */   implements Closeable
/*    */ {
/*    */   HttpResponseCache()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static HttpResponseCache getInstalled() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static HttpResponseCache install(File directory, long maxSize) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public CacheResponse get(URI uri, String requestMethod, Map<String, List<String>> requestHeaders) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public CacheRequest put(URI uri, URLConnection urlConnection) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public long size() { throw new RuntimeException("Stub!"); } 
/* 12 */   public long maxSize() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void flush() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getNetworkCount() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getHitCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getRequestCount() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void delete() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.http.HttpResponseCache
 * JD-Core Version:    0.6.2
 */