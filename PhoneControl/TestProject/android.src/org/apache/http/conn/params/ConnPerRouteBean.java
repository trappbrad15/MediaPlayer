/*    */ package org.apache.http.conn.params;
/*    */ 
/*    */ import java.util.Map;
/*    */ import org.apache.http.conn.routing.HttpRoute;
/*    */ 
/*    */ public final class ConnPerRouteBean
/*    */   implements ConnPerRoute
/*    */ {
/*    */   public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
/*    */ 
/*    */   public ConnPerRouteBean(int defaultMax)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ConnPerRouteBean() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getDefaultMax() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setDefaultMaxPerRoute(int max) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setMaxForRoute(HttpRoute route, int max) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getMaxForRoute(HttpRoute route) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setMaxForRoutes(Map<HttpRoute, Integer> map) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.params.ConnPerRouteBean
 * JD-Core Version:    0.6.2
 */