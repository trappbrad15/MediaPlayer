package java.security.acl;

import java.security.Principal;

public abstract interface Owner
{
  public abstract boolean addOwner(Principal paramPrincipal1, Principal paramPrincipal2)
    throws NotOwnerException;

  public abstract boolean deleteOwner(Principal paramPrincipal1, Principal paramPrincipal2)
    throws NotOwnerException, LastOwnerException;

  public abstract boolean isOwner(Principal paramPrincipal);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.acl.Owner
 * JD-Core Version:    0.6.2
 */