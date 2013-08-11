package android.os;

import java.io.FileDescriptor;

public abstract interface IBinder
{
  public static final int FIRST_CALL_TRANSACTION = 1;
  public static final int LAST_CALL_TRANSACTION = 16777215;
  public static final int PING_TRANSACTION = 1599098439;
  public static final int DUMP_TRANSACTION = 1598311760;
  public static final int INTERFACE_TRANSACTION = 1598968902;
  public static final int TWEET_TRANSACTION = 1599362900;
  public static final int LIKE_TRANSACTION = 1598835019;
  public static final int FLAG_ONEWAY = 1;

  public abstract String getInterfaceDescriptor()
    throws RemoteException;

  public abstract boolean pingBinder();

  public abstract boolean isBinderAlive();

  public abstract IInterface queryLocalInterface(String paramString);

  public abstract void dump(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void dumpAsync(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
    throws RemoteException;

  public abstract boolean transact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException;

  public abstract void linkToDeath(DeathRecipient paramDeathRecipient, int paramInt)
    throws RemoteException;

  public abstract boolean unlinkToDeath(DeathRecipient paramDeathRecipient, int paramInt);

  public static abstract interface DeathRecipient
  {
    public abstract void binderDied();
  }
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.IBinder
 * JD-Core Version:    0.6.2
 */