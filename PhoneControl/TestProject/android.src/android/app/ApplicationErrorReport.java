/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ 
/*    */ public class ApplicationErrorReport
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int TYPE_NONE = 0;
/*    */   public static final int TYPE_CRASH = 1;
/*    */   public static final int TYPE_ANR = 2;
/*    */   public static final int TYPE_BATTERY = 3;
/*    */   public static final int TYPE_RUNNING_SERVICE = 5;
/*    */   public int type;
/*    */   public String packageName;
/*    */   public String installerPackageName;
/*    */   public String processName;
/*    */   public long time;
/*    */   public boolean systemApp;
/*    */   public CrashInfo crashInfo;
/*    */   public AnrInfo anrInfo;
/*    */   public BatteryInfo batteryInfo;
/*    */   public RunningServiceInfo runningServiceInfo;
/* 72 */   public static final Parcelable.Creator<ApplicationErrorReport> CREATOR = null;
/*    */ 
/*    */   public ApplicationErrorReport()
/*    */   {
/* 50 */     throw new RuntimeException("Stub!"); } 
/* 51 */   public static ComponentName getErrorReportReceiver(Context context, String packageName, int appFlags) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 54 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 55 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class RunningServiceInfo
/*    */   {
/*    */     public long durationMillis;
/*    */     public String serviceDetails;
/*    */ 
/*    */     public RunningServiceInfo()
/*    */     {
/* 43 */       throw new RuntimeException("Stub!"); } 
/* 44 */     public RunningServiceInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 45 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 46 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static class BatteryInfo
/*    */   {
/*    */     public int usagePercent;
/*    */     public long durationMicros;
/*    */     public String usageDetails;
/*    */     public String checkinDetails;
/*    */ 
/*    */     public BatteryInfo()
/*    */     {
/* 32 */       throw new RuntimeException("Stub!"); } 
/* 33 */     public BatteryInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 34 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 35 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static class AnrInfo
/*    */   {
/*    */     public String activity;
/*    */     public String cause;
/*    */     public String info;
/*    */ 
/*    */     public AnrInfo()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!"); } 
/* 23 */     public AnrInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 24 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 25 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static class CrashInfo
/*    */   {
/*    */     public String exceptionClassName;
/*    */     public String exceptionMessage;
/*    */     public String throwFileName;
/*    */     public String throwClassName;
/*    */     public String throwMethodName;
/*    */     public int throwLineNumber;
/*    */     public String stackTrace;
/*    */ 
/*    */     public CrashInfo()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public CrashInfo(Throwable tr) { throw new RuntimeException("Stub!"); } 
/*  9 */     public CrashInfo(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 10 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 11 */     public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.ApplicationErrorReport
 * JD-Core Version:    0.6.2
 */