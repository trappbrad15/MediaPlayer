/*     */ package android.media;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.view.Display;
/*     */ import java.util.List;
/*     */ 
/*     */ public class MediaRouter
/*     */ {
/*     */   public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
/*     */   public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
/*     */   public static final int ROUTE_TYPE_USER = 8388608;
/*     */   public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
/*     */   public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
/*     */ 
/*     */   MediaRouter()
/*     */   {
/* 112 */     throw new RuntimeException("Stub!"); } 
/* 113 */   public RouteInfo getDefaultRoute() { throw new RuntimeException("Stub!"); } 
/* 114 */   public RouteInfo getSelectedRoute(int type) { throw new RuntimeException("Stub!"); } 
/* 115 */   public void addCallback(int types, Callback cb) { throw new RuntimeException("Stub!"); } 
/* 116 */   public void addCallback(int types, Callback cb, int flags) { throw new RuntimeException("Stub!"); } 
/* 117 */   public void removeCallback(Callback cb) { throw new RuntimeException("Stub!"); } 
/* 118 */   public void selectRoute(int types, RouteInfo route) { throw new RuntimeException("Stub!"); } 
/* 119 */   public void addUserRoute(UserRouteInfo info) { throw new RuntimeException("Stub!"); } 
/* 120 */   public void removeUserRoute(UserRouteInfo info) { throw new RuntimeException("Stub!"); } 
/* 121 */   public void clearUserRoutes() { throw new RuntimeException("Stub!"); } 
/* 122 */   public int getCategoryCount() { throw new RuntimeException("Stub!"); } 
/* 123 */   public RouteCategory getCategoryAt(int index) { throw new RuntimeException("Stub!"); } 
/* 124 */   public int getRouteCount() { throw new RuntimeException("Stub!"); } 
/* 125 */   public RouteInfo getRouteAt(int index) { throw new RuntimeException("Stub!"); } 
/* 126 */   public UserRouteInfo createUserRoute(RouteCategory category) { throw new RuntimeException("Stub!"); } 
/* 127 */   public RouteCategory createRouteCategory(CharSequence name, boolean isGroupable) { throw new RuntimeException("Stub!"); } 
/* 128 */   public RouteCategory createRouteCategory(int nameResId, boolean isGroupable) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static abstract class VolumeCallback
/*     */   {
/*     */     public VolumeCallback()
/*     */     {
/* 108 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public abstract void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt);
/*     */ 
/*     */     public abstract void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt);
/*     */   }
/*     */ 
/*     */   public static class SimpleCallback extends MediaRouter.Callback
/*     */   {
/*     */     public SimpleCallback()
/*     */     {
/*  96 */       throw new RuntimeException("Stub!"); } 
/*  97 */     public void onRouteSelected(MediaRouter router, int type, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); } 
/*  98 */     public void onRouteUnselected(MediaRouter router, int type, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); } 
/*  99 */     public void onRouteAdded(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); } 
/* 100 */     public void onRouteRemoved(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); } 
/* 101 */     public void onRouteChanged(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); } 
/* 102 */     public void onRouteGrouped(MediaRouter router, MediaRouter.RouteInfo info, MediaRouter.RouteGroup group, int index) { throw new RuntimeException("Stub!"); } 
/* 103 */     public void onRouteUngrouped(MediaRouter router, MediaRouter.RouteInfo info, MediaRouter.RouteGroup group) { throw new RuntimeException("Stub!"); } 
/* 104 */     public void onRouteVolumeChanged(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static abstract class Callback
/*     */   {
/*     */     public Callback()
/*     */     {
/*  82 */       throw new RuntimeException("Stub!"); } 
/*     */     public abstract void onRouteSelected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo);
/*     */ 
/*     */     public abstract void onRouteUnselected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo);
/*     */ 
/*     */     public abstract void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */ 
/*     */     public abstract void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */ 
/*     */     public abstract void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */ 
/*     */     public abstract void onRouteGrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup, int paramInt);
/*     */ 
/*     */     public abstract void onRouteUngrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup);
/*     */ 
/*     */     public abstract void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */ 
/*  91 */     public void onRoutePresentationDisplayChanged(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class RouteCategory
/*     */   {
/*     */     RouteCategory()
/*     */     {
/*  72 */       throw new RuntimeException("Stub!"); } 
/*  73 */     public CharSequence getName() { throw new RuntimeException("Stub!"); } 
/*  74 */     public CharSequence getName(Context context) { throw new RuntimeException("Stub!"); } 
/*  75 */     public List<MediaRouter.RouteInfo> getRoutes(List<MediaRouter.RouteInfo> out) { throw new RuntimeException("Stub!"); } 
/*  76 */     public int getSupportedTypes() { throw new RuntimeException("Stub!"); } 
/*  77 */     public boolean isGroupable() { throw new RuntimeException("Stub!"); } 
/*  78 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class RouteGroup extends MediaRouter.RouteInfo
/*     */   {
/*     */     RouteGroup()
/*     */     {
/*  57 */       throw new RuntimeException("Stub!"); } 
/*  58 */     public void addRoute(MediaRouter.RouteInfo route) { throw new RuntimeException("Stub!"); } 
/*  59 */     public void addRoute(MediaRouter.RouteInfo route, int insertAt) { throw new RuntimeException("Stub!"); } 
/*  60 */     public void removeRoute(MediaRouter.RouteInfo route) { throw new RuntimeException("Stub!"); } 
/*  61 */     public void removeRoute(int index) { throw new RuntimeException("Stub!"); } 
/*  62 */     public int getRouteCount() { throw new RuntimeException("Stub!"); } 
/*  63 */     public MediaRouter.RouteInfo getRouteAt(int index) { throw new RuntimeException("Stub!"); } 
/*  64 */     public void setIconDrawable(Drawable icon) { throw new RuntimeException("Stub!"); } 
/*  65 */     public void setIconResource(int resId) { throw new RuntimeException("Stub!"); } 
/*  66 */     public void requestSetVolume(int volume) { throw new RuntimeException("Stub!"); } 
/*  67 */     public void requestUpdateVolume(int direction) { throw new RuntimeException("Stub!"); } 
/*  68 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class UserRouteInfo extends MediaRouter.RouteInfo
/*     */   {
/*     */     UserRouteInfo()
/*     */     {
/*  36 */       throw new RuntimeException("Stub!"); } 
/*  37 */     public void setName(CharSequence name) { throw new RuntimeException("Stub!"); } 
/*  38 */     public void setName(int resId) { throw new RuntimeException("Stub!"); } 
/*  39 */     public void setDescription(CharSequence description) { throw new RuntimeException("Stub!"); } 
/*  40 */     public void setStatus(CharSequence status) { throw new RuntimeException("Stub!"); } 
/*  41 */     public void setRemoteControlClient(RemoteControlClient rcc) { throw new RuntimeException("Stub!"); } 
/*  42 */     public RemoteControlClient getRemoteControlClient() { throw new RuntimeException("Stub!"); } 
/*  43 */     public void setIconDrawable(Drawable icon) { throw new RuntimeException("Stub!"); } 
/*  44 */     public void setIconResource(int resId) { throw new RuntimeException("Stub!"); } 
/*  45 */     public void setVolumeCallback(MediaRouter.VolumeCallback vcb) { throw new RuntimeException("Stub!"); } 
/*  46 */     public void setPlaybackType(int type) { throw new RuntimeException("Stub!"); } 
/*  47 */     public void setVolumeHandling(int volumeHandling) { throw new RuntimeException("Stub!"); } 
/*  48 */     public void setVolume(int volume) { throw new RuntimeException("Stub!"); } 
/*  49 */     public void requestSetVolume(int volume) { throw new RuntimeException("Stub!"); } 
/*  50 */     public void requestUpdateVolume(int direction) { throw new RuntimeException("Stub!"); } 
/*  51 */     public void setVolumeMax(int volumeMax) { throw new RuntimeException("Stub!"); } 
/*  52 */     public void setPlaybackStream(int stream) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static class RouteInfo
/*     */   {
/*     */     public static final int PLAYBACK_TYPE_LOCAL = 0;
/*     */     public static final int PLAYBACK_TYPE_REMOTE = 1;
/*     */     public static final int PLAYBACK_VOLUME_FIXED = 0;
/*     */     public static final int PLAYBACK_VOLUME_VARIABLE = 1;
/*     */ 
/*     */     RouteInfo()
/*     */     {
/*   6 */       throw new RuntimeException("Stub!"); } 
/*   7 */     public CharSequence getName() { throw new RuntimeException("Stub!"); } 
/*   8 */     public CharSequence getName(Context context) { throw new RuntimeException("Stub!"); } 
/*   9 */     public CharSequence getDescription() { throw new RuntimeException("Stub!"); } 
/*  10 */     public CharSequence getStatus() { throw new RuntimeException("Stub!"); } 
/*  11 */     public int getSupportedTypes() { throw new RuntimeException("Stub!"); } 
/*  12 */     public MediaRouter.RouteGroup getGroup() { throw new RuntimeException("Stub!"); } 
/*  13 */     public MediaRouter.RouteCategory getCategory() { throw new RuntimeException("Stub!"); } 
/*  14 */     public Drawable getIconDrawable() { throw new RuntimeException("Stub!"); } 
/*  15 */     public void setTag(Object tag) { throw new RuntimeException("Stub!"); } 
/*  16 */     public Object getTag() { throw new RuntimeException("Stub!"); } 
/*  17 */     public int getPlaybackType() { throw new RuntimeException("Stub!"); } 
/*  18 */     public int getPlaybackStream() { throw new RuntimeException("Stub!"); } 
/*  19 */     public int getVolume() { throw new RuntimeException("Stub!"); } 
/*  20 */     public void requestSetVolume(int volume) { throw new RuntimeException("Stub!"); } 
/*  21 */     public void requestUpdateVolume(int direction) { throw new RuntimeException("Stub!"); } 
/*  22 */     public int getVolumeMax() { throw new RuntimeException("Stub!"); } 
/*  23 */     public int getVolumeHandling() { throw new RuntimeException("Stub!"); } 
/*  24 */     public Display getPresentationDisplay() { throw new RuntimeException("Stub!"); } 
/*  25 */     public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/*  26 */     public boolean isConnecting() { throw new RuntimeException("Stub!"); } 
/*  27 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.media.MediaRouter
 * JD-Core Version:    0.6.2
 */