package rules.Rules_Aneel;

import java.security.CodeSource;
import java.io.FilePermission;

public class SEC07<ApplyPermissions> {
  protected ApplyPermissions getPermissions(CodeSource cs) {
    ApplyPermissions appPerm = super.Permissions(cs);
    /**
     * By calling the super class in line 7, we ensure that the
     * proper security policies are followed. This will reduce the
     * chances of untrusted classes receiving elevated privileges
     */

    return appPerm;
  }

}
