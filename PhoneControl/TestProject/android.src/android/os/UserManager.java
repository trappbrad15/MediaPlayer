/*    */ package android.os;
/*    */ 
/*    */ public class UserManager
/*    */ {
/*    */   public static final String DISALLOW_MODIFY_ACCOUNTS = "no_modify_accounts";
/*    */   public static final String DISALLOW_CONFIG_WIFI = "no_config_wifi";
/*    */   public static final String DISALLOW_INSTALL_APPS = "no_install_apps";
/*    */   public static final String DISALLOW_UNINSTALL_APPS = "no_uninstall_apps";
/*    */   public static final String DISALLOW_SHARE_LOCATION = "no_share_location";
/*    */   public static final String DISALLOW_INSTALL_UNKNOWN_SOURCES = "no_install_unknown_sources";
/*    */   public static final String DISALLOW_CONFIG_BLUETOOTH = "no_config_bluetooth";
/*    */   public static final String DISALLOW_USB_FILE_TRANSFER = "no_usb_file_transfer";
/*    */   public static final String DISALLOW_CONFIG_CREDENTIALS = "no_config_credentials";
/*    */   public static final String DISALLOW_REMOVE_USER = "no_remove_user";
/*    */ 
/*    */   UserManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String getUserName() { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isUserAGoat() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isUserRunning(UserHandle user) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isUserRunningOrStopping(UserHandle user) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Bundle getUserRestrictions() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Bundle getUserRestrictions(UserHandle userHandle) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setUserRestrictions(Bundle restrictions) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setUserRestrictions(Bundle restrictions, UserHandle userHandle) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setUserRestriction(String key, boolean value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getSerialNumberForUser(UserHandle user) { throw new RuntimeException("Stub!"); } 
/* 15 */   public UserHandle getUserForSerialNumber(long serialNumber) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getUserCount() { throw new RuntimeException("Stub!"); } 
/* 17 */   public Bundle getApplicationRestrictions(String packageName) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.UserManager
 * JD-Core Version:    0.6.2
 */