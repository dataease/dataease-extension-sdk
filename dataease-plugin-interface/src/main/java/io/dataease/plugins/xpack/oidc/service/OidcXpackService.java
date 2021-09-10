package io.dataease.plugins.xpack.oidc.service;

import java.util.List;

import io.dataease.plugins.xpack.display.dto.response.SysSettingDto;

public abstract class OidcXpackService {

    public abstract List<SysSettingDto> oidcSettings();

    public abstract Boolean save(List<SysSettingDto> parameters);

    public Boolean isSuuportOIDC() {
        return false;
    }
    
}
