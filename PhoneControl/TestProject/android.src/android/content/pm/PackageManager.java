/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AndroidException;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class PackageManager
/*    */ {
/*    */   public static final int GET_ACTIVITIES = 1;
/*    */   public static final int GET_RECEIVERS = 2;
/*    */   public static final int GET_SERVICES = 4;
/*    */   public static final int GET_PROVIDERS = 8;
/*    */   public static final int GET_INSTRUMENTATION = 16;
/*    */   public static final int GET_INTENT_FILTERS = 32;
/*    */   public static final int GET_SIGNATURES = 64;
/*    */   public static final int GET_RESOLVED_FILTER = 64;
/*    */   public static final int GET_META_DATA = 128;
/*    */   public static final int GET_GIDS = 256;
/*    */   public static final int GET_DISABLED_COMPONENTS = 512;
/*    */   public static final int GET_SHARED_LIBRARY_FILES = 1024;
/*    */   public static final int GET_URI_PERMISSION_PATTERNS = 2048;
/*    */   public static final int GET_PERMISSIONS = 4096;
/*    */   public static final int GET_UNINSTALLED_PACKAGES = 8192;
/*    */   public static final int GET_CONFIGURATIONS = 16384;
/*    */   public static final int GET_DISABLED_UNTIL_USED_COMPONENTS = 32768;
/*    */   public static final int MATCH_DEFAULT_ONLY = 65536;
/*    */   public static final int PERMISSION_GRANTED = 0;
/*    */   public static final int PERMISSION_DENIED = -1;
/*    */   public static final int SIGNATURE_MATCH = 0;
/*    */   public static final int SIGNATURE_NEITHER_SIGNED = 1;
/*    */   public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
/*    */   public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
/*    */   public static final int SIGNATURE_NO_MATCH = -3;
/*    */   public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
/*    */   public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
/*    */   public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
/*    */   public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
/*    */   public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;
/*    */   public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;
/*    */   public static final int DONT_KILL_APP = 1;
/*    */   public static final int VERIFICATION_ALLOW = 1;
/*    */   public static final int VERIFICATION_REJECT = -1;
/*    */   public static final long MAXIMUM_VERIFICATION_TIMEOUT = 3600000L;
/*    */   public static final String FEATURE_AUDIO_LOW_LATENCY = "android.hardware.audio.low_latency";
/*    */   public static final String FEATURE_BLUETOOTH = "android.hardware.bluetooth";
/*    */   public static final String FEATURE_BLUETOOTH_LE = "android.hardware.bluetooth_le";
/*    */   public static final String FEATURE_CAMERA = "android.hardware.camera";
/*    */   public static final String FEATURE_CAMERA_AUTOFOCUS = "android.hardware.camera.autofocus";
/*    */   public static final String FEATURE_CAMERA_ANY = "android.hardware.camera.any";
/*    */   public static final String FEATURE_CAMERA_FLASH = "android.hardware.camera.flash";
/*    */   public static final String FEATURE_CAMERA_FRONT = "android.hardware.camera.front";
/*    */   public static final String FEATURE_LOCATION = "android.hardware.location";
/*    */   public static final String FEATURE_LOCATION_GPS = "android.hardware.location.gps";
/*    */   public static final String FEATURE_LOCATION_NETWORK = "android.hardware.location.network";
/*    */   public static final String FEATURE_MICROPHONE = "android.hardware.microphone";
/*    */   public static final String FEATURE_NFC = "android.hardware.nfc";
/*    */   public static final String FEATURE_SENSOR_ACCELEROMETER = "android.hardware.sensor.accelerometer";
/*    */   public static final String FEATURE_SENSOR_BAROMETER = "android.hardware.sensor.barometer";
/*    */   public static final String FEATURE_SENSOR_COMPASS = "android.hardware.sensor.compass";
/*    */   public static final String FEATURE_SENSOR_GYROSCOPE = "android.hardware.sensor.gyroscope";
/*    */   public static final String FEATURE_SENSOR_LIGHT = "android.hardware.sensor.light";
/*    */   public static final String FEATURE_SENSOR_PROXIMITY = "android.hardware.sensor.proximity";
/*    */   public static final String FEATURE_TELEPHONY = "android.hardware.telephony";
/*    */   public static final String FEATURE_TELEPHONY_CDMA = "android.hardware.telephony.cdma";
/*    */   public static final String FEATURE_TELEPHONY_GSM = "android.hardware.telephony.gsm";
/*    */   public static final String FEATURE_USB_HOST = "android.hardware.usb.host";
/*    */   public static final String FEATURE_USB_ACCESSORY = "android.hardware.usb.accessory";
/*    */   public static final String FEATURE_SIP = "android.software.sip";
/*    */   public static final String FEATURE_SIP_VOIP = "android.software.sip.voip";
/*    */   public static final String FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";
/*    */   public static final String FEATURE_TOUCHSCREEN_MULTITOUCH = "android.hardware.touchscreen.multitouch";
/*    */   public static final String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = "android.hardware.touchscreen.multitouch.distinct";
/*    */   public static final String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = "android.hardware.touchscreen.multitouch.jazzhand";
/*    */   public static final String FEATURE_FAKETOUCH = "android.hardware.faketouch";
/*    */   public static final String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = "android.hardware.faketouch.multitouch.distinct";
/*    */   public static final String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = "android.hardware.faketouch.multitouch.jazzhand";
/*    */   public static final String FEATURE_SCREEN_PORTRAIT = "android.hardware.screen.portrait";
/*    */   public static final String FEATURE_SCREEN_LANDSCAPE = "android.hardware.screen.landscape";
/*    */   public static final String FEATURE_LIVE_WALLPAPER = "android.software.live_wallpaper";
/*    */   public static final String FEATURE_APP_WIDGETS = "android.software.app_widgets";
/*    */   public static final String FEATURE_HOME_SCREEN = "android.software.home_screen";
/*    */   public static final String FEATURE_INPUT_METHODS = "android.software.input_methods";
/*    */   public static final String FEATURE_WIFI = "android.hardware.wifi";
/*    */   public static final String FEATURE_WIFI_DIRECT = "android.hardware.wifi.direct";
/*    */   public static final String FEATURE_TELEVISION = "android.hardware.type.television";
/*    */   public static final String EXTRA_VERIFICATION_ID = "android.content.pm.extra.VERIFICATION_ID";
/*    */   public static final String EXTRA_VERIFICATION_RESULT = "android.content.pm.extra.VERIFICATION_RESULT";
/*    */ 
/*    */   public PackageManager()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract PackageInfo getPackageInfo(String paramString, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract String[] currentToCanonicalPackageNames(String[] paramArrayOfString);
/*    */ 
/*    */   public abstract String[] canonicalToCurrentPackageNames(String[] paramArrayOfString);
/*    */ 
/*    */   public abstract Intent getLaunchIntentForPackage(String paramString);
/*    */ 
/*    */   public abstract int[] getPackageGids(String paramString) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract PermissionInfo getPermissionInfo(String paramString, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract List<PermissionInfo> queryPermissionsByGroup(String paramString, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract PermissionGroupInfo getPermissionGroupInfo(String paramString, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract List<PermissionGroupInfo> getAllPermissionGroups(int paramInt);
/*    */ 
/*    */   public abstract ApplicationInfo getApplicationInfo(String paramString, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract ActivityInfo getActivityInfo(ComponentName paramComponentName, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract ActivityInfo getReceiverInfo(ComponentName paramComponentName, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract ServiceInfo getServiceInfo(ComponentName paramComponentName, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract ProviderInfo getProviderInfo(ComponentName paramComponentName, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract List<PackageInfo> getInstalledPackages(int paramInt);
/*    */ 
/*    */   public abstract List<PackageInfo> getPackagesHoldingPermissions(String[] paramArrayOfString, int paramInt);
/*    */ 
/*    */   public abstract int checkPermission(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract boolean addPermission(PermissionInfo paramPermissionInfo);
/*    */ 
/*    */   public abstract boolean addPermissionAsync(PermissionInfo paramPermissionInfo);
/*    */ 
/*    */   public abstract void removePermission(String paramString);
/*    */ 
/*    */   public abstract int checkSignatures(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract int checkSignatures(int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract String[] getPackagesForUid(int paramInt);
/*    */ 
/*    */   public abstract String getNameForUid(int paramInt);
/*    */ 
/*    */   public abstract List<ApplicationInfo> getInstalledApplications(int paramInt);
/*    */ 
/*    */   public abstract String[] getSystemSharedLibraryNames();
/*    */ 
/*    */   public abstract FeatureInfo[] getSystemAvailableFeatures();
/*    */ 
/*    */   public abstract boolean hasSystemFeature(String paramString);
/*    */ 
/*    */   public abstract ResolveInfo resolveActivity(Intent paramIntent, int paramInt);
/*    */ 
/*    */   public abstract List<ResolveInfo> queryIntentActivities(Intent paramIntent, int paramInt);
/*    */ 
/*    */   public abstract List<ResolveInfo> queryIntentActivityOptions(ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt);
/*    */ 
/*    */   public abstract List<ResolveInfo> queryBroadcastReceivers(Intent paramIntent, int paramInt);
/*    */ 
/*    */   public abstract ResolveInfo resolveService(Intent paramIntent, int paramInt);
/*    */ 
/*    */   public abstract List<ResolveInfo> queryIntentServices(Intent paramIntent, int paramInt);
/*    */ 
/*    */   public abstract ProviderInfo resolveContentProvider(String paramString, int paramInt);
/*    */ 
/*    */   public abstract List<ProviderInfo> queryContentProviders(String paramString, int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract InstrumentationInfo getInstrumentationInfo(ComponentName paramComponentName, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract List<InstrumentationInfo> queryInstrumentation(String paramString, int paramInt);
/*    */ 
/*    */   public abstract Drawable getDrawable(String paramString, int paramInt, ApplicationInfo paramApplicationInfo);
/*    */ 
/*    */   public abstract Drawable getActivityIcon(ComponentName paramComponentName) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Drawable getActivityIcon(Intent paramIntent) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Drawable getDefaultActivityIcon();
/*    */ 
/*    */   public abstract Drawable getApplicationIcon(ApplicationInfo paramApplicationInfo);
/*    */ 
/*    */   public abstract Drawable getApplicationIcon(String paramString) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Drawable getActivityLogo(ComponentName paramComponentName) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Drawable getActivityLogo(Intent paramIntent) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Drawable getApplicationLogo(ApplicationInfo paramApplicationInfo);
/*    */ 
/*    */   public abstract Drawable getApplicationLogo(String paramString) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract CharSequence getText(String paramString, int paramInt, ApplicationInfo paramApplicationInfo);
/*    */ 
/*    */   public abstract XmlResourceParser getXml(String paramString, int paramInt, ApplicationInfo paramApplicationInfo);
/*    */ 
/*    */   public abstract CharSequence getApplicationLabel(ApplicationInfo paramApplicationInfo);
/*    */ 
/*    */   public abstract Resources getResourcesForActivity(ComponentName paramComponentName) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Resources getResourcesForApplication(ApplicationInfo paramApplicationInfo) throws PackageManager.NameNotFoundException;
/*    */ 
/*    */   public abstract Resources getResourcesForApplication(String paramString) throws PackageManager.NameNotFoundException;
/*    */ 
/* 65 */   public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public abstract void verifyPendingInstall(int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract void extendVerificationTimeout(int paramInt1, int paramInt2, long paramLong);
/*    */ 
/*    */   public abstract void setInstallerPackageName(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract String getInstallerPackageName(String paramString);
/*    */ 
/*    */   @Deprecated
/*    */   public abstract void addPackageToPreferred(String paramString);
/*    */ 
/*    */   @Deprecated
/*    */   public abstract void removePackageFromPreferred(String paramString);
/*    */ 
/*    */   public abstract List<PackageInfo> getPreferredPackages(int paramInt);
/*    */ 
/*    */   @Deprecated
/*    */   public abstract void addPreferredActivity(IntentFilter paramIntentFilter, int paramInt, ComponentName[] paramArrayOfComponentName, ComponentName paramComponentName);
/*    */ 
/*    */   public abstract void clearPackagePreferredActivities(String paramString);
/*    */ 
/*    */   public abstract int getPreferredActivities(List<IntentFilter> paramList, List<ComponentName> paramList1, String paramString);
/*    */ 
/*    */   public abstract void setComponentEnabledSetting(ComponentName paramComponentName, int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract int getComponentEnabledSetting(ComponentName paramComponentName);
/*    */ 
/*    */   public abstract void setApplicationEnabledSetting(String paramString, int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract int getApplicationEnabledSetting(String paramString);
/*    */ 
/*    */   public abstract boolean isSafeMode();
/*    */ 
/*    */   public static class NameNotFoundException extends AndroidException
/*    */   {
/*    */     public NameNotFoundException()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public NameNotFoundException(String name) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.pm.PackageManager
 * JD-Core Version:    0.6.2
 */