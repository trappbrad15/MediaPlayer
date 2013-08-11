/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Bitmap;
/*     */ import android.net.Uri;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.widget.RemoteViews;
/*     */ 
/*     */ public class Notification
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int DEFAULT_ALL = -1;
/*     */   public static final int DEFAULT_SOUND = 1;
/*     */   public static final int DEFAULT_VIBRATE = 2;
/*     */   public static final int DEFAULT_LIGHTS = 4;
/*     */   public long when;
/*     */   public int icon;
/*     */   public int iconLevel;
/*     */   public int number;
/*     */   public PendingIntent contentIntent;
/*     */   public PendingIntent deleteIntent;
/*     */   public PendingIntent fullScreenIntent;
/*     */   public CharSequence tickerText;
/*     */   public RemoteViews tickerView;
/*     */   public RemoteViews contentView;
/*     */   public RemoteViews bigContentView;
/*     */   public Bitmap largeIcon;
/*     */   public Uri sound;
/*     */   public static final int STREAM_DEFAULT = -1;
/*     */   public int audioStreamType;
/* 112 */   public long[] vibrate = null;
/*     */   public int ledARGB;
/*     */   public int ledOnMS;
/*     */   public int ledOffMS;
/*     */   public int defaults;
/*     */   public static final int FLAG_SHOW_LIGHTS = 1;
/*     */   public static final int FLAG_ONGOING_EVENT = 2;
/*     */   public static final int FLAG_INSISTENT = 4;
/*     */   public static final int FLAG_ONLY_ALERT_ONCE = 8;
/*     */   public static final int FLAG_AUTO_CANCEL = 16;
/*     */   public static final int FLAG_NO_CLEAR = 32;
/*     */   public static final int FLAG_FOREGROUND_SERVICE = 64;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int FLAG_HIGH_PRIORITY = 128;
/*     */   public int flags;
/*     */   public static final int PRIORITY_DEFAULT = 0;
/*     */   public static final int PRIORITY_LOW = -1;
/*     */   public static final int PRIORITY_MIN = -2;
/*     */   public static final int PRIORITY_HIGH = 1;
/*     */   public static final int PRIORITY_MAX = 2;
/*     */   public int priority;
/* 134 */   public static final Parcelable.Creator<Notification> CREATOR = null;
/*     */ 
/*     */   public Notification()
/*     */   {
/*  83 */     throw new RuntimeException("Stub!"); } 
/*  85 */   @Deprecated
/*     */   public Notification(int icon, CharSequence tickerText, long when) { throw new RuntimeException("Stub!"); } 
/*  86 */   public Notification(Parcel parcel) { throw new RuntimeException("Stub!"); } 
/*  87 */   public Notification clone() { throw new RuntimeException("Stub!"); } 
/*  88 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  89 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/*  91 */   @Deprecated
/*     */   public void setLatestEventInfo(Context context, CharSequence contentTitle, CharSequence contentText, PendingIntent contentIntent) { throw new RuntimeException("Stub!"); } 
/*  92 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static class InboxStyle extends Notification.Style
/*     */   {
/*     */     public InboxStyle()
/*     */     {
/*  76 */       throw new RuntimeException("Stub!"); } 
/*  77 */     public InboxStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); } 
/*  78 */     public InboxStyle setBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  79 */     public InboxStyle setSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/*  80 */     public InboxStyle addLine(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/*  81 */     public Notification build() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class BigTextStyle extends Notification.Style
/*     */   {
/*     */     public BigTextStyle()
/*     */     {
/*  66 */       throw new RuntimeException("Stub!"); } 
/*  67 */     public BigTextStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); } 
/*  68 */     public BigTextStyle setBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  69 */     public BigTextStyle setSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/*  70 */     public BigTextStyle bigText(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/*  71 */     public Notification build() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class BigPictureStyle extends Notification.Style
/*     */   {
/*     */     public BigPictureStyle()
/*     */     {
/*  55 */       throw new RuntimeException("Stub!"); } 
/*  56 */     public BigPictureStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); } 
/*  57 */     public BigPictureStyle setBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  58 */     public BigPictureStyle setSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/*  59 */     public BigPictureStyle bigPicture(Bitmap b) { throw new RuntimeException("Stub!"); } 
/*  60 */     public BigPictureStyle bigLargeIcon(Bitmap b) { throw new RuntimeException("Stub!"); } 
/*  61 */     public Notification build() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static abstract class Style
/*     */   {
/*     */     protected Notification.Builder mBuilder;
/*     */ 
/*     */     public Style()
/*     */     {
/*  43 */       throw new RuntimeException("Stub!"); } 
/*  44 */     protected void internalSetBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  45 */     protected void internalSetSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/*  46 */     public void setBuilder(Notification.Builder builder) { throw new RuntimeException("Stub!"); } 
/*  47 */     protected void checkBuilder() { throw new RuntimeException("Stub!"); } 
/*  48 */     protected RemoteViews getStandardView(int layoutId) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */     public abstract Notification build();
/*     */   }
/*     */ 
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(Context context)
/*     */     {
/*   7 */       throw new RuntimeException("Stub!"); } 
/*   8 */     public Builder setWhen(long when) { throw new RuntimeException("Stub!"); } 
/*   9 */     public Builder setShowWhen(boolean show) { throw new RuntimeException("Stub!"); } 
/*  10 */     public Builder setUsesChronometer(boolean b) { throw new RuntimeException("Stub!"); } 
/*  11 */     public Builder setSmallIcon(int icon) { throw new RuntimeException("Stub!"); } 
/*  12 */     public Builder setSmallIcon(int icon, int level) { throw new RuntimeException("Stub!"); } 
/*  13 */     public Builder setContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  14 */     public Builder setContentText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/*  15 */     public Builder setSubText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/*  16 */     public Builder setNumber(int number) { throw new RuntimeException("Stub!"); } 
/*  17 */     public Builder setContentInfo(CharSequence info) { throw new RuntimeException("Stub!"); } 
/*  18 */     public Builder setProgress(int max, int progress, boolean indeterminate) { throw new RuntimeException("Stub!"); } 
/*  19 */     public Builder setContent(RemoteViews views) { throw new RuntimeException("Stub!"); } 
/*  20 */     public Builder setContentIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/*  21 */     public Builder setDeleteIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/*  22 */     public Builder setFullScreenIntent(PendingIntent intent, boolean highPriority) { throw new RuntimeException("Stub!"); } 
/*  23 */     public Builder setTicker(CharSequence tickerText) { throw new RuntimeException("Stub!"); } 
/*  24 */     public Builder setTicker(CharSequence tickerText, RemoteViews views) { throw new RuntimeException("Stub!"); } 
/*  25 */     public Builder setLargeIcon(Bitmap icon) { throw new RuntimeException("Stub!"); } 
/*  26 */     public Builder setSound(Uri sound) { throw new RuntimeException("Stub!"); } 
/*  27 */     public Builder setSound(Uri sound, int streamType) { throw new RuntimeException("Stub!"); } 
/*  28 */     public Builder setVibrate(long[] pattern) { throw new RuntimeException("Stub!"); } 
/*  29 */     public Builder setLights(int argb, int onMs, int offMs) { throw new RuntimeException("Stub!"); } 
/*  30 */     public Builder setOngoing(boolean ongoing) { throw new RuntimeException("Stub!"); } 
/*  31 */     public Builder setOnlyAlertOnce(boolean onlyAlertOnce) { throw new RuntimeException("Stub!"); } 
/*  32 */     public Builder setAutoCancel(boolean autoCancel) { throw new RuntimeException("Stub!"); } 
/*  33 */     public Builder setDefaults(int defaults) { throw new RuntimeException("Stub!"); } 
/*  34 */     public Builder setPriority(int pri) { throw new RuntimeException("Stub!"); } 
/*  35 */     public Builder addAction(int icon, CharSequence title, PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/*  36 */     public Builder setStyle(Notification.Style style) { throw new RuntimeException("Stub!"); } 
/*  38 */     @Deprecated
/*     */     public Notification getNotification() { throw new RuntimeException("Stub!"); } 
/*  39 */     public Notification build() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.Notification
 * JD-Core Version:    0.6.2
 */