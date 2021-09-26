package io.dataease.plugins.xpack.ldap.service;

import java.util.List;

import io.dataease.plugins.common.entity.XpackLdapUserEntity;
import io.dataease.plugins.xpack.display.dto.response.SysSettingDto;
import io.dataease.plugins.xpack.ldap.dto.request.LdapValidateRequest;
import io.dataease.plugins.xpack.ldap.dto.response.LdapInfo;
import io.dataease.plugins.common.service.PluginMenuService;
import io.dataease.plugins.xpack.ldap.dto.response.ValidateResult;

public abstract class LdapXpackService extends PluginMenuService{

    public abstract LdapInfo info();

    public abstract void save(List<SysSettingDto> settings);

    public abstract void testConn();

    public abstract void testLogin();

    public abstract Boolean isOpen();

    public abstract List<XpackLdapUserEntity> users();

    public abstract ValidateResult login(LdapValidateRequest request);
    
}
