/*     */ package android.provider;
/*     */ 
/*     */ import android.accounts.Account;
/*     */ import android.content.ContentProviderClient;
/*     */ import android.content.ContentProviderOperation;
/*     */ import android.content.ContentResolver;
/*     */ import android.content.Context;
/*     */ import android.content.EntityIterator;
/*     */ import android.content.res.Resources;
/*     */ import android.database.Cursor;
/*     */ import android.graphics.Rect;
/*     */ import android.net.Uri;
/*     */ import android.os.RemoteException;
/*     */ import android.util.Pair;
/*     */ import android.view.View;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ public final class ContactsContract
/*     */ {
/*     */   public static final String AUTHORITY = "com.android.contacts";
/* 856 */   public static final Uri AUTHORITY_URI = null;
/*     */   public static final String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
/*     */   public static final String DIRECTORY_PARAM_KEY = "directory";
/*     */   public static final String LIMIT_PARAM_KEY = "limit";
/*     */   public static final String PRIMARY_ACCOUNT_NAME = "name_for_primary_account";
/*     */   public static final String PRIMARY_ACCOUNT_TYPE = "type_for_primary_account";
/*     */ 
/*     */   public ContactsContract()
/*     */   {
/* 847 */     throw new RuntimeException("Stub!"); } 
/* 848 */   public static boolean isProfileId(long id) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static final class Intents
/*     */   {
/*     */     public static final String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
/*     */     public static final String CONTACTS_DATABASE_CREATED = "android.provider.Contacts.DATABASE_CREATED";
/*     */     public static final String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
/*     */     public static final String INVITE_CONTACT = "com.android.contacts.action.INVITE_CONTACT";
/*     */     public static final String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
/*     */     public static final String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
/*     */     public static final String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
/*     */ 
/*     */     public Intents()
/*     */     {
/* 836 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class Insert
/*     */     {
/*     */       public static final String ACTION = "android.intent.action.INSERT";
/*     */       public static final String FULL_MODE = "full_mode";
/*     */       public static final String NAME = "name";
/*     */       public static final String PHONETIC_NAME = "phonetic_name";
/*     */       public static final String COMPANY = "company";
/*     */       public static final String JOB_TITLE = "job_title";
/*     */       public static final String NOTES = "notes";
/*     */       public static final String PHONE = "phone";
/*     */       public static final String PHONE_TYPE = "phone_type";
/*     */       public static final String PHONE_ISPRIMARY = "phone_isprimary";
/*     */       public static final String SECONDARY_PHONE = "secondary_phone";
/*     */       public static final String SECONDARY_PHONE_TYPE = "secondary_phone_type";
/*     */       public static final String TERTIARY_PHONE = "tertiary_phone";
/*     */       public static final String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
/*     */       public static final String EMAIL = "email";
/*     */       public static final String EMAIL_TYPE = "email_type";
/*     */       public static final String EMAIL_ISPRIMARY = "email_isprimary";
/*     */       public static final String SECONDARY_EMAIL = "secondary_email";
/*     */       public static final String SECONDARY_EMAIL_TYPE = "secondary_email_type";
/*     */       public static final String TERTIARY_EMAIL = "tertiary_email";
/*     */       public static final String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
/*     */       public static final String POSTAL = "postal";
/*     */       public static final String POSTAL_TYPE = "postal_type";
/*     */       public static final String POSTAL_ISPRIMARY = "postal_isprimary";
/*     */       public static final String IM_HANDLE = "im_handle";
/*     */       public static final String IM_PROTOCOL = "im_protocol";
/*     */       public static final String IM_ISPRIMARY = "im_isprimary";
/*     */       public static final String DATA = "data";
/*     */ 
/*     */       public Insert()
/*     */       {
/* 806 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class DisplayPhoto
/*     */   {
/* 800 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_MAX_DIMENSIONS_URI = null;
/*     */     public static final String DISPLAY_MAX_DIM = "display_max_dim";
/*     */     public static final String THUMBNAIL_MAX_DIM = "thumbnail_max_dim";
/*     */ 
/*     */     DisplayPhoto()
/*     */     {
/* 795 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class QuickContact
/*     */   {
/*     */     public static final int MODE_SMALL = 1;
/*     */     public static final int MODE_MEDIUM = 2;
/*     */     public static final int MODE_LARGE = 3;
/*     */ 
/*     */     public QuickContact()
/*     */     {
/* 786 */       throw new RuntimeException("Stub!"); } 
/* 787 */     public static void showQuickContact(Context context, View target, Uri lookupUri, int mode, String[] excludeMimes) { throw new RuntimeException("Stub!"); } 
/* 788 */     public static void showQuickContact(Context context, Rect target, Uri lookupUri, int mode, String[] excludeMimes) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static final class DataUsageFeedback
/*     */   {
/* 782 */     public static final Uri FEEDBACK_URI = null; public static final Uri DELETE_USAGE_URI = null;
/*     */     public static final String USAGE_TYPE = "type";
/*     */     public static final String USAGE_TYPE_CALL = "call";
/*     */     public static final String USAGE_TYPE_LONG_TEXT = "long_text";
/*     */     public static final String USAGE_TYPE_SHORT_TEXT = "short_text";
/*     */ 
/*     */     public DataUsageFeedback()
/*     */     {
/* 775 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Settings
/*     */     implements ContactsContract.SettingsColumns
/*     */   {
/* 771 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/setting";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting";
/*     */ 
/*     */     Settings()
/*     */     {
/* 767 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface SettingsColumns
/*     */   {
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String UNGROUPED_VISIBLE = "ungrouped_visible";
/*     */     public static final String ANY_UNSYNCED = "any_unsynced";
/*     */     public static final String UNGROUPED_COUNT = "summ_count";
/*     */     public static final String UNGROUPED_WITH_PHONES = "summ_phones";
/*     */   }
/*     */ 
/*     */   public static final class AggregationExceptions
/*     */     implements BaseColumns
/*     */   {
/* 751 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";
/*     */     public static final String TYPE = "type";
/*     */     public static final int TYPE_AUTOMATIC = 0;
/*     */     public static final int TYPE_KEEP_TOGETHER = 1;
/*     */     public static final int TYPE_KEEP_SEPARATE = 2;
/*     */     public static final String RAW_CONTACT_ID1 = "raw_contact_id1";
/*     */     public static final String RAW_CONTACT_ID2 = "raw_contact_id2";
/*     */ 
/*     */     AggregationExceptions()
/*     */     {
/* 741 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Groups
/*     */     implements BaseColumns, ContactsContract.GroupsColumns, ContactsContract.SyncColumns
/*     */   {
/* 736 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_SUMMARY_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/group";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group";
/*     */ 
/*     */     Groups()
/*     */     {
/* 730 */       throw new RuntimeException("Stub!"); } 
/* 731 */     public static EntityIterator newEntityIterator(Cursor cursor) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   protected static abstract interface GroupsColumns
/*     */   {
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String TITLE = "title";
/*     */     public static final String NOTES = "notes";
/*     */     public static final String SYSTEM_ID = "system_id";
/*     */     public static final String SUMMARY_COUNT = "summ_count";
/*     */     public static final String SUMMARY_WITH_PHONES = "summ_phones";
/*     */     public static final String GROUP_VISIBLE = "group_visible";
/*     */     public static final String DELETED = "deleted";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String AUTO_ADD = "auto_add";
/*     */     public static final String FAVORITES = "favorites";
/*     */     public static final String GROUP_IS_READ_ONLY = "group_is_read_only";
/*     */   }
/*     */ 
/*     */   public static final class CommonDataKinds
/*     */   {
/*     */     CommonDataKinds()
/*     */     {
/* 710 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class Contactables
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/* 708 */       public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */       public static final String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
/*     */ 
/*     */       public Contactables()
/*     */       {
/* 704 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Identity
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/identity";
/*     */       public static final String IDENTITY = "data1";
/*     */       public static final String NAMESPACE = "data2";
/*     */ 
/*     */       Identity()
/*     */       {
/* 696 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class SipAddress
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sip_address";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final String SIP_ADDRESS = "data1";
/*     */ 
/*     */       SipAddress()
/*     */       {
/* 684 */         throw new RuntimeException("Stub!"); } 
/* 685 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 686 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Website
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";
/*     */       public static final int TYPE_HOMEPAGE = 1;
/*     */       public static final int TYPE_BLOG = 2;
/*     */       public static final int TYPE_PROFILE = 3;
/*     */       public static final int TYPE_HOME = 4;
/*     */       public static final int TYPE_WORK = 5;
/*     */       public static final int TYPE_FTP = 6;
/*     */       public static final int TYPE_OTHER = 7;
/*     */       public static final String URL = "data1";
/*     */ 
/*     */       Website()
/*     */       {
/* 670 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class GroupMembership
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";
/*     */       public static final String GROUP_ROW_ID = "data1";
/*     */       public static final String GROUP_SOURCE_ID = "group_sourceid";
/*     */ 
/*     */       GroupMembership()
/*     */       {
/* 662 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Note
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";
/*     */       public static final String NOTE = "data1";
/*     */ 
/*     */       Note()
/*     */       {
/* 655 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Photo
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";
/*     */       public static final String PHOTO_FILE_ID = "data14";
/*     */       public static final String PHOTO = "data15";
/*     */ 
/*     */       Photo()
/*     */       {
/* 647 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Event
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";
/*     */       public static final int TYPE_ANNIVERSARY = 1;
/*     */       public static final int TYPE_OTHER = 2;
/*     */       public static final int TYPE_BIRTHDAY = 3;
/*     */       public static final String START_DATE = "data1";
/*     */ 
/*     */       Event()
/*     */       {
/* 636 */         throw new RuntimeException("Stub!"); } 
/* 637 */       public static int getTypeResource(Integer type) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Relation
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";
/*     */       public static final int TYPE_ASSISTANT = 1;
/*     */       public static final int TYPE_BROTHER = 2;
/*     */       public static final int TYPE_CHILD = 3;
/*     */       public static final int TYPE_DOMESTIC_PARTNER = 4;
/*     */       public static final int TYPE_FATHER = 5;
/*     */       public static final int TYPE_FRIEND = 6;
/*     */       public static final int TYPE_MANAGER = 7;
/*     */       public static final int TYPE_MOTHER = 8;
/*     */       public static final int TYPE_PARENT = 9;
/*     */       public static final int TYPE_PARTNER = 10;
/*     */       public static final int TYPE_REFERRED_BY = 11;
/*     */       public static final int TYPE_RELATIVE = 12;
/*     */       public static final int TYPE_SISTER = 13;
/*     */       public static final int TYPE_SPOUSE = 14;
/*     */       public static final String NAME = "data1";
/*     */ 
/*     */       Relation()
/*     */       {
/* 613 */         throw new RuntimeException("Stub!"); } 
/* 614 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 615 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Organization
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";
/*     */       public static final int TYPE_WORK = 1;
/*     */       public static final int TYPE_OTHER = 2;
/*     */       public static final String COMPANY = "data1";
/*     */       public static final String TITLE = "data4";
/*     */       public static final String DEPARTMENT = "data5";
/*     */       public static final String JOB_DESCRIPTION = "data6";
/*     */       public static final String SYMBOL = "data7";
/*     */       public static final String PHONETIC_NAME = "data8";
/*     */       public static final String OFFICE_LOCATION = "data9";
/*     */ 
/*     */       Organization()
/*     */       {
/* 596 */         throw new RuntimeException("Stub!"); } 
/* 597 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 598 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Im
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final String PROTOCOL = "data5";
/*     */       public static final String CUSTOM_PROTOCOL = "data6";
/*     */       public static final int PROTOCOL_CUSTOM = -1;
/*     */       public static final int PROTOCOL_AIM = 0;
/*     */       public static final int PROTOCOL_MSN = 1;
/*     */       public static final int PROTOCOL_YAHOO = 2;
/*     */       public static final int PROTOCOL_SKYPE = 3;
/*     */       public static final int PROTOCOL_QQ = 4;
/*     */       public static final int PROTOCOL_GOOGLE_TALK = 5;
/*     */       public static final int PROTOCOL_ICQ = 6;
/*     */       public static final int PROTOCOL_JABBER = 7;
/*     */       public static final int PROTOCOL_NETMEETING = 8;
/*     */ 
/*     */       Im()
/*     */       {
/* 571 */         throw new RuntimeException("Stub!"); } 
/* 572 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 573 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); } 
/* 574 */       public static final int getProtocolLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 575 */       public static final CharSequence getProtocolLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class StructuredPostal
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";
/* 566 */       public static final Uri CONTENT_URI = null;
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final String FORMATTED_ADDRESS = "data1";
/*     */       public static final String STREET = "data4";
/*     */       public static final String POBOX = "data5";
/*     */       public static final String NEIGHBORHOOD = "data6";
/*     */       public static final String CITY = "data7";
/*     */       public static final String REGION = "data8";
/*     */       public static final String POSTCODE = "data9";
/*     */       public static final String COUNTRY = "data10";
/*     */ 
/*     */       StructuredPostal()
/*     */       {
/* 549 */         throw new RuntimeException("Stub!"); } 
/* 550 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 551 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Email
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2";
/* 544 */       public static final Uri CONTENT_URI = null; public static final Uri CONTENT_LOOKUP_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */       public static final String ADDRESS = "data1";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final int TYPE_MOBILE = 4;
/*     */       public static final String DISPLAY_NAME = "data4";
/*     */ 
/*     */       Email()
/*     */       {
/* 530 */         throw new RuntimeException("Stub!"); } 
/* 531 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 532 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Phone
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2";
/* 525 */       public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */       public static final String SEARCH_DISPLAY_NAME_KEY = "search_display_name";
/*     */       public static final String SEARCH_PHONE_NUMBER_KEY = "search_phone_number";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_MOBILE = 2;
/*     */       public static final int TYPE_WORK = 3;
/*     */       public static final int TYPE_FAX_WORK = 4;
/*     */       public static final int TYPE_FAX_HOME = 5;
/*     */       public static final int TYPE_PAGER = 6;
/*     */       public static final int TYPE_OTHER = 7;
/*     */       public static final int TYPE_CALLBACK = 8;
/*     */       public static final int TYPE_CAR = 9;
/*     */       public static final int TYPE_COMPANY_MAIN = 10;
/*     */       public static final int TYPE_ISDN = 11;
/*     */       public static final int TYPE_MAIN = 12;
/*     */       public static final int TYPE_OTHER_FAX = 13;
/*     */       public static final int TYPE_RADIO = 14;
/*     */       public static final int TYPE_TELEX = 15;
/*     */       public static final int TYPE_TTY_TDD = 16;
/*     */       public static final int TYPE_WORK_MOBILE = 17;
/*     */       public static final int TYPE_WORK_PAGER = 18;
/*     */       public static final int TYPE_ASSISTANT = 19;
/*     */       public static final int TYPE_MMS = 20;
/*     */       public static final String NUMBER = "data1";
/*     */       public static final String NORMALIZED_NUMBER = "data4";
/*     */ 
/*     */       Phone()
/*     */       {
/* 494 */         throw new RuntimeException("Stub!"); } 
/* 495 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 496 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */     }
/*     */ 
/*     */     public static final class Nickname
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";
/*     */       public static final int TYPE_DEFAULT = 1;
/*     */       public static final int TYPE_OTHER_NAME = 2;
/*     */       public static final int TYPE_MAIDEN_NAME = 3;
/*     */ 
/*     */       @Deprecated
/*     */       public static final int TYPE_MAINDEN_NAME = 3;
/*     */       public static final int TYPE_SHORT_NAME = 4;
/*     */       public static final int TYPE_INITIALS = 5;
/*     */       public static final String NAME = "data1";
/*     */ 
/*     */       Nickname()
/*     */       {
/* 480 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class StructuredName
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";
/*     */       public static final String DISPLAY_NAME = "data1";
/*     */       public static final String GIVEN_NAME = "data2";
/*     */       public static final String FAMILY_NAME = "data3";
/*     */       public static final String PREFIX = "data4";
/*     */       public static final String MIDDLE_NAME = "data5";
/*     */       public static final String SUFFIX = "data6";
/*     */       public static final String PHONETIC_GIVEN_NAME = "data7";
/*     */       public static final String PHONETIC_MIDDLE_NAME = "data8";
/*     */       public static final String PHONETIC_FAMILY_NAME = "data9";
/*     */ 
/*     */       StructuredName()
/*     */       {
/* 465 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     protected static abstract interface CommonColumns extends ContactsContract.CommonDataKinds.BaseTypes
/*     */     {
/*     */       public static final String DATA = "data1";
/*     */       public static final String TYPE = "data2";
/*     */       public static final String LABEL = "data3";
/*     */     }
/*     */ 
/*     */     public static abstract interface BaseTypes
/*     */     {
/*     */       public static final int TYPE_CUSTOM = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Presence extends ContactsContract.StatusUpdates
/*     */   {
/*     */     public Presence()
/*     */     {
/* 447 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class StatusUpdates
/*     */     implements ContactsContract.StatusColumns, ContactsContract.PresenceColumns
/*     */   {
/* 441 */     public static final Uri CONTENT_URI = null; public static final Uri PROFILE_CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";
/*     */ 
/*     */     StatusUpdates()
/*     */     {
/* 434 */       throw new RuntimeException("Stub!"); } 
/* 435 */     public static final int getPresenceIconResourceId(int status) { throw new RuntimeException("Stub!"); } 
/* 436 */     public static final int getPresencePrecedence(int status) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   protected static abstract interface PresenceColumns
/*     */   {
/*     */     public static final String DATA_ID = "presence_data_id";
/*     */     public static final String PROTOCOL = "protocol";
/*     */     public static final String CUSTOM_PROTOCOL = "custom_protocol";
/*     */     public static final String IM_HANDLE = "im_handle";
/*     */     public static final String IM_ACCOUNT = "im_account";
/*     */   }
/*     */ 
/*     */   public static final class PhoneLookup
/*     */     implements BaseColumns, ContactsContract.PhoneLookupColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns
/*     */   {
/* 421 */     public static final Uri CONTENT_FILTER_URI = null;
/*     */ 
/*     */     PhoneLookup()
/*     */     {
/* 419 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface PhoneLookupColumns
/*     */   {
/*     */     public static final String NUMBER = "number";
/*     */     public static final String TYPE = "type";
/*     */     public static final String LABEL = "label";
/*     */     public static final String NORMALIZED_NUMBER = "normalized_number";
/*     */   }
/*     */ 
/*     */   public static final class RawContactsEntity
/*     */     implements BaseColumns, ContactsContract.DataColumns, ContactsContract.RawContactsColumns
/*     */   {
/* 407 */     public static final Uri CONTENT_URI = null; public static final Uri PROFILE_CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";
/*     */     public static final String DATA_ID = "data_id";
/*     */ 
/*     */     RawContactsEntity()
/*     */     {
/* 402 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Data
/*     */     implements ContactsContract.DataColumnsWithJoins
/*     */   {
/* 397 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/data";
/*     */ 
/*     */     Data()
/*     */     {
/* 392 */       throw new RuntimeException("Stub!"); } 
/* 393 */     public static Uri getContactLookupUri(ContentResolver resolver, Uri dataUri) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   protected static abstract interface DataColumnsWithJoins extends BaseColumns, ContactsContract.DataColumns, ContactsContract.StatusColumns, ContactsContract.RawContactsColumns, ContactsContract.ContactsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, ContactsContract.DataUsageStatColumns
/*     */   {
/*     */   }
/*     */ 
/*     */   protected static abstract interface DataUsageStatColumns
/*     */   {
/*     */     public static final String LAST_TIME_USED = "last_time_used";
/*     */     public static final String TIMES_USED = "times_used";
/*     */   }
/*     */ 
/*     */   protected static abstract interface DataColumns
/*     */   {
/*     */     public static final String MIMETYPE = "mimetype";
/*     */     public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */     public static final String IS_PRIMARY = "is_primary";
/*     */     public static final String IS_SUPER_PRIMARY = "is_super_primary";
/*     */     public static final String IS_READ_ONLY = "is_read_only";
/*     */     public static final String DATA_VERSION = "data_version";
/*     */     public static final String DATA1 = "data1";
/*     */     public static final String DATA2 = "data2";
/*     */     public static final String DATA3 = "data3";
/*     */     public static final String DATA4 = "data4";
/*     */     public static final String DATA5 = "data5";
/*     */     public static final String DATA6 = "data6";
/*     */     public static final String DATA7 = "data7";
/*     */     public static final String DATA8 = "data8";
/*     */     public static final String DATA9 = "data9";
/*     */     public static final String DATA10 = "data10";
/*     */     public static final String DATA11 = "data11";
/*     */     public static final String DATA12 = "data12";
/*     */     public static final String DATA13 = "data13";
/*     */     public static final String DATA14 = "data14";
/*     */     public static final String DATA15 = "data15";
/*     */     public static final String SYNC1 = "data_sync1";
/*     */     public static final String SYNC2 = "data_sync2";
/*     */     public static final String SYNC3 = "data_sync3";
/*     */     public static final String SYNC4 = "data_sync4";
/*     */   }
/*     */ 
/*     */   protected static abstract interface StreamItemPhotosColumns
/*     */   {
/*     */     public static final String STREAM_ITEM_ID = "stream_item_id";
/*     */     public static final String SORT_INDEX = "sort_index";
/*     */     public static final String PHOTO_FILE_ID = "photo_file_id";
/*     */     public static final String PHOTO_URI = "photo_uri";
/*     */     public static final String SYNC1 = "stream_item_photo_sync1";
/*     */     public static final String SYNC2 = "stream_item_photo_sync2";
/*     */     public static final String SYNC3 = "stream_item_photo_sync3";
/*     */     public static final String SYNC4 = "stream_item_photo_sync4";
/*     */   }
/*     */ 
/*     */   public static final class StreamItemPhotos
/*     */     implements BaseColumns, ContactsContract.StreamItemPhotosColumns
/*     */   {
/*     */     public static final String PHOTO = "photo";
/*     */ 
/*     */     StreamItemPhotos()
/*     */     {
/* 338 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface StreamItemsColumns
/*     */   {
/*     */     public static final String CONTACT_ID = "contact_id";
/*     */     public static final String CONTACT_LOOKUP_KEY = "contact_lookup";
/*     */     public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */     public static final String RES_PACKAGE = "res_package";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String RAW_CONTACT_SOURCE_ID = "raw_contact_source_id";
/*     */     public static final String RES_ICON = "icon";
/*     */     public static final String RES_LABEL = "label";
/*     */     public static final String TEXT = "text";
/*     */     public static final String TIMESTAMP = "timestamp";
/*     */     public static final String COMMENTS = "comments";
/*     */     public static final String SYNC1 = "stream_item_sync1";
/*     */     public static final String SYNC2 = "stream_item_sync2";
/*     */     public static final String SYNC3 = "stream_item_sync3";
/*     */     public static final String SYNC4 = "stream_item_sync4";
/*     */   }
/*     */ 
/*     */   public static final class StreamItems
/*     */     implements BaseColumns, ContactsContract.StreamItemsColumns
/*     */   {
/* 313 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_PHOTO_URI = null; public static final Uri CONTENT_LIMIT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/stream_item";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/stream_item";
/*     */     public static final String MAX_ITEMS = "max_items";
/*     */ 
/*     */     StreamItems()
/*     */     {
/* 306 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class StreamItemPhotos
/*     */       implements BaseColumns, ContactsContract.StreamItemPhotosColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "photo";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/stream_item_photo";
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/stream_item_photo";
/*     */ 
/*     */       StreamItemPhotos()
/*     */       {
/* 301 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface StatusColumns
/*     */   {
/*     */     public static final String PRESENCE = "mode";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PRESENCE_STATUS = "mode";
/*     */     public static final int OFFLINE = 0;
/*     */     public static final int INVISIBLE = 1;
/*     */     public static final int AWAY = 2;
/*     */     public static final int IDLE = 3;
/*     */     public static final int DO_NOT_DISTURB = 4;
/*     */     public static final int AVAILABLE = 5;
/*     */     public static final String STATUS = "status";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PRESENCE_CUSTOM_STATUS = "status";
/*     */     public static final String STATUS_TIMESTAMP = "status_ts";
/*     */     public static final String STATUS_RES_PACKAGE = "status_res_package";
/*     */     public static final String STATUS_LABEL = "status_label";
/*     */     public static final String STATUS_ICON = "status_icon";
/*     */     public static final String CHAT_CAPABILITY = "chat_capability";
/*     */     public static final int CAPABILITY_HAS_VOICE = 1;
/*     */     public static final int CAPABILITY_HAS_VIDEO = 2;
/*     */     public static final int CAPABILITY_HAS_CAMERA = 4;
/*     */   }
/*     */ 
/*     */   public static final class RawContacts
/*     */     implements BaseColumns, ContactsContract.RawContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.SyncColumns
/*     */   {
/* 270 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact";
/*     */     public static final int AGGREGATION_MODE_DEFAULT = 0;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int AGGREGATION_MODE_IMMEDIATE = 1;
/*     */     public static final int AGGREGATION_MODE_SUSPENDED = 2;
/*     */     public static final int AGGREGATION_MODE_DISABLED = 3;
/*     */ 
/*     */     RawContacts()
/*     */     {
/* 259 */       throw new RuntimeException("Stub!"); } 
/* 260 */     public static Uri getContactLookupUri(ContentResolver resolver, Uri rawContactUri) { throw new RuntimeException("Stub!"); } 
/* 261 */     public static EntityIterator newEntityIterator(Cursor cursor) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */     public static final class DisplayPhoto
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "display_photo";
/*     */ 
/*     */       DisplayPhoto()
/*     */       {
/* 256 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class StreamItems
/*     */       implements BaseColumns, ContactsContract.StreamItemsColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "stream_items";
/*     */ 
/*     */       StreamItems()
/*     */       {
/* 251 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Entity
/*     */       implements BaseColumns, ContactsContract.DataColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "entity";
/*     */       public static final String DATA_ID = "data_id";
/*     */ 
/*     */       Entity()
/*     */       {
/* 244 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Data
/*     */       implements BaseColumns, ContactsContract.DataColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "data";
/*     */ 
/*     */       Data()
/*     */       {
/* 238 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface RawContactsColumns
/*     */   {
/*     */     public static final String CONTACT_ID = "contact_id";
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String AGGREGATION_MODE = "aggregation_mode";
/*     */     public static final String DELETED = "deleted";
/*     */     public static final String RAW_CONTACT_IS_READ_ONLY = "raw_contact_is_read_only";
/*     */     public static final String RAW_CONTACT_IS_USER_PROFILE = "raw_contact_is_user_profile";
/*     */   }
/*     */ 
/*     */   public static final class DeletedContacts
/*     */     implements ContactsContract.DeletedContactsColumns
/*     */   {
/* 221 */     public static final Uri CONTENT_URI = null;
/*     */     public static final long DAYS_KEPT_MILLISECONDS = 2592000000L;
/*     */ 
/*     */     DeletedContacts()
/*     */     {
/* 218 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface DeletedContactsColumns
/*     */   {
/*     */     public static final String CONTACT_ID = "contact_id";
/*     */     public static final String CONTACT_DELETED_TIMESTAMP = "contact_deleted_timestamp";
/*     */   }
/*     */ 
/*     */   public static final class Profile
/*     */     implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactStatusColumns
/*     */   {
/* 208 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_VCARD_URI = null; public static final Uri CONTENT_RAW_CONTACTS_URI = null;
/*     */     public static final long MIN_ID = 9223372034707292160L;
/*     */ 
/*     */     Profile()
/*     */     {
/* 203 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class Contacts
/*     */     implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactStatusColumns
/*     */   {
/* 198 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_LOOKUP_URI = null; public static final Uri CONTENT_VCARD_URI = null; public static final Uri CONTENT_FILTER_URI = null; public static final Uri CONTENT_STREQUENT_URI = null; public static final Uri CONTENT_STREQUENT_FILTER_URI = null; public static final Uri CONTENT_GROUP_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact";
/*     */     public static final String CONTENT_VCARD_TYPE = "text/x-vcard";
/*     */ 
/*     */     Contacts()
/*     */     {
/* 180 */       throw new RuntimeException("Stub!"); } 
/* 181 */     public static Uri getLookupUri(ContentResolver resolver, Uri contactUri) { throw new RuntimeException("Stub!"); } 
/* 182 */     public static Uri getLookupUri(long contactId, String lookupKey) { throw new RuntimeException("Stub!"); } 
/* 183 */     public static Uri lookupContact(ContentResolver resolver, Uri lookupUri) { throw new RuntimeException("Stub!"); } 
/* 185 */     @Deprecated
/*     */     public static void markAsContacted(ContentResolver resolver, long contactId) { throw new RuntimeException("Stub!"); } 
/* 186 */     public static InputStream openContactPhotoInputStream(ContentResolver cr, Uri contactUri, boolean preferHighres) { throw new RuntimeException("Stub!"); } 
/* 187 */     public static InputStream openContactPhotoInputStream(ContentResolver cr, Uri contactUri) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */     public static final class Photo
/*     */       implements BaseColumns, ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "photo";
/*     */       public static final String DISPLAY_PHOTO = "display_photo";
/*     */       public static final String PHOTO_FILE_ID = "data14";
/*     */       public static final String PHOTO = "data15";
/*     */ 
/*     */       Photo()
/*     */       {
/* 174 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class AggregationSuggestions
/*     */       implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "suggestions";
/*     */ 
/*     */       AggregationSuggestions()
/*     */       {
/* 168 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class StreamItems
/*     */       implements ContactsContract.StreamItemsColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "stream_items";
/*     */ 
/*     */       StreamItems()
/*     */       {
/* 162 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Entity
/*     */       implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactNameColumns, ContactsContract.RawContactsColumns, ContactsContract.BaseSyncColumns, ContactsContract.SyncColumns, ContactsContract.DataColumns, ContactsContract.StatusColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "entities";
/*     */       public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */       public static final String DATA_ID = "data_id";
/*     */ 
/*     */       Entity()
/*     */       {
/* 154 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Data
/*     */       implements BaseColumns, ContactsContract.DataColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "data";
/*     */ 
/*     */       Data()
/*     */       {
/* 148 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactNameColumns
/*     */   {
/*     */     public static final String DISPLAY_NAME_SOURCE = "display_name_source";
/*     */     public static final String DISPLAY_NAME_PRIMARY = "display_name";
/*     */     public static final String DISPLAY_NAME_ALTERNATIVE = "display_name_alt";
/*     */     public static final String PHONETIC_NAME_STYLE = "phonetic_name_style";
/*     */     public static final String PHONETIC_NAME = "phonetic_name";
/*     */     public static final String SORT_KEY_PRIMARY = "sort_key";
/*     */     public static final String SORT_KEY_ALTERNATIVE = "sort_key_alt";
/*     */   }
/*     */ 
/*     */   public static abstract interface DisplayNameSources
/*     */   {
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int EMAIL = 10;
/*     */     public static final int PHONE = 20;
/*     */     public static final int ORGANIZATION = 30;
/*     */     public static final int NICKNAME = 35;
/*     */     public static final int STRUCTURED_NAME = 40;
/*     */   }
/*     */ 
/*     */   public static abstract interface PhoneticNameStyle
/*     */   {
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int PINYIN = 3;
/*     */     public static final int JAPANESE = 4;
/*     */     public static final int KOREAN = 5;
/*     */   }
/*     */ 
/*     */   public static abstract interface FullNameStyle
/*     */   {
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int WESTERN = 1;
/*     */     public static final int CJK = 2;
/*     */     public static final int CHINESE = 3;
/*     */     public static final int JAPANESE = 4;
/*     */     public static final int KOREAN = 5;
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactStatusColumns
/*     */   {
/*     */     public static final String CONTACT_PRESENCE = "contact_presence";
/*     */     public static final String CONTACT_CHAT_CAPABILITY = "contact_chat_capability";
/*     */     public static final String CONTACT_STATUS = "contact_status";
/*     */     public static final String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";
/*     */     public static final String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";
/*     */     public static final String CONTACT_STATUS_LABEL = "contact_status_label";
/*     */     public static final String CONTACT_STATUS_ICON = "contact_status_icon";
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactsColumns
/*     */   {
/*     */     public static final String DISPLAY_NAME = "display_name";
/*     */     public static final String PHOTO_ID = "photo_id";
/*     */     public static final String PHOTO_FILE_ID = "photo_file_id";
/*     */     public static final String PHOTO_URI = "photo_uri";
/*     */     public static final String PHOTO_THUMBNAIL_URI = "photo_thumb_uri";
/*     */     public static final String IN_VISIBLE_GROUP = "in_visible_group";
/*     */     public static final String IS_USER_PROFILE = "is_user_profile";
/*     */     public static final String HAS_PHONE_NUMBER = "has_phone_number";
/*     */     public static final String LOOKUP_KEY = "lookup";
/*     */     public static final String CONTACT_LAST_UPDATED_TIMESTAMP = "contact_last_updated_timestamp";
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactOptionsColumns
/*     */   {
/*     */     public static final String TIMES_CONTACTED = "times_contacted";
/*     */     public static final String LAST_TIME_CONTACTED = "last_time_contacted";
/*     */     public static final String STARRED = "starred";
/*     */     public static final String CUSTOM_RINGTONE = "custom_ringtone";
/*     */     public static final String SEND_TO_VOICEMAIL = "send_to_voicemail";
/*     */   }
/*     */ 
/*     */   protected static abstract interface SyncColumns extends ContactsContract.BaseSyncColumns
/*     */   {
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String SOURCE_ID = "sourceid";
/*     */     public static final String VERSION = "version";
/*     */     public static final String DIRTY = "dirty";
/*     */   }
/*     */ 
/*     */   protected static abstract interface BaseSyncColumns
/*     */   {
/*     */     public static final String SYNC1 = "sync1";
/*     */     public static final String SYNC2 = "sync2";
/*     */     public static final String SYNC3 = "sync3";
/*     */     public static final String SYNC4 = "sync4";
/*     */   }
/*     */ 
/*     */   public static final class ProfileSyncState
/*     */     implements SyncStateContract.Columns
/*     */   {
/*     */     public static final String CONTENT_DIRECTORY = "syncstate";
/*  58 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     ProfileSyncState()
/*     */     {
/*  51 */       throw new RuntimeException("Stub!"); } 
/*  52 */     public static byte[] get(ContentProviderClient provider, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  53 */     public static Pair<Uri, byte[]> getWithUri(ContentProviderClient provider, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  54 */     public static void set(ContentProviderClient provider, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  55 */     public static ContentProviderOperation newSetOperation(Account account, byte[] data) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static final class SyncState
/*     */     implements SyncStateContract.Columns
/*     */   {
/*     */     public static final String CONTENT_DIRECTORY = "syncstate";
/*  46 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     SyncState()
/*     */     {
/*  39 */       throw new RuntimeException("Stub!"); } 
/*  40 */     public static byte[] get(ContentProviderClient provider, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  41 */     public static Pair<Uri, byte[]> getWithUri(ContentProviderClient provider, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  42 */     public static void set(ContentProviderClient provider, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  43 */     public static ContentProviderOperation newSetOperation(Account account, byte[] data) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static final class Directory
/*     */     implements BaseColumns
/*     */   {
/*  34 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact_directories";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_directory";
/*     */     public static final long DEFAULT = 0L;
/*     */     public static final long LOCAL_INVISIBLE = 1L;
/*     */     public static final String PACKAGE_NAME = "packageName";
/*     */     public static final String TYPE_RESOURCE_ID = "typeResourceId";
/*     */     public static final String DISPLAY_NAME = "displayName";
/*     */     public static final String DIRECTORY_AUTHORITY = "authority";
/*     */     public static final String ACCOUNT_TYPE = "accountType";
/*     */     public static final String ACCOUNT_NAME = "accountName";
/*     */     public static final String EXPORT_SUPPORT = "exportSupport";
/*     */     public static final int EXPORT_SUPPORT_NONE = 0;
/*     */     public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = 1;
/*     */     public static final int EXPORT_SUPPORT_ANY_ACCOUNT = 2;
/*     */     public static final String SHORTCUT_SUPPORT = "shortcutSupport";
/*     */     public static final int SHORTCUT_SUPPORT_NONE = 0;
/*     */     public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = 1;
/*     */     public static final int SHORTCUT_SUPPORT_FULL = 2;
/*     */     public static final String PHOTO_SUPPORT = "photoSupport";
/*     */     public static final int PHOTO_SUPPORT_NONE = 0;
/*     */     public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = 1;
/*     */     public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = 2;
/*     */     public static final int PHOTO_SUPPORT_FULL = 3;
/*     */ 
/*     */     Directory()
/*     */     {
/*   8 */       throw new RuntimeException("Stub!"); } 
/*   9 */     public static void notifyDirectoryChange(ContentResolver resolver) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.provider.ContactsContract
 * JD-Core Version:    0.6.2
 */