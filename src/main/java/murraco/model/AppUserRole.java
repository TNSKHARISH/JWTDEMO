package murraco.model;

import org.springframework.security.core.GrantedAuthority;

public enum AppUserRole implements GrantedAuthority {
  ROLE_EXTERNAL_VENDOR_GENERIC, ROLE_VDF_OPS_ADMIN;

  public String getAuthority() {
    return name();
  }

}
