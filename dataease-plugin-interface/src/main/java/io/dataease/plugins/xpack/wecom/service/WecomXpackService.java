package io.dataease.plugins.xpack.wecom.service;

import io.dataease.plugins.common.service.PluginComponentService;
import io.dataease.plugins.xpack.display.dto.response.SysSettingDto;
import io.dataease.plugins.xpack.wecom.dto.response.WecomInfo;

import java.util.List;

public abstract class WecomXpackService extends PluginComponentService {

    public abstract WecomInfo info();

    public abstract void save(List<SysSettingDto> settings);

    public abstract void testConn(WecomInfo info) throws Exception;

    public abstract Boolean isOpen();

}
