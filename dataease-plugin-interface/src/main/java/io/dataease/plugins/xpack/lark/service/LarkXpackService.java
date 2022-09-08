package io.dataease.plugins.xpack.lark.service;

import io.dataease.plugins.common.service.PluginComponentService;
import io.dataease.plugins.xpack.display.dto.response.SysSettingDto;
import io.dataease.plugins.xpack.lark.dto.entity.LarkQrResult;
import io.dataease.plugins.xpack.lark.dto.entity.LarkUserInfo;
import io.dataease.plugins.xpack.lark.dto.response.LarkInfo;


import java.io.File;
import java.util.List;

public abstract class LarkXpackService extends PluginComponentService {

    public abstract LarkInfo info();

    public abstract void save(List<SysSettingDto> settings);

    public abstract void testConn(LarkInfo info) throws Exception;

    public abstract Boolean isOpen();

    public abstract LarkQrResult getQrParam();

    public abstract LarkUserInfo userInfo(String code, String state);

    public abstract void pushMsg(String userId, String message);

    public abstract void pushOaMsg(String userId, String title, String content, byte[] bytes, List<File> files);
}
