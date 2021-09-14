package io.dataease.plugins.xpack.oidc.service;

import java.util.List;
import java.util.Map;

import io.dataease.plugins.xpack.display.dto.response.SysSettingDto;
import io.dataease.plugins.xpack.oidc.dto.SSOToken;
import io.dataease.plugins.xpack.oidc.dto.SSOUserInfo;

public abstract class OidcXpackService {

    public abstract List<SysSettingDto> oidcSettings();

    public abstract Boolean save(List<SysSettingDto> parameters);

    public Boolean isSuuportOIDC() {
        return false;
    }

    public abstract SSOToken requestSsoToken(String code, String state);

    public abstract SSOUserInfo requestUserInfo(Map<String, String> config, String accessToken);

    public abstract void logout(String idToken);

}
