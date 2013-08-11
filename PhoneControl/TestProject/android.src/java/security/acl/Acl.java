package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

public abstract interface Acl extends Owner
{
  public abstract void setName(Principal paramPrincipal, String paramString)
    throws NotOwnerException;

  public abstract String getName();

  public abstract boolean addEntry(Principal paramPrincipal, AclEntry paramAclEntry)
    throws NotOwnerException;

  public abstract boolean removeEntry(Principal paramPrincipal, AclEntry paramAclEntry)
    throws NotOwnerException;

  public abstract Enumeration<Permission> getPermissions(Principal paramPrincipal);

  public abstract Enumeration<AclEntry> entries();

  public abstract boolean checkPermission(Principal paramPrincipal, Permission paramPermission);

  public abstract String toString();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.acl.Acl
 * JD-Core Version:    0.6.2
 */