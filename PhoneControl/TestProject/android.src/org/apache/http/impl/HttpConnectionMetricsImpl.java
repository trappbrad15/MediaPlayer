/*    */ package org.apache.http.impl;
/*    */ 
/*    */ import org.apache.http.HttpConnectionMetrics;
/*    */ import org.apache.http.io.HttpTransportMetrics;
/*    */ 
/*    */ public class HttpConnectionMetricsImpl
/*    */   implements HttpConnectionMetrics
/*    */ {
/*    */   public static final String REQUEST_COUNT = "http.request-count";
/*    */   public static final String RESPONSE_COUNT = "http.response-count";
/*    */   public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";
/*    */   public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
/*    */ 
/*    */   public HttpConnectionMetricsImpl(HttpTransportMetrics inTransportMetric, HttpTransportMetrics outTransportMetric)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public long getReceivedBytesCount() { throw new RuntimeException("Stub!"); } 
/*  7 */   public long getSentBytesCount() { throw new RuntimeException("Stub!"); } 
/*  8 */   public long getRequestCount() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void incrementRequestCount() { throw new RuntimeException("Stub!"); } 
/* 10 */   public long getResponseCount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void incrementResponseCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object getMetric(String metricName) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setMetric(String metricName, Object obj) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void reset() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.HttpConnectionMetricsImpl
 * JD-Core Version:    0.6.2
 */