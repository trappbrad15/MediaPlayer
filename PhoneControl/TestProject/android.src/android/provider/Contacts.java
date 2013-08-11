/*     */ package android.provider;
/*     */ 
/*     */ import android.content.ContentResolver;
/*     */ import android.content.ContentValues;
/*     */ import android.content.Context;
/*     */ import android.database.Cursor;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.BitmapFactory.Options;
/*     */ import android.net.Uri;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ @Deprecated
/*     */ public class Contacts
/*     */ {
/*     */ 
/*     */   @Deprecated
/*     */   public static final String AUTHORITY = "contacts";
/*     */ 
/*     */   @Deprecated
/* 564 */   public static final Uri CONTENT_URI = null;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int KIND_EMAIL = 1;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int KIND_POSTAL = 2;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int KIND_IM = 3;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int KIND_ORGANIZATION = 4;
/*     */ 
/*     */   @Deprecated
/*     */   public static final int KIND_PHONE = 5;
/*     */ 
/*     */   Contacts()
/*     */   {
/* 549 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Intents
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
/*     */ 
/*     */     @Deprecated
/*     */     public Intents()
/*     */     {
/* 533 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class Insert
/*     */     {
/*     */ 
/*     */       @Deprecated
/*     */       public static final String ACTION = "android.intent.action.INSERT";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String FULL_MODE = "full_mode";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String NAME = "name";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String PHONETIC_NAME = "phonetic_name";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String COMPANY = "company";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String JOB_TITLE = "job_title";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String NOTES = "notes";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String PHONE = "phone";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String PHONE_TYPE = "phone_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String PHONE_ISPRIMARY = "phone_isprimary";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String SECONDARY_PHONE = "secondary_phone";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String SECONDARY_PHONE_TYPE = "secondary_phone_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String TERTIARY_PHONE = "tertiary_phone";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String EMAIL = "email";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String EMAIL_TYPE = "email_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String EMAIL_ISPRIMARY = "email_isprimary";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String SECONDARY_EMAIL = "secondary_email";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String SECONDARY_EMAIL_TYPE = "secondary_email_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String TERTIARY_EMAIL = "tertiary_email";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String POSTAL = "postal";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String POSTAL_TYPE = "postal_type";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String POSTAL_ISPRIMARY = "postal_isprimary";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String IM_HANDLE = "im_handle";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String IM_PROTOCOL = "im_protocol";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String IM_ISPRIMARY = "im_isprimary";
/*     */ 
/*     */       @Deprecated
/*     */       public Insert()
/*     */       {
/* 476 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class UI
/*     */     {
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_DEFAULT = "com.android.contacts.action.LIST_DEFAULT";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_GROUP_ACTION = "com.android.contacts.action.LIST_GROUP";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String GROUP_NAME_EXTRA_KEY = "com.android.contacts.extra.GROUP";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_ALL_CONTACTS_ACTION = "com.android.contacts.action.LIST_ALL_CONTACTS";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_CONTACTS_WITH_PHONES_ACTION = "com.android.contacts.action.LIST_CONTACTS_WITH_PHONES";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_STARRED_ACTION = "com.android.contacts.action.LIST_STARRED";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_FREQUENT_ACTION = "com.android.contacts.action.LIST_FREQUENT";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String LIST_STREQUENT_ACTION = "com.android.contacts.action.LIST_STREQUENT";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String TITLE_EXTRA_KEY = "com.android.contacts.extra.TITLE_EXTRA";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String FILTER_CONTACTS_ACTION = "com.android.contacts.action.FILTER_CONTACTS";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String FILTER_TEXT_EXTRA_KEY = "com.android.contacts.extra.FILTER_TEXT";
/*     */ 
/*     */       @Deprecated
/*     */       public UI()
/*     */       {
/* 448 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Extensions
/*     */     implements BaseColumns, Contacts.ExtensionsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 439 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact_extensions";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_extensions";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "person, name ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     Extensions()
/*     */     {
/* 428 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface ExtensionsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NAME = "name";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String VALUE = "value";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Photos
/*     */     implements BaseColumns, Contacts.PhotosColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 414 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_DIRECTORY = "photo";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "person ASC";
/*     */ 
/*     */     Photos()
/*     */     {
/* 407 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PhotosColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String LOCAL_VERSION = "local_version";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DOWNLOAD_REQUIRED = "download_required";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String EXISTS_ON_SERVER = "exists_on_server";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SYNC_ERROR = "sync_error";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DATA = "data";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Organizations
/*     */     implements BaseColumns, Contacts.OrganizationColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 385 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_DIRECTORY = "organizations";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "company, title, isprimary ASC";
/*     */ 
/*     */     Organizations()
/*     */     {
/* 376 */       throw new RuntimeException("Stub!"); } 
/* 378 */     @Deprecated
/*     */     public static final CharSequence getDisplayLabel(Context context, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface OrganizationColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String TYPE = "type";
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_CUSTOM = 0;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_WORK = 1;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_OTHER = 2;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String LABEL = "label";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String COMPANY = "company";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String TITLE = "title";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String ISPRIMARY = "isprimary";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PresenceColumns
/*     */   {
/*     */     public static final String PRIORITY = "priority";
/*     */     public static final String PRESENCE_STATUS = "mode";
/*     */     public static final int OFFLINE = 0;
/*     */     public static final int INVISIBLE = 1;
/*     */     public static final int AWAY = 2;
/*     */     public static final int IDLE = 3;
/*     */     public static final int DO_NOT_DISTURB = 4;
/*     */     public static final int AVAILABLE = 5;
/*     */     public static final String PRESENCE_CUSTOM_STATUS = "status";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String IM_PROTOCOL = "im_protocol";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String IM_HANDLE = "im_handle";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String IM_ACCOUNT = "im_account";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class ContactMethods
/*     */     implements BaseColumns, Contacts.ContactMethodsColumns, Contacts.PeopleColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String POSTAL_LOCATION_LATITUDE = "data";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String POSTAL_LOCATION_LONGITUDE = "aux_data";
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_AIM = 0;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_MSN = 1;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_YAHOO = 2;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_SKYPE = 3;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_QQ = 4;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_GOOGLE_TALK = 5;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_ICQ = 6;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int PROTOCOL_JABBER = 7;
/*     */ 
/*     */     @Deprecated
/* 329 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/* 329 */     public static final Uri CONTENT_EMAIL_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact-methods";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_EMAIL_TYPE = "vnd.android.cursor.dir/email";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_POSTAL_TYPE = "vnd.android.cursor.dir/postal-address";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_EMAIL_ITEM_TYPE = "vnd.android.cursor.item/email";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_POSTAL_ITEM_TYPE = "vnd.android.cursor.item/postal-address";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_IM_ITEM_TYPE = "vnd.android.cursor.item/jabber-im";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     ContactMethods()
/*     */     {
/* 278 */       throw new RuntimeException("Stub!"); } 
/* 280 */     @Deprecated
/*     */     public static String encodePredefinedImProtocol(int protocol) { throw new RuntimeException("Stub!"); } 
/* 282 */     @Deprecated
/*     */     public static String encodeCustomImProtocol(String protocolString) { throw new RuntimeException("Stub!"); } 
/* 284 */     @Deprecated
/*     */     public static Object decodeImProtocol(String encodedString) { throw new RuntimeException("Stub!"); } 
/* 286 */     @Deprecated
/*     */     public static final CharSequence getDisplayLabel(Context context, int kind, int type, CharSequence label) { throw new RuntimeException("Stub!"); } 
/* 288 */     @Deprecated
/*     */     public void addPostalLocation(Context context, long postalId, double latitude, double longitude) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface ContactMethodsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String KIND = "kind";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String TYPE = "type";
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_CUSTOM = 0;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_HOME = 1;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_WORK = 2;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_OTHER = 3;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String LABEL = "label";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DATA = "data";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String AUX_DATA = "aux_data";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String ISPRIMARY = "isprimary";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class GroupMembership
/*     */     implements BaseColumns, Contacts.GroupsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 248 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/* 248 */     public static final Uri RAW_CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_DIRECTORY = "groupmembership";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroupmembership";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroupmembership";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "group_id ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String GROUP_ID = "group_id";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String GROUP_SYNC_ID = "group_sync_id";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String GROUP_SYNC_ACCOUNT = "group_sync_account";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String GROUP_SYNC_ACCOUNT_TYPE = "group_sync_account_type";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     GroupMembership()
/*     */     {
/* 225 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Phones
/*     */     implements BaseColumns, Contacts.PhonesColumns, Contacts.PeopleColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 219 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/* 219 */     public static final Uri CONTENT_FILTER_URL = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/phone";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     Phones()
/*     */     {
/* 202 */       throw new RuntimeException("Stub!"); } 
/* 204 */     @Deprecated
/*     */     public static final CharSequence getDisplayLabel(Context context, int type, CharSequence label, CharSequence[] labelArray) { throw new RuntimeException("Stub!"); } 
/* 206 */     @Deprecated
/*     */     public static final CharSequence getDisplayLabel(Context context, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PhonesColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String TYPE = "type";
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_CUSTOM = 0;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_HOME = 1;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_MOBILE = 2;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_WORK = 3;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_FAX_WORK = 4;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_FAX_HOME = 5;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_PAGER = 6;
/*     */ 
/*     */     @Deprecated
/*     */     public static final int TYPE_OTHER = 7;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String LABEL = "label";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NUMBER = "number";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NUMBER_KEY = "number_key";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String ISPRIMARY = "isprimary";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Groups
/*     */     implements BaseColumns, Contacts.GroupsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 166 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/* 166 */     public static final Uri DELETED_CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroup";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroup";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String GROUP_ANDROID_STARRED = "Starred in Android";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String GROUP_MY_CONTACTS = "Contacts";
/*     */ 
/*     */     Groups()
/*     */     {
/* 151 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface GroupsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NAME = "name";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NOTES = "notes";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SYSTEM_ID = "system_id";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class People
/*     */     implements BaseColumns, Contacts.PeopleColumns, Contacts.PhonesColumns, Contacts.PresenceColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/* 133 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/* 133 */     public static final Uri CONTENT_FILTER_URI = null;
/*     */ 
/*     */     @Deprecated
/* 133 */     public static final Uri DELETED_CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/person";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/person";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PRIMARY_PHONE_ID = "primary_phone";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PRIMARY_EMAIL_ID = "primary_email";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PRIMARY_ORGANIZATION_ID = "primary_organization";
/*     */ 
/*     */     People()
/*     */     {
/*  96 */       throw new RuntimeException("Stub!"); } 
/*  98 */     @Deprecated
/*     */     public static void markAsContacted(ContentResolver resolver, long personId) { throw new RuntimeException("Stub!"); } 
/* 100 */     @Deprecated
/*     */     public static Uri addToMyContactsGroup(ContentResolver resolver, long personId) { throw new RuntimeException("Stub!"); } 
/* 102 */     @Deprecated
/*     */     public static Uri addToGroup(ContentResolver resolver, long personId, String groupName) { throw new RuntimeException("Stub!"); } 
/* 104 */     @Deprecated
/*     */     public static Uri addToGroup(ContentResolver resolver, long personId, long groupId) { throw new RuntimeException("Stub!"); } 
/* 106 */     @Deprecated
/*     */     public static Uri createPersonInMyContactsGroup(ContentResolver resolver, ContentValues values) { throw new RuntimeException("Stub!"); } 
/* 108 */     @Deprecated
/*     */     public static Cursor queryGroups(ContentResolver resolver, long person) { throw new RuntimeException("Stub!"); } 
/* 110 */     @Deprecated
/*     */     public static void setPhotoData(ContentResolver cr, Uri person, byte[] data) { throw new RuntimeException("Stub!"); } 
/* 112 */     @Deprecated
/*     */     public static InputStream openContactPhotoInputStream(ContentResolver cr, Uri person) { throw new RuntimeException("Stub!"); } 
/* 114 */     @Deprecated
/*     */     public static Bitmap loadContactPhoto(Context context, Uri person, int placeholderImageResource, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */     @Deprecated
/*     */     public static class Extensions
/*     */       implements BaseColumns, Contacts.ExtensionsColumns
/*     */     {
/*     */ 
/*     */       @Deprecated
/*     */       public static final String CONTENT_DIRECTORY = "extensions";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String PERSON_ID = "person";
/*     */ 
/*     */       Extensions()
/*     */       {
/*  88 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class ContactMethods
/*     */       implements BaseColumns, Contacts.ContactMethodsColumns, Contacts.PeopleColumns
/*     */     {
/*     */ 
/*     */       @Deprecated
/*     */       public static final String CONTENT_DIRECTORY = "contact_methods";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String DEFAULT_SORT_ORDER = "data ASC";
/*     */ 
/*     */       ContactMethods()
/*     */       {
/*  78 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class Phones
/*     */       implements BaseColumns, Contacts.PhonesColumns, Contacts.PeopleColumns
/*     */     {
/*     */ 
/*     */       @Deprecated
/*     */       public static final String CONTENT_DIRECTORY = "phones";
/*     */ 
/*     */       @Deprecated
/*     */       public static final String DEFAULT_SORT_ORDER = "number ASC";
/*     */ 
/*     */       Phones()
/*     */       {
/*  68 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PeopleColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NAME = "name";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PHONETIC_NAME = "phonetic_name";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DISPLAY_NAME = "display_name";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String NOTES = "notes";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String TIMES_CONTACTED = "times_contacted";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String LAST_TIME_CONTACTED = "last_time_contacted";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CUSTOM_RINGTONE = "custom_ringtone";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SEND_TO_VOICEMAIL = "send_to_voicemail";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String STARRED = "starred";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String PHOTO_VERSION = "photo_version";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Settings
/*     */     implements BaseColumns, Contacts.SettingsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*  34 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     @Deprecated
/*     */     public static final String CONTENT_DIRECTORY = "settings";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String DEFAULT_SORT_ORDER = "key ASC";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String SYNC_EVERYTHING = "syncEverything";
/*     */ 
/*     */     Settings()
/*     */     {
/*  21 */       throw new RuntimeException("Stub!"); } 
/*  23 */     @Deprecated
/*     */     public static String getSetting(ContentResolver cr, String account, String key) { throw new RuntimeException("Stub!"); } 
/*  25 */     @Deprecated
/*     */     public static void setSetting(ContentResolver cr, String account, String key, String value) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface SettingsColumns
/*     */   {
/*     */ 
/*     */     @Deprecated
/*     */     public static final String _SYNC_ACCOUNT = "_sync_account";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String _SYNC_ACCOUNT_TYPE = "_sync_account_type";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String KEY = "key";
/*     */ 
/*     */     @Deprecated
/*     */     public static final String VALUE = "value";
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.provider.Contacts
 * JD-Core Version:    0.6.2
 */